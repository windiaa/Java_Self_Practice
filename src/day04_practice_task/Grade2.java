package day04_practice_task;

public class Grade2 {
    public static void main(String[] args) {

        /*
        USE SWITCH STATEMENTS TO COMPLETE THE FOLLOWING TASKS:

9. Create a class called Grade2. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				   Great job

         */

        char grade = 'C';

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid grade");
        }
    }
}
