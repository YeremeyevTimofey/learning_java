package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        /**
         * - Цель создания generics заключается в строгой типизации объектов(Type safe) + это в разы сокращает кодовую базу(Reusable code)
         * - Создание объектов коллекций без указания типа будет называться RowType или же сырой тип.
         * - Помечаются так называемым diamond символом(<>)
      */
        List rowTypeList = new ArrayList();
        rowTypeList.add("String");
        rowTypeList.add(1);
        rowTypeList.add(1.1);
        rowTypeList.add('c');
        rowTypeList.add(new Car());

        List<String> list = new ArrayList<>();
        list.add("String");
        list.add("String2");
        list.add("String33");

        for (String o : list) {
            System.out.println(o + " length is "+ o.length());
        }
    }
    static class Car {

    }
}


