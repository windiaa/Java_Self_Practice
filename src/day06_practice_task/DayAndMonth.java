package day06_practice_task;

public class DayAndMonth {
    public static void main(String[] args) {
        int day = days(8);
        int month = monthName(1);
        int daysInMonth = daysInMonth(6);

    }

    public static int days(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
        }

        return day;

    }

    public static int monthName(int months) {
        switch (months) {
            case 1 -> System.out.print("January");
            case 2 -> System.out.print("February");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("April");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("June");
            case 7 -> System.out.print("July");
            case 8 -> System.out.print("August");
            case 9 -> System.out.print("September");
            case 10 -> System.out.print("October");
            case 11 -> System.out.print("November");
            case 12 -> System.out.print("December");
            default -> System.out.print("Invalid Num");
        }
        return months;


    }

    public static int daysInMonth(int dayInMonths) {
        switch (dayInMonths) {

            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(" has 31 days");
                break;

            case 4, 6, 9, 11:
                System.out.println(" has 30 days");
                break;

            case 2:
                System.out.println(" has 28 days");
                break;

            default:
                System.out.println("Invalid");
        }
        return dayInMonths;

    }
}