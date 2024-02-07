package day05_practice_task;

public class Finra2 {
    public static void main(String[] args) {

        int num = 100;
        for (int i = 1; i <= num ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            }else if (i % 5 == 0){
                System.out.print("RA ");
            }else
                System.out.print(i + " ");

        }

    }
}
