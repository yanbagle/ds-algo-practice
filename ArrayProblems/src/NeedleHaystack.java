/**
 * Created by tuna on 2/12/2017.
 */
public class NeedleHaystack {

    public int getIndexNeedleInHaystack(String haystack, String needle){
        if(haystack == null || needle == null){
            return -1;
        }

        int needleIndex;

        for(int i = 0; i < haystack.length(); i++){
            needleIndex = 0;
            if(needle.length() + i > haystack.length()){
                return -1;
            }
            for(int j = i; j < i + needle.length(); j++){
                if(needle.charAt(needleIndex) == haystack.charAt(j)){
                    needleIndex++;
                    if(needleIndex == needle.length()){
                        return i;
                    }
                }
                else{
                    break;
                }
            }
        }

        return -1;


    }

}
