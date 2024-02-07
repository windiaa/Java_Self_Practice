package additional_tasks;

import java.util.Scanner;

public class CoffeeOrderApp {
    public static void main(String[] args) {

        double blackCoffeePrice = 5.0;
        double lattePrice = 6.0;
        double cappuccinoPrice = 10.0;
        double totalPrice = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Order App" + "\nWould you like to order coffee?(Yes/No)");
        String answer = input.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Please re-enter your answer");
            answer = input.nextLine().toLowerCase();
        }
        if (answer.equals("no")) {
            System.out.println("Thanks for using our service!");
            return;
        }
        while (answer.equals("yes")) {
            System.out.println("Please pick your coffee");
            System.out.println("Coffee Option: \n" + "\t\t1.Black Coffee" + " $" + blackCoffeePrice);
            System.out.println("\t\t2.Latte" + " $" + lattePrice);
            System.out.println("\t\t3.Cappuccino" + " $" + cappuccinoPrice);
            int coffeeOrder = input.nextInt();
            if (coffeeOrder == 1) {
                System.out.println("Added Black Coffee to your order");
                double order1 = blackCoffeePrice;
            } else if (coffeeOrder == 2) {
                System.out.println("Added Latte to your order");
                double order2 = lattePrice;
            } else if (coffeeOrder == 3) {
                System.out.println("Added Cappuccino to your order");
                double order3 = cappuccinoPrice;
            }
            if (!(coffeeOrder == (1) || coffeeOrder == (2) || coffeeOrder == (3))) {
                System.out.println("Invalid answer.Please re-enter your answer.");
                coffeeOrder = input.nextInt();
                input.nextLine();
            }
            System.out.println("Would you like to add another order?");
            String answer2 = input.nextLine().toLowerCase();
            answer2 = input.nextLine();
            if (answer2.equals("no")) {
                System.out.println("Your total is: $");
                break;
            }else if (answer2.equals("yes")){
                continue;
            }
        }
    }
}
