/**
 * Created by tuna on 11/12/2016.
 */
public enum Move {
    ROCK,PAPER,SCISSORS,INVALID,OBJ;

    public Move parseMove(String move){
        switch(move){
            case "s":
                return Move.SCISSORS;
            case "r":
                return Move.ROCK;
            case "p":
                return Move.PAPER;
            default:
                return Move.INVALID;
        }
    }

}
