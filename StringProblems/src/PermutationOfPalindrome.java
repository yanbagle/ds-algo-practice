import com.sun.org.apache.regexp.internal.CharacterArrayCharacterIterator;

/**
 * Created by tuna on 9/11/2016.
 */
public class PermutationOfPalindrome {

    public boolean isPermutationOfPalindrome(String str){
        //build frequency array
        int[] freqArr = buildFreqArr(str);
        //check if there's more than one odd count in array
        return checkOddCount(freqArr);
    }

    public int[] buildFreqArr(String str){
        int[] freqArr = new int[26];
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                int value = Character.getNumericValue(str.charAt(i)) - 10;
                freqArr[value]++;
            }
        }
        return freqArr;
    }

    public boolean checkOddCount(int[] arr){
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
            if(oddCount == 2){
                return false;
            }
        }
        return true;
    }
}
