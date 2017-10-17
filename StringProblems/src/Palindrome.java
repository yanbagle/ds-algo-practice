/**
 * Created by tuna on 9/11/2016.
 */
public class Palindrome {

    public boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) == ' '){
                left++;
            }
            if(str.charAt(right) == ' '){
                right--;
            }
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
