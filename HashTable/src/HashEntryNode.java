/**
 * Created by tuna on 8/10/2016.
 */
public class HashEntryNode {

    private int key;
    private String value;
    public HashEntryNode next;

    public HashEntryNode(int key, String value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public int getKey(){
        return key;
    }

    public String getValue(){
        return value;
    }

}
