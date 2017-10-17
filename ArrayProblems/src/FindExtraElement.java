/**
 * Created by tuna on 11/16/2016.
 */
public class FindExtraElement {

    public int getExtraElement(int[] arr1, int[] arr2){
        int [] freq;
        if(arr1.length < arr2.length){
            freq = 	buildFreqArray(arr1);
            return getExtra(freq, arr2);
        }
        else{
            freq = buildFreqArray(arr2);
            return getExtra(freq, arr1);
        }
    }

    private int[] buildFreqArray(int[] arr){
        int [] freq = new int[128];
        int val;
        for(int i = 0; i < arr.length; i++){
            val = (char)arr[i];
            freq[val] = ++freq[val];
        }
        return freq;
    }

    private int getExtra(int[]freq, int[] longerArray){
        int val;
        for(int i = 0; i < longerArray.length; i++){
            val = (char) longerArray[i];
            freq[val] = --freq[val];
            if(freq[val] < 0){
                return longerArray[i];
            }
        }

        return Integer.MAX_VALUE;
    }
}
