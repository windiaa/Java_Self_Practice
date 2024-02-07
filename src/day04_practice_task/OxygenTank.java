package day04_practice_task;

public class OxygenTank {
    public static void main(String[] args) {
        /*
        Create a class named OxygenTank. You are diving in the ocean.
         Your oxygen tank has a certain
level (number), and you must print a message based on the level:

		Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%

			Example:
				   oxygenLevel = 75;

			Output:
				  Don't go too far

         */

        int oxygentLevel = 75;

        if (oxygentLevel >= 90) {
            System.out.println("Your tank is full");
        } else if (oxygentLevel >= 80) {
            System.out.println("Still okay");
        } else if (oxygentLevel >= 70) {
            System.out.println("Don't go too far");
        } else if (oxygentLevel >= 60) {
            System.out.println("Start to head back");
        }else {
            System.out.println("Be careful, you're at 50%");
        }
    }
}
