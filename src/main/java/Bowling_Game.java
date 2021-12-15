import java.util.*;

class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //your code goes here
    public void getWinner() {
        String[] arrNames = new String[players.size()];

        arrNames = players.keySet().toArray(arrNames);

        String bestPlayer = arrNames[0];

        int maxScore = players.get(arrNames[0]);

        for (String player : arrNames) {
            if (players.get(player) > maxScore) {
                bestPlayer = player;
                maxScore = players.get(player);
            }
        }System.out.print("Winner: " + bestPlayer);
    }
}

public class Bowling_Game {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and score (like Bob 45)...");
        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
