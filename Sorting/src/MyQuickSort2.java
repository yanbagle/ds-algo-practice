/**
 * Created by tuna on 8/16/2016.
 */
public class MyQuickSort2 {

    public MyQuickSort2(){}

    public int partition(int[] array, int left, int right){
        int temp;
        int i = left;
        int j = right;
        int pivot = array[(left+right)/2];

        while(i <= j){
            while(array[i] < pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i <= j){
                //swap
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        return i;
    }

    public int[] sort(int[] array, int left, int right){
        int pivotIndex = partition(array,left,right);
        if(left < pivotIndex - 1){
            sort(array,left,pivotIndex-1);
        }
        if(pivotIndex < right){
            sort(array,pivotIndex,right);
        }
        return array;

    }

}