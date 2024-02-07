package day04_practice_task;

public class AgeGroups {
    public static void main(String[] args) {

        /*
        Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult

         */
        int age = 15;

        if (age <= 20 && age >= 0) {
            System.out.println("Teenager");
        } else if (age <= 55 && age >= 21) {
            System.out.println("Adult");
        }else if (age <= 150 && age >= 56) {
            System.out.println("Senior");
        }else
            System.out.println("Invalid");
    }
}
