package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipants(T participant) {
        participants.add(participant);
        System.out.println("Added new participant with name:" + participant.getName() + " and age:" + participant.getAge());
    }

    public String playGame(Team<T> team) {
        Random random = new Random();
        int i = random.nextInt(2);

        if (i == 0)return "Winner is:" + team.name;
        else return "Winner is:" + this.name;

    }
}
