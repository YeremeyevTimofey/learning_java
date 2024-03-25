package lambda_expressions.java_util_function;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Predicate(Утверждение) - интерфейс, имеюющий методы, такие как: test(), negate(), and(), or(). Удобен для фильтрации
 * элменетов, а так же с методов removeIf()
 */
public class PredicateInterface {
    public static void main(String[] args) {
        PredicateUser user1 = new PredicateUser("TimaYeremeyev", "addWeight", 20);
        PredicateUser user2 = new PredicateUser("VladProkopov", "loseWeight", 28);
        PredicateUser user3 = new PredicateUser("OksanaProkopova", "loseWeight", 26);
        PredicateUser user4 = new PredicateUser("MarkArbuzov", "saveWeight", 21);
        PredicateUser user5 = new PredicateUser("KatyaKuznetsova", "addWeight", 24);

        ArrayList<PredicateUser> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        Predicate<PredicateUser> ageFilter = user -> user.age > 21;
        Predicate<PredicateUser> enemyFilter = user -> user.enemy == "addWeight";
        System.out.println("Age more than 21 users: ");
        PredicateUser.update(userList, ageFilter);
        System.out.println("'addWeight' enemy users: ");
        PredicateUser.update(userList, enemyFilter);
        System.out.println("Age non more than 21 users;");
        PredicateUser.update(userList, ageFilter.negate());
        System.out.println("Age more than 21 or 'addWeight' enemy");
        PredicateUser.update(userList, enemyFilter.or(ageFilter));
        System.out.println("Age more than 21 and 'addWeight' enemy");
        PredicateUser.update(userList, enemyFilter.and(ageFilter));

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Employee");
        list.add("Join");
        list.add("Ghost");
        list.add("Buy");

        list.removeIf(element -> element.length() < 5);

        Predicate<String> p = element1 -> element1.length() < 5;
        System.out.println(list);
    }

    static class PredicateUser {
        String username;
        String enemy;
        int age;

        @Override
        public String toString() {
            return "PredicateUser{" +
                    "username='" + username + '\'' +
                    ", enemy='" + enemy + '\'' +
                    ", age=" + age +
                    '}';
        }

        public PredicateUser(String username, String enemy, int age) {
            this.username = username;
            this.enemy = enemy;
            this.age = age;
        }

        public static void update(ArrayList<PredicateUser> userList, Predicate<PredicateUser> filter) {
            for (PredicateUser user : userList) {
                if (filter.test(user)) System.out.println(user);
            }
        }
    }
}
