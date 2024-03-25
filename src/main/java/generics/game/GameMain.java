package generics.game;

import generics.Generics;

public class GameMain {
    /**
     * Наследование параметризованных классов
     * <?> - Любой класс
     * <? extends X> - Класс Х или любой сабкласс
     * <? super X> - Класс Х или любой суперкласс
     */

    public static void main(String[] args) {
        Team<SchoolBoy> schoolarTeam = new Team<>("SchoolBoys");
        Team<Student> studentTeam = new Team<>("StudentBoys");
        Team<Employee> employeeTeam = new Team<>("EmployeeBoys");

        Team<SchoolBoy> schoolarTeam1 = new Team<>("SchoolGirls");
        Team<Student> studentTeam1 = new Team<>("StudentBoys");
        Team<Employee> employeeTeam1 = new Team<>("EmployeeBoys");

        schoolarTeam.addNewParticipants(new SchoolBoy("Dima", 12));
        schoolarTeam.addNewParticipants(new SchoolBoy("Tima", 15));

        studentTeam.addNewParticipants(new Student("Misha", 22));
        studentTeam.addNewParticipants(new Student("Natasha", 21));

        employeeTeam.addNewParticipants(new Employee("Farukh", 32));
        employeeTeam.addNewParticipants(new Employee("Kirill", 42));

        System.out.println(schoolarTeam.playGame(schoolarTeam1));
    }
}
