package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    /**
     * - Идея wildCard<?> заключается в неопределенности типа на данном объекте. Как и с обычным параметром, тут возможно
     * указание отправной точки (List<? extends Number>) для установки старшего объекта возможного типа данных.
     *  Может удобно использоваться для формирования нужного типа данных в параметрах метода.
     * - Одна из особенностей дженериков это TypeSafe, именно поэтому мы не можем присвоенному типу List<?> добавить
     * элементы, так как компилятор не точно не знает, какой тип элеиента находится в листе.
     */
    public static void main(String[] args) {
//        List<?> wildCardList = new ArrayList<>();
//        wildCardList.add("String");
//        wildCardList.add(123);
//        wildCardList.add('A');

        List list = new ArrayList();
        list.add("String");
        list.add(new WildCardsTesting());
        list.add(123);

        new WildCardsTesting().wildCardList(list);

        List<Number> doubleList = new ArrayList<>();
        doubleList.add(3.23);
        doubleList.add(3.12);
        doubleList.add(3.65);
        System.out.println(WildCardsTesting.summ(doubleList));
    }
}

class WildCardsTesting {
    public void wildCardList(List<?> ai) {
        System.out.println(ai);
    }

    public static double summ(List<? extends Number> al) {
        double summ = 0;
        for (Number n: al) summ += n.doubleValue();
        return summ;
    }
}
