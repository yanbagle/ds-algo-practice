import java.util.Random;

/**
 * Created by tuna on 11/12/2016.
 */
public class Player {

    public String playerID;
    private Move currentMove;
    private int wins;
    private int numberOfMoves;
    private Random rand;

    public Player(String name){
        playerID = name;
        rand = new Random();
        wins = 0;
        numberOfMoves = 3;
        currentMove = Move.INVALID;
    }

    public int getWins(){
        return wins;
    }
    public void setWins(int wins){
        this.wins = wins;
    }

    //human player making move
    public Move makeMove(String playerMove){
        currentMove = Move.OBJ.parseMove(playerMove);
        return currentMove;
    }
    //randomly generated move
    public Move makeMove(){
        int r = rand.nextInt(numberOfMoves);
        currentMove = Move.values()[r];
        return Move.values()[r];
    }

    public Move getCurrentMove(){
        return currentMove;
    }
}
