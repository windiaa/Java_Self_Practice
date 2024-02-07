package day06_practice_task;

public class OddAndEven {


    public static void main(String[] args) {

        boolean result = isOdd(100);
        System.out.println(result);

        boolean result2 = isEven(100);
        System.out.println(result2);


    }

    public static boolean isOdd(int odd) {
        if (odd % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int even) {
        if (even % 2 ==0) {
            return true;
        } else  {
            return false;
        }
    }


}






