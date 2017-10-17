/**
 * Created by tuna on 12/20/2016.
 */
public class SubStringCount {

    public int countSubString(String s, String subString){
        if(subString.length() > s.length()){
            return -1;
        }

        int count = 0;

        int subStringIndex = 0;
        boolean isSubString;

        for(int i = 0; i < s.length()-subString.length(); i++){
            isSubString = true;
            for(int j = i; j < subString.length(); j++){
                if(s.charAt(j) != subString.charAt(subStringIndex)){
                    isSubString = false;
                }
                subStringIndex++;
            }
            if(isSubString){
                count++;
            }
            subStringIndex = 0;
        }
        return count;

    }


}
