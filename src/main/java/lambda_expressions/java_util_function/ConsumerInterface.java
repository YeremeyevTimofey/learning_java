package lambda_expressions.java_util_function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer(Потребитель) - интерфейс, имеющий всего один метод aссept(), принимающий объект из параметра. Удобно
 * реализуется с помощью анонимных классов или лямбда-выражения.
 */
public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> list = List.of("element1", "element2", "element3", "element4");
        list.forEach(str -> System.out.println(str + " realizable by consumer interface"));

        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i<3; i++) {
            cars.add(new Car("Tesla model " + i, "black", 5.0));
        }

        Consumer<Car> updatedCar = car -> {
            car.color = "Mayami-blue";
            car.model = "Tesla Cybertruck";
            car.engine = 0.0;
        };

        Car.updateCar(cars.get(0), updatedCar);

    }


    static class Car {
        String model;
        String color;
        double engine;

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", engine=" + engine +
                    '}';
        }

        public Car(String model, String color, double engine) {
            this.model = model;
            this.color = color;
            this.engine = engine;
        }

        public static void updateCar(Car car, Consumer<Car> carConsumer) {
            carConsumer.accept(car);
        }
    }
}

