/**
 * Created by tuna on 11/5/2016.
 */
public class FormatStringDash {

    public String formatString(String s, int k){
        String noDash = s.replaceAll("-","");
        int firstGroup = noDash.length() % k;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < firstGroup; i++){
            sb.append(noDash.charAt(i));
        }
        if(firstGroup > 0){
            sb.append("-");
        }
        int count = 0;
        for(int i = firstGroup; i < noDash.length(); i++){
            count++;
            sb.append(noDash.charAt(i));
            if(count == k && i != noDash.length() - 1){
                count = 0;
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
