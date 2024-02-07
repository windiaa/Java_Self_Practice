package day08_practice;

public class EmailTask1Test {
    public static void main(String[] args) {

        String email = "pengkyu_88@gmail.com";
        String email2 = "windialave@gmail.com";
        System.out.println(result(email));
        System.out.println(result(email2));
    }

    public static String result(String email) {
        if (email.contains("_")) {
            int indexUnderscore = email.indexOf("_");
            int indexAt = email.indexOf("@");
            String firstName = email.substring(0,indexUnderscore);
            String lastName = email.substring(indexUnderscore +1,indexAt );
            email = lastName + "_" + firstName + "@gmail.com";

        }
        return email;
    }
}

