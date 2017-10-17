package main.Tax;

import main.Item.Item;
import main.ItemFile.ItemCategory;

public class TaxRules {
    public TaxRules(){}

    public boolean isTaxExempt(Item item){
        if(ItemCategory.fromItemName(item.getName()).equals(ItemCategory.BOOK) ||
                ItemCategory.fromItemName(item.getName()).equals(ItemCategory.FOOD) ||
                ItemCategory.fromItemName(item.getName()).equals(ItemCategory.MEDICAL)){
            return true;
        }
        return false;
    }


}
