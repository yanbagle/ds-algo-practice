import java.util.Arrays;

/**
 * Created by tuna on 12/6/2016.
 */
public class TwoSumTarget {

    public class Pair{
        int a;
        int b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }

    public Pair getPairSum(int [] arr, int target){
        Arrays.sort(arr);
        int start, end, mid, arrTarget;

        for(int i = 0; i < arr.length; i++){
            arrTarget = target - arr[i];
            start = 0;
            end = arr.length;
            while(start < end){
                mid = (start + end) / 2;
                if(arr[mid] == arrTarget){
                    return new Pair(arr[mid], arr[i]);
                }
                else if(arrTarget < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return null;

    }


}
