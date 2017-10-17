package main.Sales;

import main.Item.ItemBasket;
import main.Item.Item;
import main.Tax.TaxCalculator;
import main.Util.Round;

import java.math.BigDecimal;

/*
* Calculates sales total on the item level as well as on the basket level
*/
public class SalesTotal {

    Round round;

    public SalesTotal(){
        round = new Round();
    }

    //returns final basket sales total
    public BigDecimal getBasketSaleTotal(ItemBasket basket){
        BigDecimal total = new BigDecimal("0.00");
        for(Item item : basket.getBasket()){
            total = total.add(item.getPriceTotal());
        }
        return round.roundTo2DecPlaces(total);
    }

    //return item's sale total
    public BigDecimal getItemSaleTotal(Item item){
        TaxCalculator taxCalculator = new TaxCalculator();
        BigDecimal tax = taxCalculator.calculateItemTaxTotal(item);
        return round.roundTo2DecPlaces(tax.add(item.getPrice()));
    }
}
