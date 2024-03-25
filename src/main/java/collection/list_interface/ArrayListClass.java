package collection.list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> sList = new ArrayList<>();
        sList.add("Mark");
        sList.add("Timofey");
        sList.add("Nastya");
        sList.add("Matvey");
        sList.add("Sergey");

        ArrayList<String> mList = new ArrayList<>();
        mList.add("Georgiy");
        mList.add("Timofey");
        mList.add("Misha");
        mList.add("Maria");
        mList.add("Sergey");



//        for (String s: sList) {
//            System.out.println(s);
//        }
//        System.out.println();
//        for (String s: mList) {
//            System.out.println(s);
//        }

        Iterator<String> itr = sList.iterator();
        while(itr.hasNext()) {
            itr.next();
            itr.remove();
        }

        System.out.println(sList);



        Users natalya = new Users(1, "ShelconogNatalya", "loseWeight", 12);
        Users aleksandr = new Users(2, "Alecsandr", "loseWeight", 12);
        Users natalyaF = new Users(3, "ShelconogNatalya", "loseWeight", 12);
        Users mark = new Users(4, "MarkArbuzov", "loseWeight", 12);

//        ArrayList<Users> users2 = new ArrayList<>();
//        users2.add(mark);
//        users2.add(natalyaF);
//        users2.add(aleksandr);
//
//        ArrayList<Users> users = new ArrayList<>();
//        users.add(aleksandr);
//        users.add(natalyaF);
//        users.add(natalya);
//        System.out.println(users);
//        users.addAll(users2);
//        System.out.println(users);
//        Users natalyaC = new Users(1, "ShelconogNatalya", "loseWeight", 12);


    }
    static class Users {
        private int id;
        private String username;
        private String enemy;
        private int trainings;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Users users = (Users) o;
            return id == users.id && trainings == users.trainings && Objects.equals(username, users.username) && Objects.equals(enemy, users.enemy);
        }


        public Users(int id, String username, String enemy, int trainings) {
            this.id = id;
            this.username = username;
            this.enemy = enemy;
            this.trainings = trainings;
        }

        @Override
        public String toString() {
            return "Users{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", enemy='" + enemy + '\'' +
                    ", trainings=" + trainings +
                    '}';
        }


    }
}

