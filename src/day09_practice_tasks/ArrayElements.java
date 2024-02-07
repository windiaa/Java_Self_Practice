package day09_practice_tasks;

public class ArrayElements {
    public static void main(String[] args) {


        int[] numbers = new int[100];

        for (int i = 1; i < numbers.length+1; i++) {
            System.out.print(i + " " );
        }

        System.out.println( );

        for (int j = numbers.length; j >= 1; j--) {
            System.out.print(j + " ");
        }

        System.out.println();

        for (int k = 1; k <= numbers.length ; k++) {
            if (k % 5 == 0){
                System.out.print(k + " ");
            }
        }

    }
}
