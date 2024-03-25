package generics;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        /**
         * Совокупность List<X> не является совместимой с ArrayList<Y>, даже учитывая связь двух классов. Тут вытикает
         * плюс типизации дженериков, заключающийся в том, что такие ошибки выйдут на этапе компиляции.
         * Тоже самое описано примером ниже
         */
//            List<X> xList = new ArrayList<Y>();
//            List<Number> numberList = new ArrayList<Integer>();
//            numberList.add(1);
//            numberList.add(1.1);
    }
    class X {

    }
    class Y extends X {

    }
}
