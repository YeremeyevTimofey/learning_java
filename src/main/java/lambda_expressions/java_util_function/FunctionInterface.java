package lambda_expressions.java_util_function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Function - интерфейс имеющий методы apply(), identify(). Предназначен для работы с разными типами данных.
 */
public class FunctionInterface {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("Toyota Camry", "black", 3.5));
        carArrayList.add(new Car("Volkswagen Golf", "blue", 2.0));
        carArrayList.add(new Car("Toyota Camry", "silver", 2.4));
        carArrayList.add(new Car("Mersedes Benz c coupe AMG", "white", 6.3));
        carArrayList.add(new Car("BMW 7-series 728i", "brown", 3.0));



        Function<Car, Double> function = car -> car.engine;
        double result = Car.findAVG(carArrayList, engine -> engine.engine);
        System.out.println(result);
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

        private static double findAVG(List<Car> carList, Function<Car, Double> fun) {
            double result = 0;
            for (Car car: carList) {
                result += fun.apply(car);
            }
            return result/carList.size();
        }
    }
}
