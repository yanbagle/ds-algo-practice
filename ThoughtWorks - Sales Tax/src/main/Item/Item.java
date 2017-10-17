package main.Item;

import main.ItemFile.ItemCategory;

import java.math.BigDecimal;

public class Item {
    private String name;
    private String fullName;
    private BigDecimal price;
    private boolean isTaxExempt;
    private boolean isImported;
    private int quantity;
    private ItemCategory category;
    private BigDecimal taxTotal;
    private BigDecimal priceTotal;

    public Item(){}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setTaxExempt(boolean isTaxExempt){
        this.isTaxExempt = isTaxExempt;
    }

    public boolean isTaxExempt(){
        return isTaxExempt;
    }


    public void setIsImported(boolean isImported){
        this.isImported = isImported;
    }

    public boolean isImported(){
        return isImported;
    }


    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }


    public void setItemCategory(ItemCategory category){
        this.category = category;
    }

    public ItemCategory getItemCategory(){
        return category;
    }

    public void setTaxTotal(BigDecimal taxTotal){
        this.taxTotal = taxTotal;
    }

    public BigDecimal getTaxTotal(){
        return taxTotal;
    }

    public void setPriceTotal(BigDecimal priceTotal){
        this.priceTotal = priceTotal;
    }

    public BigDecimal getPriceTotal(){
        return priceTotal;
    }
}
