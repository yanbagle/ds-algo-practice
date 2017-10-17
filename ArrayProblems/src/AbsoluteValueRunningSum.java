/**
 * Created by tuna on 10/17/2016.
 */
public class AbsoluteValueRunningSum {

    public void maxNumAbs(int [] array){
        int elements = 0;
        int [] arr = new int [array.length];
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[i] - array[j] < Math.abs(i - j)){
                    elements += 2;
                    arr[counter++] = array[i];
                    arr[counter++] = array[j];
                }
            }
        }

        for(int e : arr){
            System.out.println(e);
        }
        System.out.println("how many? " + elements);


    }


}
