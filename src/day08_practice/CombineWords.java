package day08_practice;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");
        String firstWord = input.next();
        System.out.println(firstWord.length());

        System.out.println("Enter your second word");
        String secondWord = input.next();
        System.out.println(secondWord.length());

        input.close();

        if (firstWord.lastIndexOf("t") == secondWord.indexOf(0)) ;
        {
            String firstWord1 = firstWord.substring(firstWord.lastIndexOf(""));
            String result = firstWord.concat(secondWord);

            System.out.println("result: " + result);
        }
    }
}