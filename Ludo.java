//Ludo
import java.util.*;

class Player {
    int position;
    boolean active;
    int startPos;

    Player(int startPos) {
        this.position = 0;
        this.active = true;
        this.startPos = startPos;
    }
}

public class Ludo {
    static final int GRID_SIZE = 7;
    static List<List<int[]>> paths = new ArrayList<>();

    static {
        paths.add(new ArrayList<>(Arrays.asList(
            new int[]{0, 0}, new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 3}, new int[]{0, 4}, new int[]{0, 5},
            new int[]{1, 5}, new int[]{2, 5}, new int[]{3, 5}, new int[]{4, 5}, new int[]{5, 5},
            new int[]{5, 4}, new int[]{5, 3}, new int[]{5, 2}, new int[]{5, 1}, new int[]{4, 1},
            new int[]{3, 1}, new int[]{2, 1}, new int[]{1, 1}, new int[]{1, 2}, new int[]{1, 3},
            new int[]{1, 4}, new int[]{2, 4}, new int[]{3, 4}, new int[]{4, 4}, new int[]{4, 3},
            new int[]{4, 2}, new int[]{3, 2}, new int[]{2, 2}, new int[]{2, 3}, new int[]{3, 3}
        )));

        paths.add(new ArrayList<>(Arrays.asList(
            new int[]{0, 6}, new int[]{1, 6}, new int[]{2, 6}, new int[]{3, 6}, new int[]{4, 6}, new int[]{5, 6},
            new int[]{5, 5}, new int[]{5, 4}, new int[]{5, 3}, new int[]{5, 2}, new int[]{5, 1},
            new int[]{4, 1}, new int[]{3, 1}, new int[]{2, 1}, new int[]{1, 1}, new int[]{1, 2},
            new int[]{1, 3}, new int[]{1, 4}, new int[]{2, 4}, new int[]{3, 4}, new int[]{4, 4},
            new int[]{4, 3}, new int[]{4, 2}, new int[]{3, 2}, new int[]{2, 2}, new int[]{2, 3}, new int[]{3, 3}
        )));

        paths.add(new ArrayList<>(Arrays.asList(
            new int[]{6, 6}, new int[]{6, 5}, new int[]{6, 4}, new int[]{6, 3}, new int[]{6, 2}, new int[]{6, 1},
            new int[]{5, 1}, new int[]{4, 1}, new int[]{3, 1}, new int[]{2, 1}, new int[]{1, 1},
            new int[]{1, 2}, new int[]{1, 3}, new int[]{1, 4}, new int[]{2, 4}, new int[]{3, 4},
            new int[]{4, 4}, new int[]{4, 3}, new int[]{4, 2}, new int[]{3, 2}, new int[]{2, 2},
            new int[]{2, 3}, new int[]{3, 3}
        )));

        paths.add(new ArrayList<>(Arrays.asList(
            new int[]{6, 0}, new int[]{5, 0}, new int[]{4, 0}, new int[]{3, 0}, new int[]{2, 0}, new int[]{1, 0},
            new int[]{1, 1}, new int[]{1, 2}, new int[]{1, 3}, new int[]{1, 4}, new int[]{2, 4},
            new int[]{3, 4}, new int[]{4, 4}, new int[]{4, 3}, new int[]{4, 2}, new int[]{3, 2},
            new int[]{2, 2}, new int[]{2, 3}, new int[]{3, 3}
        ))); // <- Corrected semicolon added here
    }


    public static int rollDice() {
        return new Random().nextInt(6) + 1;
    }

    public static void movePlayer(Player player, int dice, int playerIndex) {
        int newPosition = player.position + dice;
        if (newPosition < paths.get(playerIndex).size()) {
            player.position = newPosition;
        } else {
            System.out.println("Player " + (playerIndex + 1) + " needs an exact roll to win.");
        }
    }


    public static void checkCollision(Player[] players, int current) {
        for (int i = 0; i < 4; i++) {
            if (i != current && players[i].active) {
                int[] currentPos = paths.get(current).get(players[current].position);
                int[] otherPos = paths.get(i).get(players[i].position);
                if (Arrays.equals(currentPos, otherPos)) {
                    System.out.println("Player " + (i + 1) + " is sent back to start by Player " + (current + 1) + "!");
                    players[i].position = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = {new Player(0), new Player(0), new Player(0), new Player(0)};
        boolean gameOver = false;

        while (!gameOver) {
            for (int i = 0; i < 4; i++) {
                if (!players[i].active) continue;
                
                System.out.print("Player " + (i + 1) + ", enter your dice roll (1-6): ");
                int dice = scanner.nextInt();
                if (dice < 1 || dice > 6) {
                    System.out.println("Invalid input. Please enter a number between 1 and 6.");
                    i--;
                    continue;
                }
                
                System.out.println("Player " + (i + 1) + " rolls: " + dice);
                movePlayer(players[i], dice, i);
                checkCollision(players, i);
                
                if (players[i].position < paths.get(i).size()) {
                    int[] newPos = paths.get(i).get(players[i].position);
                    System.out.println("Player " + (i + 1) + " is now at: (" + newPos[0] + ", " + newPos[1] + ")");
                }
                
                if (players[i].position == paths.get(i).size() - 1) {
                    System.out.println("Player " + (i + 1) + " wins the game!");
                    gameOver = true;
                    break;
                }
            }
        }
        scanner.close();
    }
}