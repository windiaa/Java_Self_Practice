package day10_practice_tasks;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        String digits = "",
                letters = "",
                specialChars = "";

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            } else {
                specialChars += each;
            }

        }

        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }

}
