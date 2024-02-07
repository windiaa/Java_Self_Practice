package day06_practice_task;

public class SalaryCalculator {
    public static void main(String[] args) {

        double income = salary((int)45, 40);
        System.out.println(52 * income);

    }


    public static double salary (double hourlyRate, int weeklyHours){

        return hourlyRate * weeklyHours;
    }
}
