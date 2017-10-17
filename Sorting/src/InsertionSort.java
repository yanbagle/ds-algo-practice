/**
 * Created by tuna on 8/12/2016.
 */
public class InsertionSort {

    public InsertionSort(){

    }

    public int[] sort(int [] array){
        for(int i = 1; i < array.length; i++){
            for(int j = i; j > 0; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }


}
