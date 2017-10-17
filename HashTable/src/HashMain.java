/**
 * Created by tuna on 8/4/2016.
 */
public class HashMain {
    public static void main(String [] args){

        HashTable hashTable = new HashTable();
        //HashTableChaining hashTable = new HashTableChaining();

        hashTable.put(100, "a");
        hashTable.put(5, "c");
        hashTable.put(85, "d");
        hashTable.put(32, "b");
        hashTable.put(2, "e");

        System.out.println(hashTable.get(100));
        System.out.println(hashTable.get(11));
        System.out.println(hashTable.getRandom());

        System.out.println(hashTable.delete(100));
        System.out.println(hashTable.get(100));


    }
}
