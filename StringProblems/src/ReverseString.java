/**
 * Created by tuna on 8/4/2016.
 */
public class ReverseString {

    public ReverseString(){
    }

    public String reverse(String s){
        return reverse(s, s.length()-1);
        //return reverseNoRec(s);
    }

    public String reverse(String s, int index){
        if(s == null){
            throw new IllegalArgumentException();
        }

        if(index == 0){
            return s.charAt(index) + "";
        }
        char c = s.charAt(index);
        return c + reverse(s, --index);
    }

    public String reverseNoRec(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public void reverseCharArray(char [] str){
        int i = 0;
        int j = str.length-1;
        char[] reversedStr = new char[str.length];

        while(i < j){
            char temp = str[i];
            reversedStr[i] = str[j];
            reversedStr[j] = temp;
            i++;
            j--;
        }

        System.out.println(String.copyValueOf(reversedStr));
    }


}
