package day09_practice_tasks;

import java.util.Arrays;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int lentgh = num.length;
        int odd = 0;
        int even = 0;

        for (int i = 0; i <= lentgh - 1; i++) {
            if (num[i] % 2 != 0) {
                odd += 1;
            } else {
                even += 1;
            }
        }

       System.out.println("The array has " + odd + " odd numbers and " + even
       + " even numbers.");


    }
}