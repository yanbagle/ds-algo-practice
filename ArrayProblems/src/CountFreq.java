import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;

/**
 * Created by tuna on 11/27/2016.
 */
public class CountFreq {

    public void countChar(String s){
        HashMap<Character,Integer> ht = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(ht.containsKey(c)){
                ht.put(c,ht.get(c)+1);
            }
            else{
                ht.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> entry : ht.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
