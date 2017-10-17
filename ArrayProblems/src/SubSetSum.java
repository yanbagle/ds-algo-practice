import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tuna on 10/17/2016.
 */
public class SubSetSum {

    public ArrayList<SubSet> getSubSets(int [] array, int sum){
        Arrays.sort(array);
        ArrayList<SubSet> list = new ArrayList<SubSet>();
        int runningSum;
        for(int i = 0; i < array.length; i++){
            runningSum = 0;
            SubSet set = new SubSet();
            list.add(set);
            for(int j = i; j < array.length; j++){
                runningSum += array[j];
                if(runningSum == sum){
                    set.add(array[j]);
                    break;
                }
                else if(runningSum < sum){
                    set.add(array[j]);
                }
                else{//runningSum > sum
                    runningSum -= array[j];
                }
            }//end j
            if(runningSum != sum || list.get(list.size()-1).size() == 0){
                list.remove(list.size()-1);
            }
        }//end i

        return list;

    }
}
