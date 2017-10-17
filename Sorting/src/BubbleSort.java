/**
 * Created by tuna on 8/13/2016.
 */
public class BubbleSort {

    public BubbleSort(){

    }

    public int[] sort(int[] array){

        for(int i = 0; i < array.length; i++){
            for(int j = array.length-1; j > i; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
