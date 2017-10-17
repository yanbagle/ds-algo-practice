/**
 * Created by tuna on 8/24/2016.
 */
public class MergeSort {

    public int[] array;
    public int[] tempArray;

    public MergeSort(){}

    public void sort(int[] unsorted){
        this.array = unsorted;
        this.tempArray = new int[this.array.length];
        mergeSort(0, array.length-1);

        for(int ele : array){
            System.out.print(ele + ", ");
        }
    }

    public void mergeSort(int low, int high){
        if(low < high){
            int middle = (low+high)/2;
            mergeSort(low,middle);
            mergeSort(middle+1,high);
            merge(low,middle,high);
        }
    }

    public void merge(int low, int middle, int high){

        for(int i = low; i <= high; i++){
            tempArray[i] = array[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while(i <= middle && j <= high){
            if(tempArray[i] < tempArray[j]){
                array[k] = tempArray[i];
                i++;
            }
            else{
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        //elements remaining in the left sub array, move it into the sorted array
        while(i <= middle){
            array[k] = tempArray[i];
            i++;
            k++;
        }
    }
}
