package generics;

import java.util.*;

public class TypeErasure {
    /**
     * - При компиляции javac кода параметризация не учитывается и поэтому в еще на этапе проектирования среда
     * разработки предупреждает о невозможности мерегрузки методов имеющих разные дженерики.
     */
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("String1");
        list1.add("String2");
        list1.add("String3");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        Info<Integer> info = new Info<>(1, "First");
        info.showListInfo(list2);
        String name = info.getName();
        int value = info.getValue();
        System.out.println(name + value);

    }
}

class Info <T extends Number> {
    private final T value;
    private final String name;

    public Info(T value, String name) {
        this.value = value;
        this.name = name;
    }

    public void showListInfo(List<T> list) {
        System.out.println("My list contains: " + list);
    }

//    public void showListInfo(List<Integer> list) {
//
//    }

    public T getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}


