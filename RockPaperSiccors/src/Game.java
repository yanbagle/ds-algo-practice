import java.util.Scanner;

/**
 * Created by tuna on 11/12/2016.
 */
public class Game {
    public static void main(String [] args){
        Scanner reader;
        Player p1 = new Player("you");
        Player p2 = new Player("computer");
        EvaluateGame evaluateGame = new EvaluateGame();

        while(true){
            System.out.println("Rock: 'r' , Scissors: 's' , Paper: 'p'");
            System.out.println("your move: ");
            reader = new Scanner(System.in);

            String playerMove = reader.next();
            while(p1.makeMove(playerMove) == Move.INVALID){
                System.out.println("invalid move, try again: ");
                playerMove = reader.next();
            }

            p2.makeMove();
            System.out.println("p2 move: " + p2.getCurrentMove());

            Player winner = evaluateGame.getWinner(p1,p2);
            if(winner != null){
                System.out.println(winner.playerID + " won!");
            }
            else{
                System.out.println("tie!");
            }

            System.out.println();
            System.out.println(p1.playerID + " score: " + p1.getWins());
            System.out.println(p2.playerID + " score: " + p2.getWins());
            System.out.println();
            System.out.println("------------------------------------------------------");
            System.out.println();


        }


    }
}
