package day08_practice;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first words");
        String firstWords = input.next();

        System.out.println("Enter second words");
        String secondWords = input.next();

        System.out.println(firstWords.substring(1) + secondWords.substring(1));


    }
}
