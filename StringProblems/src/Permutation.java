/**
 * Created by tuna on 9/10/2016.
 */
public class Permutation {

    public String sort(String s){
        char[] charArr = s.toCharArray();
        java.util.Arrays.sort(charArr);
        return new String(charArr);
    }
    public boolean isPermutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public boolean isPermutation2(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[128];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        for(int i = 0; i < t.length(); i++){
            freq[t.charAt(i)]--;
            if(freq[t.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }
}
