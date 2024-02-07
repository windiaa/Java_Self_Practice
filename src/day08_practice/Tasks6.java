package day08_practice;

public class Tasks6 {
    public static void main(String[] args) {

        String str1 = "cyDEo";
        String str2 = "scHOOL";

        String result = str1.substring(0,1).toUpperCase() + str1.substring(1).toLowerCase();
        String result2 = str2.substring(0,1).toUpperCase() + str2.substring(1).toLowerCase();

        System.out.print(result + " " + result2);




    }
}
