/**
 * Created by tuna on 2/4/2017.
 */
public class SearchInsertPosition {

    public int getIndex(int [] sortedArr, int target){

        int start = 0;
        int end = sortedArr.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(sortedArr[mid] == target){
                return mid;
            }
            else if(target < sortedArr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return start;
    }

}
