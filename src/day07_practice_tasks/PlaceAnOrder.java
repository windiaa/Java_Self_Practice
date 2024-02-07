package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product name");
        String product = input.nextLine();

        System.out.println("Enter the price");
        Double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter the first name");
        String name = input.nextLine();

        double total = price * quantity;

        input.close();

        System.out.println(name + ", your order for " + quantity + name + " has been placed."

        + " Your total is " + total);



    }
}
