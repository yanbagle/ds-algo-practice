package main.ItemFile;

import main.FileParser.FileParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ItemTable {

    /*
    ItemTable reads from the mock item file (main.ItemFile.txt in text_files).
    It will construct a hash map of items with the key value pair being the item's
    name and category respectively.
    */

    private String itemFileName;
    private Map<String, ItemCategory> itemsFromFile = new HashMap<String,ItemCategory>();

    public ItemTable(){
        itemFileName = "ItemFile.txt";
        constructTable();
    }

    public Map getItemTable(){
        return itemsFromFile;
    }

    //check if the item exists in our item file
    public boolean contains(String itemName){
        return itemsFromFile.containsKey(itemName);
    }

    //gets the ItemCategory based on item's name
    public ItemCategory get(String key){
        return itemsFromFile.get(key);
    }

    private void constructTable(){
        FileParser fileParser = new FileParser();
        //gets string from item file which contains the items and its categories
        StringBuilder sb = fileParser.getStringFromFile(itemFileName);
        Scanner scan = new Scanner(sb.toString());
        int count = 0;

        //skip the first 6 lines, they are comments
        while (scan.hasNextLine() && count < 6){
            scan.nextLine();
            count++;
        }

        //line[0] is always the item name
        //line[1] is the item's category
        while (scan.hasNextLine()){
            String [] line = scan.nextLine().split(", ");
            itemsFromFile.put(line[0], ItemCategory.fromString(line[1]));
        }

    }

}
