package day08_practice;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String split = input.next();

        System.out.println("Enter the number of people:");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();

        System.out.println("Service Quality (Excellent/Great/Good/Fair/Poor): ");
        String serviceQuality = input.next();

        input.close();

        double totalTip = 0;

        if (serviceQuality.equals("Poor")){
            totalTip = checkAmount * 0.05;
        } else if (serviceQuality.equals("Fair")) {
            totalTip = checkAmount * 0.10;
        } else if (serviceQuality.equals("Good")) {
            totalTip = checkAmount * 0.15;
        } else if (serviceQuality.equals("Great")) {
            totalTip = checkAmount * 0.20;
        } else if (serviceQuality.equals("Excellent")) {
            totalTip = checkAmount * 0.25;
        } else {
            totalTip = totalTip;
        }

        double totalToPay = checkAmount + totalTip;

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalToPay / numberOfPeople);
        System.out.println("Tip per person: " + totalTip / numberOfPeople);

    }
}



