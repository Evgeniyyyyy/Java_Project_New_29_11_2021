package takeout;

import takeout.utils.PrintUtils;


import static sun.misc.Version.print;
import static takeout.utils.PrintUtils.CommonPrintMethods.*;


public class Order{
    private String clientName;
    private int orderNumber;
    private int orderStatus;
    private MainDish mainDishChoice;
    private Side sideChoice;
    private Drink drinkChoice;
    private double tips;
    private double totalPrice;
    private static int operations = 0;

    private static int staticCount = 1;
    private int dynamicCount = 0;

    public Order(String clientName) {
        this.clientName = clientName;
        this.orderNumber = staticCount ++;
        dynamicCount ++;
        operations ++;
    }

    public void cancelOrder(){
    //    staticCount --;
        this.orderStatus = dynamicCount --;
        operations ++;
    }
    public void setStatusActive() {
        if (dynamicCount == 0) {
            //this.orderStatus = orderStatus ++;
            dynamicCount ++;

        }
        else if (dynamicCount == 2){
            dynamicCount --;
            operations ++;
        }
        operations ++;
        
    }

    public void setStatusDone(){
        if (dynamicCount == 1){
            dynamicCount ++;
            operations ++;
        }
    }

    public void printOrder(){
        operations ++;
        printLine();
        println();
        PrintUtils.print("Order#" + orderNumber);
        PrintUtils.print("       Client name:" + clientName);
        PrintUtils.print("       Order Status Dyn Count" + dynamicCount);
        PrintUtils.print("         Operations: " + operations);
        printLine();

    }

    /*private void print(String s) {
    }*/
}
