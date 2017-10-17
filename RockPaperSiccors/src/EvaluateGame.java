/**
 * Created by tuna on 11/12/2016.
 */
public class EvaluateGame {

    private WinningCombinations chart;

    public EvaluateGame(){
        chart = new WinningCombinations();
    }

    public Player getWinner(Player p1, Player p2){
        int status = chart.getStatus(p1.getCurrentMove().ordinal(),p2.getCurrentMove().ordinal());
        if(status == 1){
            p2.setWins(p2.getWins()+1);
            return p2;
        }
        else if(status == -1){
            p1.setWins(p1.getWins()+1);
            return p1;
        }
        else{
            return null;
        }
    }
}
