package collection.list_interface;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    /**
     * LinkedList(Связный список) - класс реализующий интерфейс List, Cloneable, Deque. Является представителем
     * двунаправленного списка, где каждый элемент имеет ссылку на предыдущий и следующий элемент. Вся работа LinkedList
     * сводится к изменению ссылок.
     */
    public static void main(String[] args) {
        List<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(3);
        integerLinkedList.add(5);
        integerLinkedList.add(4);

        System.out.println(integerLinkedList);

        List<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("String1");
        stringLinkedList.add("String5");
        stringLinkedList.add("String3");
        stringLinkedList.add("String4");

        for (String s : stringLinkedList) System.out.println("LinkedList object is: " + s);


    }
}
