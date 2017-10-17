import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tuna on 11/21/2016.
 */
public class GetPairs {

    public ArrayList<Pairs> get(int[] a, int[] b, int c){
        if(a.length == 0 || b.length == 0){
            return null;
        }
        if(a.length < b.length){
            Arrays.sort(a);
            return calculate(a,b,c);
        }
        else{
            Arrays.sort(b);
            return calculate(b,a,c);
        }
    }

    public ArrayList<Pairs> calculate(int[] shorter, int[] longer, int c){
        int start;
        int end;
        int mid;
        int target;
        ArrayList<Pairs> pairs = new ArrayList<Pairs>();

        for(int i = 0; i < longer.length; i++){
            target = c - longer[i];
            end = shorter.length-1;
            start = 0;
            while(start<end){
                mid = (start+end) / 2;
                if(shorter[mid] == target){
                    for(int j = mid; j >= 0; j--){
                        pairs.add(new Pairs(shorter[j], longer[i]));
                    }
                    break;
                }
                else if(shorter[mid] < target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }

        return pairs;
    }

}
