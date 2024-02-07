package day07_practice_tasks;

import day07_practice_tasks.ItemName;

public class ItemClients {
    public static void main(String[] args) {

        ItemName item1 = new ItemName();
        item1.itemName = "Computer";
        item1.unitPrice = 2_500;
        item1.quantity = 2;

        item1.calcCost();

        System.out.println(item1);
    }
}
