package day08_practice;

public class EmailTasks2Test {
    public static void main(String[] args) {

        String email = "pengkyu_lave@gmail.com";

        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.lastIndexOf("_") +1, email.indexOf("@"));
        String device = email.substring(email.indexOf("@")+ 1,email.lastIndexOf(".com") );

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);


        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("device = " + device);

    }
}
