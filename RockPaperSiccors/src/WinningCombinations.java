/**
 * Created by tuna on 11/12/2016.
 */
public class WinningCombinations {

    /*
    +----------+-------+-------+--------+
|          | Rock  | Paper |Scissors|
+----------+-------+-------+--------+
| Rock     |   0   |   1   |   -1   |
| Paper    |  -1   |   0   |    1   |
| Scissors |   1   |  -1   |    0   |
+----------+-------+-------+--------+
    */

    private int[][] winningCombo =
            {{0,1,-1},
            {-1,0,1},
            {1,-1,0}};

    public int getStatus(int x, int y){
        return winningCombo[x][y];
    }
}
