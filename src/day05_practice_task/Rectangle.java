package day05_practice_task;

public class Rectangle {

    public static void main(String[] args) {

        int row = 9;
        int coloum = 8;

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= coloum; j++) {
                System.out.print("*  ");

            }
            System.out.println();
        }
    }
}
