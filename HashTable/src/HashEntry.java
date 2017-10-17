/**
 * Created by tuna on 8/4/2016.
 */
public class HashEntry {

    private int key;
    private String value;

    public HashEntry(int key, String value){
        this.key = key;
        this.value = value;
    }

    public int getKey(){
        return key;
    }

    public String getValue(){
        return value;
    }

    public void setKey(int key){
        this.key = key;
    }

    public void setValue(String value){
        this.value = value;
    }

}
