package main.Receipt;

import main.FileParser.FileParser;
import main.Item.Item;
import main.Item.ItemBasket;
import main.Sales.SalesTotal;
import main.Tax.TaxCalculator;

public class ReceiptOrchestrator {

    public ReceiptOrchestrator(){}

    /*
    * Returns a basket of items with their total and taxes calculated
    * FileName tells us which input file we are currently dealing with
    */
    public ItemBasket getOutputBasket(String fileName){

        //for getting user input from file
        FileParser parser = new FileParser();

        //sets up basket instance
        ItemBasket itemBasket = new ItemBasket();

        //sets up our arraylist of items from input
        itemBasket.setBasket(parser.getStringFromFile(fileName));

        //For calculating tax and sales total
        TaxCalculator taxCalculator = new TaxCalculator();
        SalesTotal salesTotal = new SalesTotal();

        //calculates each item's tax total and sales total
        for(Item item : itemBasket.getBasket()){
            item.setTaxTotal(taxCalculator.calculateItemTaxTotal(item));
            item.setPriceTotal(salesTotal.getItemSaleTotal(item));
        }

        //set tax total for entire basket
        itemBasket.setTotalTax(taxCalculator.calculateBasketTaxTotal(itemBasket));

        //set sales total for entire basket
        itemBasket.setTotalSales(salesTotal.getBasketSaleTotal(itemBasket));

        return itemBasket;

    }
}
