package lambda_expressions.java_util_function;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args) {
        ArrayList<Car> ourCars = Car.createCarList(
                () -> new Car("Nissan Tiida", "Black", 1.6)
        );
        System.out.println(ourCars);
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

        public static ArrayList<Car> createCarList(Supplier<Car> carSupplier) {
            ArrayList<Car> al = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                al.add(carSupplier.get());
            }
            return al;
        }
    }
}
