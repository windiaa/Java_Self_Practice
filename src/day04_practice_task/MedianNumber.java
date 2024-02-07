package day04_practice_task;

public class MedianNumber {
    public static void main(String[] args) {
        /*
        Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
         */

        int a = 10;
        int b = 15;
        int c = 20;

        if ((a >= b && c >= a) || (a <= b && c <= a ))  {
            System.out.println(a + " is the median number");
        } else if ((a <= b && c >= b) || (a >= b && c <= b)) {
            System.out.println(b + " is the median number");
        }else {
            System.out.println(c + " is the median number");
        }
    }
}
