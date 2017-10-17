package main.Receipt;

import main.Item.ItemBasket;
import main.Util.Print;

public class ReceiptMain {
    public static void main(String [] args){

        ReceiptOrchestrator orchestrator = new ReceiptOrchestrator();
        ItemBasket outputBasket1 = orchestrator.getOutputBasket("items_input1.txt");
        ItemBasket outputBasket2 = orchestrator.getOutputBasket("items_input2.txt");
        ItemBasket outputBasket3 = orchestrator.getOutputBasket("items_input3.txt");

        //printing the output of the final receipt for all 3 baskets
        Print output = new Print();
        output.printBasket(outputBasket1,1);
        output.printBasket(outputBasket2,2);
        output.printBasket(outputBasket3,3);

    }
}
