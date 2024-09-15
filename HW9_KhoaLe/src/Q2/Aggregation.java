package Q2;
import java.util.List;
import java.util.ArrayList;

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Team {
    private String name;
    private List<Player> players; // Tập hợp các Player

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Player player1 = new Player("John");
        Player player2 = new Player("Mike");

        Team team = new Team("Team A");
        team.addPlayer(player1);
        team.addPlayer(player2);

        System.out.println("Team name: " + team.getName());
        System.out.println("Players: ");
        for (Player player : team.getPlayers()) {
            System.out.println(player.getName());
        }
    }
}
