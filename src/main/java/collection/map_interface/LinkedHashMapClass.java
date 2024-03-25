package collection.map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    /**
     *  LinkedHashMap это класс наследующийся от HashMap, с возможностью хранения информации о порядке добавления или
     *  использования элментов. В зависимости от выбранного конструктора, при создании объекта определяется параметр
     *  boolean = accessOrder(true = учитывать порядок использования элментов, false = не учитывать). По стандарту
     *  создается массив из 16 элементов(buckets) с последующим присвоением туда двусвязных списков. При добавлении
     *  элемента вызывается метод createEntry(hash, key, value, bucketIndex), там происходит инициализация всех полей
     *  и переопределение ссылок двусвязного списка на предыдущий и следующий элемент Entry. Поэтому скорость O(n)
     *  уступает HashMap. Понадобится чуть больше памяти для хранения связей, в остальном, все как у родителя.
     */
    public static void main(String[] args) {
        Map<Tree, String> location = new LinkedHashMap<>(16, 0.75f, true);
        Tree tree1 = new Tree("Dub", 67);
        Tree tree2 = new Tree("Bereza", 23);
        Tree tree3 = new Tree("Osina", 44);
        Tree tree4 = new Tree("Yablonya", 54);
        location.put(tree1, "Park");
        location.put(tree2, "Main Street");
        location.put(tree4, "Factory Area");
        location.put(tree3, "Military Area");
        location.get(tree2);
        for (Map.Entry<Tree, String> locationEntry: location.entrySet()) {
            System.out.println("Key is: " + locationEntry.getKey() + "\nValue is :" + locationEntry.getValue());
            System.out.println();
        }
    }

    static class Tree implements Comparable<Tree>{
        protected String name;
        protected int age;

        public Tree(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Tree {" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


        @Override
        public int compareTo(Tree o) {
            return o.age - this.age;
        }
    }
}

