package collection.list_interface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {
    public static void main(String[] args) {
        /**
         * ListIterator = интерфейс
         * Простая реализация метода isPalindrome с помощью ListIterator
         */
        String s = "komok";
        List<Character> list = new LinkedList<>();
        for(char ch: s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        while(iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                System.out.println("Jopa");
                break;
            }
        }
    }
}


