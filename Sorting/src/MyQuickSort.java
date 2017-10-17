/**
 * Created by tuna on 8/16/2016.
 */
public class MyQuickSort {

    public MyQuickSort(){}

    public int partition(int[] array, int start, int end, String sorting){
        int pivot = array[end];
        int pivotIndex = start - 1;
        for(int i = start; i < end; i++){
            //if found element less than pivot, swap i and pivotIndex
            if(array[i] < pivot){
                pivotIndex++;
                int temp = array[pivotIndex];
                array[pivotIndex] = array[i];
                array[i] = temp;
            }
        }
        //true pivot index
        pivotIndex++;
        insertPivot(array, pivotIndex, pivot, end);

        System.out.println("sorting: " + sorting);
        System.out.println("pivot: " + pivot);
        System.out.println("start: " + start);
        System.out.println("end: " + end);
        System.out.println("partition: " + java.util.Arrays.toString(array));
        System.out.println("---------------------------------");

        return pivotIndex;
    }

    public void insertPivot(int[] array, int pivotIndex, int pivot, int end){
        for(int i = end; i > pivotIndex; i--){
            array[i] = array[i-1];
        }
        array[pivotIndex] = pivot;
    }

    public int[] sort(int[] array, int start, int end, String sorting){
        //when start == end, only 1 element left in sub array, everything is sorted.
        if(start >= end){
            return array;
        }
        int pivotIndex = partition(array,start,end, sorting);
        sort(array,start,pivotIndex-1, "left sort");
        sort(array,pivotIndex+1,end, "right sort");
        return array;
    }

}