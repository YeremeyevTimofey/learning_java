package nested_classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *  Static inner class - это вложенный статичный класс внутри основного класса.
 *  - Может содержать только non-static элементы
 *  - Может обращаться даже к private элментам внешнего класса
 *  - Для создания объекта, необходимо создать объект внешнего класса.
 */

class Car implements Comparable<Car> {
    private final String model;
    private final String type;
    private final String wheelType;
    private final int dateOfIssue;
    private final String color;
    private Engine engine = null;

    public Car(String model, String type, String wheelType, int dateOfIssue, String color) {
        this.model = model;
        this.type = type;
        this.wheelType = wheelType;
        this.dateOfIssue = dateOfIssue;
        this.color = color;
    }

    public Car(String model, String type, String wheelType, int dateOfIssue, String color, Engine engine) {
        this.model = model;
        this.type = type;
        this.wheelType = wheelType;
        this.dateOfIssue = dateOfIssue;
        this.color = color;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getEngine() {
        if (this.engine == null) return "\nCar does not have engine";
        else return this.engine.toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", wheelType='" + wheelType + '\'' +
                ", dateOfIssue=" + dateOfIssue +
                ", color=" + color + "}";

    }

    @Override
    public int compareTo(Car other) {
        return dateOfIssue - other.dateOfIssue;
    }

    public final static class Engine {
        private final String type;
        private final String blockMaterial;
        private final int horsePower;
        private final int torque;
        private final int cylinderCount;


        public Engine(String type, String blockMaterial, int horsePower, int torque, int cylinderCount) {
            this.type = type;
            this.blockMaterial = blockMaterial;
            this.horsePower = horsePower;
            this.torque = torque;
            this.cylinderCount = cylinderCount;
        }

        @Override
        public String toString() {
            return "\nEngine{" +
                    "type='" + type + '\'' +
                    ", blockMaterial='" + blockMaterial + '\'' +
                    ", horsePower=" + horsePower +
                    ", torque=" + torque +
                    ", cylinderCount=" + cylinderCount +
                    '}';
        }
    }
}


public class StaticNestedClass {
    public static void main(String[] args) {
        Car volkswagenPolo = new Car(
                "Volkswagen Polo",
                "Sedan",
                "2WD(Front)",
                2019,
                "black"
        );
        Car.Engine benzTSI = new Car.Engine("", "", 23, 23, 5);
        volkswagenPolo.setEngine(benzTSI);

        Car toyotaCamryXV50 = new Car(
                "Toyota Camry",
                "Sedan",
                "2WD(Front)",
                2012,
                "grey",
                new Car.Engine(
                        "Benz",
                        "Aluminium",
                        249,
                        298,
                        6

                )
        );


        Car infinityEx25 = new Car(
                "Infiniti EX",
                "Crossover",
                "4WD",
                2012,
                "white",
                new Car.Engine(
                        "Benz",
                        "Aluminium",
                        222,
                        312,
                        6

                )
        );

        Car landCruiser200 = new Car(
                "Toyota Land Cruiser 200",
                "jeep",
                "4WD",
                2015,
                "black",
                new Car.Engine(
                        "Benz",
                        "Aluminium",
                        250,
                        330,
                        8

                )
        );
        List<Car> carList = new ArrayList<>();
        carList.add(volkswagenPolo);
        carList.add(toyotaCamryXV50);
        carList.add(infinityEx25);
        carList.add(landCruiser200);

        carList.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.compareTo(o2);
            }
        });
        for (Car car : carList) System.out.println(car + car.getEngine()+ "\n\n");
    }
}
