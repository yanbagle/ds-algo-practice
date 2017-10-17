import java.util.ArrayList;

/**
 * Created by tuna on 10/17/2016.
 */
public class SubSet {
    public ArrayList<Integer> list;
    public SubSet(){
        list = new ArrayList<Integer>();
    }
    public void add(int ele){
        list.add(ele);
    }
    public int size(){
        return list.size();
    }
    public void clearAll(){
        list.clear();
    }
}
