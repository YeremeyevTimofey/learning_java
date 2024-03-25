package collection.queue_interface;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    /**
     * PriorityQueue - это класс имплементирующий интерфейс queue, сортирующий элементы в натуральном порядке. Приоритет
     * сортировки можно задать самому, посредствам new Comparator в конструкторе или имплементации интерфейса Comparable.
     * Сортровка происходит в процессе использования элементов, поэтому порядок вывода может отличаться.
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> queueInt = new PriorityQueue<>();
        queueInt.add(3);
        queueInt.add(2);
        queueInt.add(4);
        queueInt.add(32);
        queueInt.add(13);
        System.out.println(queueInt.poll());
        System.out.println(queueInt.poll());
        System.out.println(queueInt.poll());
        System.out.println(queueInt.poll());
        System.out.println(queueInt.poll());
        System.out.println();
// Comparable
        PriorityQueue<Student> queueStudent = new PriorityQueue<>();
        queueStudent.add(new Student("Vasya", 1));
        queueStudent.add(new Student("Petya", 5));
        queueStudent.add(new Student("Nasty", 4));
        queueStudent.add(new Student("Maria", 3));
        System.out.println(queueStudent.poll());
        System.out.println(queueStudent.poll());
        System.out.println(queueStudent.poll());
        System.out.println(queueStudent.poll());
        System.out.println();
// Comparator
        PriorityQueue<Student> queueStudent1 = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st2.name.compareTo(st1.name);
            }
        });
        queueStudent1.add(new Student("Vasya", 1));
        queueStudent1.add(new Student("Petya", 5));
        queueStudent1.add(new Student("Nasty", 4));
        queueStudent1.add(new Student("Maria", 3));
        System.out.println(queueStudent1.poll());
        System.out.println(queueStudent1.poll());
        System.out.println(queueStudent1.poll());
        System.out.println(queueStudent1.poll());


    }

    static class Student implements Comparable<Student>{
        String name;
        int course;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return course == student.course && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, course);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
        }

        @Override
        public int compareTo(Student other) {
            return this.course - other.course;
        }
    }
}


