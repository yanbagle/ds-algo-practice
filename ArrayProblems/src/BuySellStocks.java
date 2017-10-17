
/**
 * Created by tuna on 2/19/2017.
 */
public class BuySellStocks {

    public int bestProfit(int [] array){
        if(array == null || array.length == 0){
            return 0;
        }

        int min = array[0];
        int bestProfit = 0;

        for(int i = 1; i < array.length; i++){
            bestProfit = Math.max(bestProfit, array[i] - min);
            min = Math.min(min, array[i]);
        }

        return bestProfit;
    }
}
