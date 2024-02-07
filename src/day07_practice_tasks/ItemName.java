package day07_practice_tasks;

public class ItemName {

    public String itemName;

    public double unitPrice;

    public int quantity;

    public void calcCost(){
        System.out.println("The total cost is: " + quantity*unitPrice);
    }

    public String toString() {
        return "ItemName{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + quantity*unitPrice +
                '}';
    }
}
