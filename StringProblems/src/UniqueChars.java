/**
 * Created by tuna on 9/10/2016.
 */
public class UniqueChars {
    public UniqueChars(){}

    public boolean isUnique(String str){
        if(str.length() > 128){
            return false;
        }

        boolean[] freqArr = new boolean[128];

        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(freqArr[val] == true){
                return false;
            }
            freqArr[val] = true;
        }

        return true;
    }

    public boolean isUnique2(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}



