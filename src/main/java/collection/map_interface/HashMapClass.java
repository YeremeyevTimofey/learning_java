package collection.map_interface;


import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    /**
     *  Объекты HashMap представляют собой неотсортированную пару ключ/значение. В своей основе имеет массив, а
     * элементами данного массива являются структуры LinkedList. Элменты этого массива также называют бакетами.(Buckets)
     * - Не запоминает порядок добавления элементов.
     * - Ключи элементов должны быть уникальны, иначе, элемент будет перезаписан(Если null, помещается на 0 индекс).
     * - Значения элементов могут повторяться(могут быть null).
     * - Доступ к элементам происходит с помощью хэширования, поэтому важно иметь правильно реализованный hashCode.
     * - При правильно реализованном hashCode, лучшая скорость доступа к элементам будет константной O(1) например,
     * когда получен индекс массива с пустой ячейкой и создается первый элемент LinkedList. В ином случае, помимо этого
     * алгоритма, еще приходится проходиться по всем элементам в ячейке для проверки hashCode и возможно, equals эменетов.
     * Если дубликатов не найдено, элменет добавляется в конец LinkedList и сложность будет линейной O(n).
     * - Так как hashCode зависит от множества факторов, рекомендуется использовать immutable объекты для
     * корректной работы метода.
     */
    public static void main(String[] args) {
        Map<Integer, String> mapEx1 = new HashMap<>();
        mapEx1.put(1, "FirstElement");
        mapEx1.put(2, "SecondElement");
        mapEx1.put(3, "ThirdElement");
        mapEx1.put(4, "FoursElement");
        System.out.println(mapEx1);
        System.out.println();

        Map<User, String> userList = new HashMap<>();
        User user1 = new User("TimaYeremeyev", "addWeight", 12);
        User user2 = new User("ShelconogNatalya", "loseWeight", 12);
        User user3 = new User("MaksimSapojnicov", "saveWeight", 12);
        User user4 = new User("ProkopovaOksana", "loseWeight", 12);
        userList.put(user1, "Trainer");
        userList.put(user2, "Girlfriend");
        userList.put(user3, "Developer");
        userList.put(user4, "RichGirl");

// Метод Entry для удобной работы с элементами Map
        for (Map.Entry<User, String> entry: userList.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                    "\n" + "Value: " + entry.getValue() +
                    "\n" + "HashCode: " + entry.hashCode() + "\n");
        }
        System.out.println();
    }

    record User(String username, String enemy, int trainings) {

        @Override
            public String toString() {
                return "User{" +
                        "username='" + username + '\'' +
                        ", enemy='" + enemy + '\'' +
                        ", trainings=" + trainings +
                        '}';
            }
        }

}


