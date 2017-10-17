/**
 * Created by tuna on 11/5/2016.
 */
public class BinarySearch {

    public boolean binarySearch(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start < end){
            mid = (start + end) / 2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;

    }
}
