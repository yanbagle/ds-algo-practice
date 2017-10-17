package main.Item;

import main.ItemFile.ItemCategory;
import main.ItemFile.ItemTable;
import main.Tax.TaxRules;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
* ItemBasket constructs the basket from input text file putting the items in an arraylist
*/
public class ItemBasket {

    private ArrayList<Item> basket;
    private BigDecimal totalTax;
    private BigDecimal totalSales;

    public ItemBasket(){
        basket = new ArrayList<Item>();
        totalTax = new BigDecimal("0.00");
        totalSales = new BigDecimal("0.00");
    }

    public void setTotalTax(BigDecimal totalTax){
        this.totalTax = totalTax;
    }

    public BigDecimal getTotalTax(){
        return totalTax;
    }

    public void setTotalSales(BigDecimal totalSales){
        this.totalSales = totalSales;
    }

    public BigDecimal getTotalSales(){
        return totalSales;
    }

    public ArrayList<Item> getBasket(){
        return basket;
    }

    /*
    creates an arraylist containing all the items in the user inputted basket
    updates each item's fields according to input
    for refactoring, the parsing logic needs to be moved elsewhere
    */
    public void setBasket(StringBuilder userItemList){
        Scanner scan = new Scanner(userItemList.toString());
        TaxRules taxRules = new TaxRules();
        Item item;
        while (scan.hasNextLine()){
            String [] line = scan.nextLine().split(" ");
            //every new line is a new item
            item = new Item();

            //quantity is always at first index
            item.setQuantity(Integer.parseInt(line[0]));

            //check for "imported" keyword
            if(Arrays.asList(line).contains("imported")){
                item.setIsImported(true);
            }

            //set item name
            parseItemName(line, item);

            //find out if item is tax exempt
            if(taxRules.isTaxExempt(item)){
                item.setTaxExempt(true);
            }

            //set the item category
            item.setItemCategory(ItemCategory.fromItemName(item.getName()));

            //price is always at last index
            item.setPrice(new BigDecimal(line[line.length-1]));

            //add item into basket
            basket.add(item);
        }
    }

    private void parseItemName(String [] line, Item item){
        //parse the item name
        int atIndex = -1;
        //The item name shows up right before the "at" in the user input. We need to find this word,
        // and build up our item name backwards.
        for(int i = 1; i < line.length-1; i++){
            if(line[i].equals("at")){
                atIndex = i;
                break;
            }
        }
        StringBuilder itemName = new StringBuilder();
        ItemTable itemFileHashMap = new ItemTable();
        //Concatenating our item name until we are able to validate/find the item by name in our item file hashmap
        if(atIndex != -1){
            for(int i = atIndex - 1; i > 0; i--){
                itemName.insert(0,line[i]);//appending the string to the front of itemName
                //check to see if our item file hash map contains the item
                if(itemFileHashMap.contains(itemName.toString())){
                    item.setName(itemName.toString());
                    break;
                }
                itemName.insert(0," ");
            }
            //set the item's full name, for display/UI purposes
            StringBuilder fullItemName = new StringBuilder();
            String space = "";
            for(int i = 1; i < atIndex; i++){
                fullItemName.append(space);
                fullItemName.append(line[i]);
                space = " ";
            }
            item.setFullName(fullItemName.toString());
        }
    }


}
