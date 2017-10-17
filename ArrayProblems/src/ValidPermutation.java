import java.util.HashSet;

/**
 * Created by tuna on 11/10/2016.
 */
public class ValidPermutation {

    public HashSet permutation(String prefix, String str, HashSet permSet) {
        if (str.length() == 0){
            permSet.add(prefix);
        }
        else {
            for (int i = 0; i < str.length(); i++){
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()), permSet);
            }
        }
        return permSet;
    }
}
