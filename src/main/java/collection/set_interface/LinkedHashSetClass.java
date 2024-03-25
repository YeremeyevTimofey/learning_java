package collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    /**
     * LinkedHashSet имеет главную особенность в хранении элментов в порядке добавления. Наслежуется от класса HashSet
     * поэтому, в своей освнове это HashMap с константой-заглушкой в значении. Производительность методов немного ниже
     * чем у LinkedHashSet, за счет сохранения порядка элментов.
     */

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("FirstElement");
        linkedHashSet.add("SecondElement");
        linkedHashSet.add("PreLastElement");
        linkedHashSet.add("LastElement");

        for (String s: linkedHashSet) {
            System.out.println(s);
        }
        System.out.println();
        linkedHashSet.remove("SecondElement");
        for (String s: linkedHashSet) {
            System.out.println(s);
        }

    }
}
