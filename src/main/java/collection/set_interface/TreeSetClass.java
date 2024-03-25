package collection.set_interface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    /**
     * TreeSet - отсортированная коллекция, наследуется от AbstractSet и  имплементирует NavigableSet. В основе имеет
     * такое же самобалансирующееся двоичное дерево, как и у TreeMap. Есть возможность в конструкторе сразу указать
     * компаратор, так как распределение элементов будет происходить через него.
     * - Хранит уникальные элементы
     * - По стандарту сортирует элменеты в порядке возрастания
     * Двоичное дерево называют черно-красным из за того что, каждый из его узлов содержит дополнительный бит для цвета,
     * что помогает отличить более или менее сбалансированное дерево.
     */
    public static void main(String[] args) {
        Set<SetStudent> studentsSet = new TreeSet<>();
        SetStudent st1 = new SetStudent("Maria", 2);
        SetStudent st2 = new SetStudent("Alyona", 3);
        SetStudent st3 = new SetStudent("Mikhail", 4);
        SetStudent st4 = new SetStudent("Timofey", 1);
        studentsSet.add(st1);
        studentsSet.add(st2);
        studentsSet.add(st3);
        studentsSet.add(st4);

        for (SetStudent st: studentsSet) {
            System.out.println(st);
        }
        System.out.println("Так же есть возможность вызвать итератор:");

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);

        Iterator<Integer> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }





    }

    static class SetStudent implements Comparable<SetStudent> {
        @Override
        public String toString() {
            return "SetStudent{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
        }

        String name;
        int course;

        public SetStudent(String name, int course) {
            this.name = name;
            this.course = course;
        }

        @Override
        public int compareTo(SetStudent o) {
            return this.course - o.course;
        }
    }
}


