/**
 * Created by tuna on 2/1/2017.
 */
public class LongestPrefix {

    public String getLongestPrefix(String prefix, String[] arr){

        if(arr == null || arr.length == 0){
            return null;
        }

        String smallestStr = arr[0];
        for(String str : arr){
            if(str.length() < smallestStr.length()){
                smallestStr = str;
            }
        }

        for(String str : arr){
            for(int i = smallestStr.length()-1; i >= 0; i--){
                if(smallestStr.charAt(i) != str.charAt(i)){
                    smallestStr = smallestStr.substring(0,i);
                }
            }
        }

        return smallestStr;

    }

}
