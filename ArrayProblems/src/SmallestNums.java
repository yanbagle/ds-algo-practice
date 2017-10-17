/**
 * Created by tuna on 10/19/2016.
 */
public class SmallestNums {

    public int[] getSmallestNums(int[] arrA, int[] arrB, int k){
        if(k > arrA.length && k > arrB.length){
            return new int[0];
        }
        int a = 0;
        int b = 0;
        int[] smallest = new int[k];
        for(int i = 0; i < k; i++){
            if(arrA[a] < arrB[b]){
                smallest[i] = arrA[a];
                a++;
            }
            else if(arrB[b] < arrA[a]){
                smallest[i] = arrB[b];
                b++;
            }
            else{
                smallest[i] = arrB[b];
                b++;
            }
        }
        return smallest;
    }
}
