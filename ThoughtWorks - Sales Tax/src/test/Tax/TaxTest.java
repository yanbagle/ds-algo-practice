package test.Tax;

import static org.junit.Assert.assertEquals;

import main.Item.Item;
import main.Item.ItemBasket;
import main.Tax.TaxCalculator;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxTest {

    TaxCalculator taxCalculator = new TaxCalculator();
    Item item = new Item();
    ItemBasket basket = new ItemBasket();

    @Test
    public void isExemptItemTax()
    {
        item.setPrice(new BigDecimal("18.99"));
        item.setTaxExempt(true);
        BigDecimal itemTax = taxCalculator.calculateItemTaxTotal(item);
        assertEquals(itemTax, new BigDecimal("0.00"));
    }

    @Test
    public void notExemptItemTax()
    {
        item.setPrice(new BigDecimal("18.99"));
        item.setTaxExempt(false);
        BigDecimal itemTax = taxCalculator.calculateItemTaxTotal(item);
        assertEquals(itemTax, new BigDecimal("1.90"));
    }

    @Test
    public void notExemptIsImportedItemTax(){
        item.setPrice(new BigDecimal("18.99"));
        item.setTaxExempt(false);
        item.setIsImported(true);
        BigDecimal itemTax = taxCalculator.calculateItemTaxTotal(item);
        assertEquals(itemTax, new BigDecimal("2.85"));
    }

    @Test
    public void ExemptIsImportedItemTax(){
        item.setPrice(new BigDecimal("18.99"));
        item.setTaxExempt(true);
        item.setIsImported(true);
        BigDecimal itemTax = taxCalculator.calculateItemTaxTotal(item);
        assertEquals(itemTax, new BigDecimal("0.95"));
    }

    @Test
    public void basketTax(){
        item.setPrice(new BigDecimal("18.99"));
        item.setTaxExempt(true);
        item.setIsImported(true);
        basket.getBasket().add(item);
        BigDecimal itemTax = taxCalculator.calculateBasketTaxTotal(basket);
        assertEquals(itemTax, new BigDecimal("0.95"));
    }

}
