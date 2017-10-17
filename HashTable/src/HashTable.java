import java.util.ArrayList;
import java.util.Random;

/**
 * Created by tuna on 8/4/2016.
 */
public class HashTable {

    private int size = 100;
    private HashEntry[] hashTable = new HashEntry[size];
    private ArrayList<Integer> keys = new ArrayList<Integer>();

    public HashTable(){
        for(int i = 0; i < size; i++){
            hashTable[i] = null;
        }
    }

    public String get(int key){
        int hash = getHash(key);
        while(hashTable[hash] != null && hashTable[hash].getKey() != key){
            hash = reCalulateHash(hash);
        }
        if(hashTable[hash] == null){
            return "it's null!";
        }
        return hashTable[hash].getValue();
    }

    public void put(int key, String value){
        int hash = getHash(key);
        while(hashTable[hash] != null){
            System.out.println("collision!");
            hash = reCalulateHash(hash);
        }
        hashTable[hash] = new HashEntry(key,value);
        keys.add(hash);
    }

    public String getRandom(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(keys.size());
        int hash = keys.get(randomIndex);
        return hashTable[hash].getValue();
    }

    public String delete(int key){
        int hash = getHash(key);
        while(hashTable[hash] != null && hashTable[hash].getKey() != key){
            hash = reCalulateHash(hash);
        }
        String val = hashTable[hash].getValue();
        hashTable[hash].setKey(Integer.MIN_VALUE);
        hashTable[hash].setValue(null);

        return val;
    }

    private int getHash(int key){
        return key % size;
    }

    private int reCalulateHash(int hash){
        return (hash + 1) % size;
    }

}
