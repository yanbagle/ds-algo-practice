/**
 * Created by tuna on 10/23/2016.
 */
public class SumInString {

    public int getSumInString(String s){
        StringBuilder sb = new StringBuilder();
        int currentSum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);
            }
            else if(sb.length() != 0){
                currentSum += Integer.valueOf(sb.toString());
                sb.setLength(0);
            }
        }
        return currentSum;
    }
}
