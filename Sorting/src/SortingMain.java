import com.sun.scenario.effect.Merge;

/**
 * Created by tuna on 8/11/2016.
 */
public class SortingMain {
    public static void main(String[] args){

        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        BubbleSort bubbleSort = new BubbleSort();
        MyQuickSort quickSort = new MyQuickSort();
        MyQuickSort2 quickSort2 = new MyQuickSort2();

        int[] array = {10,34,2,56,7,67,88,36,45,12};


        //System.out.println("quick sort: " + java.util.Arrays.toString(quickSort.sort(array, 0, array.length-1, "begin")));
        //System.out.println("quick sort 2: " + java.util.Arrays.toString(quickSort2.sort(array, 0, array.length-1)));
        //System.out.println("selection sort: " + java.util.Arrays.toString(selectionSort.sort(array)));
        //System.out.println("insertion sort: " + java.util.Arrays.toString(insertionSort.sort(array)));
        //System.out.println("bubble sort: " + java.util.Arrays.toString(bubbleSort.sort(array)));

        //MergeSort mergeSort = new MergeSort();
        //mergeSort.sort(array);

        //BinarySearch bs = new BinarySearch();
        //int [] sortedArr = quickSort2.sort(array,0, array.length-1);
        //System.out.println(java.util.Arrays.toString(sortedArr));
        //System.out.println("target's at: " + bs.search(sortedArr,22));

        int k = 3;
        int min = array[0];
        for(int i = 0; i < array.length - k; i++){
            for(int j = i; j < i + k; j++){
                if(array[j] < min){
                    min = array[j];
                }
            }
            System.out.println(min);
            min = array[i];
        }
    }
}
