package collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_interface {
    /**
     * Deque(double ended queue) - двунаправленная очередь. В такой очереди элменты могут использоваться с обоих концов.
     * Это так же интерфейс расширяющий интерфейс Queue, который реализуется классами LinkedList и ArrayDeque.
     * Работают правила FIFO и LIFO, поэтому является неким дополнением обычной очереди и помимо ее методов имеет свои:
     * Throwable:
     * addFirst(), addLast(), getFirst(), getLast(), offerFirst(), offerLast(), pop(), removeFirst(), removeLast()
     * Unthrowable:
     * peekFirst(), peekLast(), pollFirst(), poolLast(), push(), removeFirstOccurrence(), removeLastOccurrence()
     * Таким образом, методы pop и push позовляют реализовывать порядок элементов в качестве стэка(LIFO).
     */
    public static void main(String[] args) {
        Deque<Integer> integers = new ArrayDeque<>();
        integers.addLast(1);
        integers.addFirst(3);
        integers.addLast(6);
        integers.add(2);

        for(Integer s: integers) System.out.println(s);
    }
}
