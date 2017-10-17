package main.Tax;

import main.Item.Item;
import main.Item.ItemBasket;
import main.Util.Round;

import java.math.BigDecimal;

/*
* Calculates tax on the item level as well as on the basket level
*/
public class TaxCalculator {

    Round round;

    public TaxCalculator(){
        round = new Round();
    }

    private BigDecimal getImportedItemTax(Item item){
        return TaxRate.IMPORTED.getTaxRate().multiply(item.getPrice());
    }

    private BigDecimal getGeneralItemTax(Item item){
        return TaxRate.GENERAL.getTaxRate().multiply(item.getPrice());
    }

    //calculates tax on an item
    public BigDecimal calculateItemTaxTotal(Item item){
        BigDecimal totalTax = new BigDecimal("0.00");
        if(item.isImported()){
            totalTax = totalTax.add(getImportedItemTax(item));
        }
        if(!item.isTaxExempt()){
            totalTax = totalTax.add(getGeneralItemTax(item));
        }
        BigDecimal taxRounded = round.roundToNearestFiveCent(totalTax);
        return round.roundTo2DecPlaces(taxRounded);
    }

    //get tax total of entire basket
    public BigDecimal calculateBasketTaxTotal(ItemBasket basket){
        BigDecimal basketTaxTotal = new BigDecimal("0.00");
        for(Item item : basket.getBasket()){
            basketTaxTotal = basketTaxTotal.add(calculateItemTaxTotal(item));
        }
        BigDecimal taxRounded = round.roundToNearestFiveCent(basketTaxTotal);
        return round.roundTo2DecPlaces(taxRounded);
    }

}
