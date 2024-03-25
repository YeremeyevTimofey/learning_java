package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Interface {
    /**
     * Queue(Очередь) - это структура данных, хранящая последовательность элементов по принципу FIFO(First in - First out).
     * Поэтому в большинстве методов взаимодействие идет с первым элементом списка.
     * В java она представлена в виде интерфейса Queue с методами (element(), offer(), peek(), poll(), remove())
     * LinkedList - класс имплементрующий интерфейсы List, Deque(Queue), Cloneable
     */

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Fist_E");
        queue.add("Second_E");
        queue.add("PreLast_E");
        queue.add("Last_E");

        for (String s : queue) System.out.println(s);
    }
}
