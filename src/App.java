import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("STONE PAPER SCISSOR");

        while (true) {
            //possible moves in the game
            String[] possibleMoves = {"s","p","x"};
            //player's turn
            String playersMove;
            while (true) {
                System.out.println("Enter 's' for stone, 'p' for paper & 'x' for scissor!");
                System.out.println("Enter your move: ");
                playersMove = sc.nextLine();
                if (playersMove.equals("s") || playersMove.equals("p") || playersMove.equals("x")) {
                    break;
                }
                System.out.println(playersMove + " is not a valid move!");
            }
            //computer's turn
            System.out.println("Now, computer's turn");
            String computersMove = possibleMoves[new Random().nextInt(possibleMoves.length)];
            System.out.println("Computer played: "+computersMove);

            if (playersMove.equals(computersMove)) {
                System.out.println("The game is a DRAW!");
            }
            else if (playersMove.equals("s")) {
                if (computersMove.equals("p")) {
                    System.out.println("Computer WINS!");
                }
                else if (computersMove.endsWith("x")) {
                    System.out.println("Player WINS!");
                }
            }
            else if (playersMove.equals("p")) {
                if (computersMove.equals("s")) {
                    System.out.println("Player WINS!");
                }
                else if (computersMove.endsWith("x")) {
                    System.out.println("Computer WINS!");
                }
            }
            else if (playersMove.equals("x")) {
                if (computersMove.equals("s")) {
                    System.out.println("Computer WINS!");
                }
                else if (computersMove.endsWith("p")) {
                    System.out.println("Player WINS!");
                }
            }

            System.out.println("Do you want to play again? (Y/N)");
            String yOrN = sc.nextLine();
            if (yOrN.equals("n") || yOrN.equals("N")) {
                break;
            }
        }
        sc.close();
    }
}
