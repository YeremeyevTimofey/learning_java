package collection.map_interface;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapClass {
    /**
     * TreeMap это класс имплементирующий интерфейсы: Map, NavigableMap, Cloneable. Доступ к элементу просиходит через
     * метод equals, а распределение через интерфейс Comparable или класс Comparator. Хорошей практикой будет
     * переопределение метода equals и hashCode, чтобы методы equals и compareTo возвращали один результат.
     * Главная задача TreeMap работа с данными в структурированном виде(Нахождение отрезков, промежутков, диапазонов).
     * Распределение элементов работает по принципу красно-черного дерева. Принцип его работы очень похож на
     * бинарный поиск элемента в отсортированном массиве.
     * Красно-черное дерево:
     *  1. Нахождение "корня" дерева (Это средний элемент отсортированного массива)
     *  2. Разделение массива на 2 части, где справа меньшие, а слева большие элементы.
     *  3. Нахождение двух вершин(Это средний элемент каждой из частей)
     *  4. Повтор цикла со второго пункта.
     * После того как последние элменты будут найдены, цикл остановится. Такие элементы называют листьями!
     * Так же дерево имеет свойство самобалансироваться, тоесть, при добавлении новых элментов будет найден новый
     * корень, с последующим повтором цикла.
     * Скорость работы такого алгоритма будет O(logN).
     * @param args
     */
    public static void main(String[] args) {
        TreeMap<Double, Person> treeMap = new TreeMap<>();
        Person p1 = new Person("Timofey", "Yeremeyev", 20);
        Person p2 = new Person("Timur", "Kobzev", 34);
        Person p3 = new Person("Dmitriy", "Silivanov", 43);
        Person p4 = new Person("Igor", "Saluzhniy", 54);
        treeMap.put(1.2, p1);
        treeMap.put(0.2, p2);
        treeMap.put(3.2, p3);
        treeMap.put(3.1, p4);
        System.out.println("First example:");
        for (Map.Entry<Double, Person> treeMapEntry: treeMap.entrySet()) {
            System.out.println("Key is: " + treeMapEntry.getKey() + "\nValue is: " + treeMapEntry.getValue());
            System.out.println();
        }

        System.out.println("Second example:");
        TreeMap<Person, String> job = new TreeMap<>();
        job.put(p1, "Personal Trainer");
        job.put(p2, "Personal Trainer");
        job.put(p3, "Factory employer");
        job.put(p4, "Military person");
        for (Map.Entry<Person, String> jobEntry: job.entrySet()) {
            System.out.println("Key is: " + jobEntry.getKey() + "\nValue is :" + jobEntry.getValue());
            System.out.println();
        }

    }

    static class Person implements Comparable<Person>{
        String name;
        String surname;
        int age;

        public Person(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, age);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    '}';
        }
        @Override
        public int compareTo(Person o) {
            return o.age - this.age;
        }
    }
}

