package additional_tasks;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {

        int pinNumber = 123456;
        double accountBalance = 200.0;
        double newBalance = 0;
        double newWithdraw = 0;
        double accountBalance2 = accountBalance + newBalance;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your pin number");
        int pin1 = input.nextInt();


        if (!(pin1 == pinNumber)) {
            for (int loop = 1; loop <= 2; loop++) {
                System.err.println("Incorrect Pin Number, Please re-enter:");
                pin1 = input.nextInt();
                if (loop == 2)
                    System.out.println("Your card is locked. Please contact your local bank.");
            }
        }
        if (pin1 == pinNumber) {
            System.out.println("Select from one of the three following options:\n" +
                    "3.1 Check balance" + "\n 3.2 Deposit money" + "\n 3.3 Withdraw money");
            double choices = input.nextDouble();
            if (choices == 3.1) {
                System.out.println(accountBalance);
            } else if (choices == 3.2) {
                System.out.println("Enter the amount to deposit");
                double amountDeposit = input.nextDouble();
                newBalance = accountBalance + amountDeposit;
                if (amountDeposit >= 1) {
                    System.out.println("New balance: $ " + (newBalance));
                } else {
                    System.err.println("Depositing amount cannot be zero or negative, please try again later.");
                }

            } else if (choices == 3.3) {

                System.out.println("Enter the amount to withdraw:");
                double withdrawMoney = input.nextDouble();
                if (withdrawMoney < accountBalance2) {
                    newWithdraw = accountBalance2 - withdrawMoney;
                    System.out.println("Your new balance is : $" + newWithdraw);
                }else if (withdrawMoney <= 0) {
                    System.err.println("Cannot withdraw zero or negative amount, please try again later.");
                } else if (withdrawMoney > accountBalance2) {
                    System.err.println("Insufficient funds. Withdrawal failed.");
                }
            } else {
                System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
            }

        }

    }

}

//        System.out.println("Do you want to do transaction again?(Yes/No)");
//        String answer = input.next();
//        input.nextLine();
//        while (!(answer.equals("Yes") || answer.equals("No"))) {
//            System.err.println("Invalid response");
//            answer = input.nextLine();
//        }
//





