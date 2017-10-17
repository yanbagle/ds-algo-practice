import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by tuna on 1/31/2017.
 */
public class TwoSum {

    public int[] getTwoSum(int sum, int[]array){
        Arrays.sort(array);
        int target;
        int start;
        int end;
        int [] twoSumArr = new int [array.length];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            target = sum - array[i];
            start = 0;
            end = array.length - 1;
            while(start < end){
                int mid = (start + end) / 2;
                if(array[mid] == target && mid != i){
                    twoSumArr[index++] = array[i];
                    twoSumArr[index++] = array[mid];
                    break;
                }
                else if(target < array[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return twoSumArr;
    }

}
