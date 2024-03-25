package lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample2 {

    public static void main(String[] args) {
        User user1 = new User("TimofeyYeremeyev", "male", "addWeight", 20);
        User user2 = new User("ShelconogNatalya", "female", "loseWeight", 27);
        User user3 = new User("AkgmetovAlisher", "male", "loseWeight", 22);
        User user4 = new User("MarkArbuzov", "male", "saveWeight", 21);
        User user5 = new User("VladProkopov", "male", "loseWeight", 28);
        User user6 = new User("OksanaProkopova", "female", "loseWeight", 27);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        System.out.println("----------------------------------------");


        System.out.println("List of users with enemy: loseWeight");
        User.filter(userList, (User u) -> {
            return u.enemy == "loseWeight";
        });

        System.out.println("List of users with gender: male");
        User.filter(userList, u -> {
            return u.gender == "male";
        });

        System.out.println("List of users with age more than 24");
        User.filter(userList, u -> u.age>24);
    }


}

class User {
    String username;
    String gender;
    String enemy;
    int age;

    public User(String username, String gender, String enemy, int age) {
        this.username = username;
        this.gender = gender;
        this.enemy = enemy;
        this.age = age;
        System.out.println("User: " + username + " has been created in database");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", enemy='" + enemy + '\'' +
                ", age=" + age +
                '}';
    }

    public static void filter(List<User> userList, Predicate<User> pr) {
        for(User u: userList) if(pr.test(u)) System.out.println(u);;

    }

}

