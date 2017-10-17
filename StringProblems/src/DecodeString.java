import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by tuna on 11/28/2016.
 */
public class DecodeString {

    public String decode(String s){
        String currentString = "";
        Stack<Integer> freq = new Stack<Integer>();
        Stack<String> currStringStack = new Stack<String>();
        int i = 0;
        while(i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                int num = 0;
                while(Character.isDigit(s.charAt(i))){
                    num = num*10 + (s.charAt(i)-'0');
                    i++;
                }
                freq.push(num);
            }
            else if(s.charAt(i) == '['){
                currStringStack.push(currentString);
                currentString = "";
                i++;
            }
            else if(s.charAt(i) == ']'){
                StringBuilder sb = new StringBuilder();
                sb.append(currStringStack.pop());
                int count = freq.pop();
                while(count > 0){
                    count--;
                    sb.append(currentString);
                }
                currentString = sb.toString();
                i++;
            }
            else{
                currentString += s.charAt(i);
                i++;
            }
        }

        return currentString;

    }
}
