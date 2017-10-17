/**
 * Created by tuna on 12/5/2016.
 */
public class MergeTwoSorted {

    public int[] mergeArrays2(int [] arr1, int [] arr2){
        int [] mergedArray = new int [arr1.length + arr2.length];
        int mergedIndex = 0;
        int arr1Index = 0;
        int arr2Index = 0;

        while(arr1Index < arr1.length && arr2Index < arr2.length){
            if(arr1[arr1Index] < arr2[arr2Index]){
                mergedArray[mergedIndex++] = arr1[arr1Index++];
            }
            else{
                mergedArray[mergedIndex++] = arr2[arr2Index++];
            }
        }

        if(arr1Index < arr1.length){
            mergedArray[mergedIndex++] = arr1[arr1Index++];
        }
        else if(arr2Index < arr2.length){
            mergedArray[mergedIndex++] = arr2[arr2Index++];
        }

        return mergedArray;
    }

    public int[] mergeArrays(int [] arr1, int [] arr2){
        int [] mergedArray = new int [arr1.length+arr2.length];
        int mergedIndex = (arr1.length + arr2.length) - 1;
        int arr1Index = arr1.length - 1;
        int arr2Index = arr2.length - 1;
        while(arr1Index >= 0 && arr2Index >= 0){
            if(arr1[arr1Index] > arr2[arr2Index]){
                mergedArray[mergedIndex] = arr1[arr1Index];
                arr1Index--;
            }
            else{
                mergedArray[mergedIndex] = arr2[arr2Index];
                arr2Index--;
            }
            mergedIndex--;
        }

        while(arr1Index >= 0){
            mergedArray[mergedIndex] = arr1[arr1Index];
            arr1Index--;
            mergedIndex--;
        }

        while(arr2Index >= 0){
            mergedArray[mergedIndex] = arr2[arr2Index];
            arr2Index--;
            mergedIndex--;
        }

        return mergedArray;

    }




}
