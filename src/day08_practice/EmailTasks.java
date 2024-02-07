package day08_practice;

public class EmailTasks {
    public static void main(String[] args) {

        String email = "pengkyu_98@gmail.com";
        String email2 = "miketyson@gmail.com";
        System.out.println(result(email));
        System.out.println(result(email2));


    }

    public static String result (String email) {
        if (email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.lastIndexOf("@"));
            email = lastName + "_" + firstName + email.substring(email.indexOf("@"));
        }
        return email;
    }
}