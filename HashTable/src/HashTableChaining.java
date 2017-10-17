/**
 * Created by tuna on 8/10/2016.
 */
public class HashTableChaining {

    private int size = 100;
    private HashEntryNode[] ht = new HashEntryNode[size];
    private int[] keys = new int[size];

    public HashTableChaining(){
        for(int i = 0; i < size; i++){
            ht[i] = null;
        }
    }

    public String get(int key){
        int hash = getHash(key);
        HashEntryNode current = ht[hash];
        if(current != null){
            if(current.getKey() == key){
                return current.getValue();
            }
            else{
                while(current.getKey() != key && current.next != null){
                    current = current.next;
                }
                if(current.getKey() == key){
                    return current.getValue();
                }
            }
        }
        return null;
    }

    public void put(int key, String value){
        int hash = getHash(key);
        HashEntryNode current = ht[hash];
        if(current == null){
            ht[hash] = new HashEntryNode(key,value);
        }
        else{
            while(current != null && current.next != null){
                current = current.next;
            }
            current.next = new HashEntryNode(key,value);
        }
    }

    private int getHash(int key){
        return key % size;
    }
}
