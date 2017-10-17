package main.Util;

import main.Item.Item;
import main.Item.ItemBasket;

public class Print {

    public Print(){}

    //printing the output of the final receipt for basket
    public void printBasket(ItemBasket outputBasket, int inputNum){
        System.out.println("Output " + inputNum + ":");
        for(Item item: outputBasket.getBasket()){
            System.out.print(item.getQuantity() + " ");
            System.out.print(item.getFullName() + ": ");
            System.out.print(item.getPriceTotal());
            System.out.println();
        }
        System.out.println("Sales Taxes: " + outputBasket.getTotalTax());
        System.out.println("Total: " + outputBasket.getTotalSales());
        System.out.println();
    }

}
