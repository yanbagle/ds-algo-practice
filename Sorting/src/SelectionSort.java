public class SelectionSort {

    public SelectionSort(){

    }

    /*
    public int[] sort(int[] array){
        int smallest;
        int smallestIndex;
        for(int i = 0; i < array.length; i++){
            smallest = array[i];
            smallestIndex = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < smallest){
                    smallestIndex = j;
                    smallest = array[j];
                }
            }
            array[smallestIndex] = array[i];
            array[i] = smallest;
            System.out.println(java.util.Arrays.toString(array));
        }
        return array;
    }
    */

    public int[] sort(int[] array){
        int smallest;
        int smallestIndex;
        for(int i = 0; i < array.length; i++){
            smallest = array[i];
            smallestIndex = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < smallest){
                    smallest = array[j];
                    smallestIndex = j;
                }
            }
            array[smallestIndex] = array[i];
            array[i] = smallest;
        }
        return array;
    }

}
