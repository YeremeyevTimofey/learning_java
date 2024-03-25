package generics;

public class ParameterizedClass {
    /**
     * - При написании параметризированного класса, необходимо указать TypePlaceHolder в diamond скобках, тем самым
     *   формируем шаблон взаимодействия с тем или иным типом данных. (Как например String в классе Pair)
     *   Формирорвание TypePlaceHolder в классе происходит с помощью наследования.
     *   (T extends Number), (T super Number), (T extends Number&Interface), (T extends Number&Interface&Interface1)
     */
    public static void main(String[] args) {
        Info<String> infoString = new Info<>("Timofey");
        System.out.println(infoString);

        Info<Integer> infoInt = new Info<>(111);
        System.out.println(infoInt);

        Info<Car> infoCar = new Info<>(new Car("Infiniti"));
        System.out.println(infoCar);

        Pair<Integer> decremental = new Pair<>(3, 2);
        int i = decremental.getFirstValue();
        int j = decremental.getSecondValue();
        System.out.println(i + j);
    }


    static class Info<T> {
        private final T value;

        public Info(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "value=" + value +
                    '}';
        }
    }

    static class Car{
        String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Pair<V1 extends Number> {
        private V1 value1;
        private V1 value2;

        public Pair(V1 value1, V1 value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public V1 getFirstValue() {
            return value1;
        }

        public V1 getSecondValue() {
            return value2;
        }


    }
}


