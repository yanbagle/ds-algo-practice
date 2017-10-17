import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by tuna on 10/14/2016.
 */

public class SumPairs {

    public ArrayList<Pairs> getSumPairs(int[] array, int sum){
        ArrayList<Pairs> pairs = new ArrayList<Pairs>();
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int freq = 0;
        for(int i = 0; i < array.length; i++){
            if(hmap.get(array[i]) == null){
                freq = 1;
            }
            else{
                freq = hmap.get(array[i]) + 1;
            }
            hmap.put(array[i], freq);
        }
        for(int i = 0; i < array.length; i++){
            int diff = sum - array[i];
            if(hmap.get(diff) != null){
                int freqA = hmap.get(diff);
                int freqB = hmap.get(array[i]);
                if(freqA > 0 && freqB > 0){
                    hmap.put(array[i], --freqB);
                    if(array[i] == diff){
                        freqA = freqB-1;
                    }
                    hmap.put(diff,--freqA);
                    pairs.add(new Pairs(array[i], diff));
                }
            }
        }
        return pairs;
    }

    public ArrayList<Pairs> getSumPairs2(int[]array,int sum){
        ArrayList<Pairs> pairs = new ArrayList<Pairs>();
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;

        while(left < right){
            int currSum = array[left] + array[right];
            if(currSum == sum){
                pairs.add(new Pairs(array[left],array[right]));
                left++;
                right--;
            }
            else if(currSum < sum){
                left++;
            }
            else{
                right--;
            }
        }

        return pairs;
    }
}
