package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    /**
     * - Как и с классом при создании параметризованного метода в diamond скобках указывается TypePlaceHolder. В типе
     *   возращающего значения указывается тот же Т , поэтому работу такого метода рекомендуется подстроить под все типы.
     */
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("String1");
        stringList.add("String2");
        stringList.add("String3");
        String s = Method.getSecondElement(stringList);
        System.out.println(s);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        int i = Method.getSecondElement(intList);
        System.out.println(i);
    }

    static class Method{
        public static <T> T getSecondElement(ArrayList<T> list) {
            return list.get(1);
        }
    }
}
