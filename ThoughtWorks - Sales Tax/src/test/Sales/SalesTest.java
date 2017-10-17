package test.Sales;

import main.Item.Item;
import main.Item.ItemBasket;
import main.Sales.SalesTotal;
import main.Tax.TaxCalculator;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class SalesTest {

    SalesTotal salesTotal = new SalesTotal();
    ItemBasket basket = new ItemBasket();

    @Test
    public void basketSalesTotal()
    {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        item1.setPriceTotal(new BigDecimal("2.99"));
        item2.setPriceTotal(new BigDecimal("3.99"));
        item3.setPriceTotal(new BigDecimal("8.99"));
        basket.getBasket().add(item1);
        basket.getBasket().add(item2);
        basket.getBasket().add(item3);
        BigDecimal total = salesTotal.getBasketSaleTotal(basket);
        assertEquals(total, new BigDecimal("15.97"));
    }

    @Test
    public void itemSaleTotal()
    {
        Item item1 = new Item();
        item1.setPrice(new BigDecimal("2.99"));
        item1.setTaxExempt(true);
        BigDecimal total = salesTotal.getItemSaleTotal(item1);
        assertEquals(total, new BigDecimal("2.99"));
    }

}
