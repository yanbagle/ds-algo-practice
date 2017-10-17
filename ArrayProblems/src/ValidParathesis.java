import java.util.HashMap;
import java.util.Stack;

/**
 * Created by tuna on 2/2/2017.
 */
public class ValidParathesis {

    public boolean isValid(String str){
        HashMap<Character,Character> valid = new HashMap<Character,Character>();
        valid.put('(',')');
        valid.put('{','}');
        valid.put('[',']');

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(valid.keySet().contains(c)){//open parentheses
                stack.push(c);
            }
            else if(valid.values().contains(c)){//closed parentheses
                if(!stack.isEmpty() && valid.get(stack.peek()) == c){
                    stack.pop();
                }
                else{
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
}
