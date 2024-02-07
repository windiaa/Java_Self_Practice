package m10_variables_data_types;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName = "shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println(("Employee name: ") + employeeName + "\nGender: " + gender + "\nAge: " + age + "\nEmployee ID: " + employeeId + "\nJob Title: " + jobTitle + "\nCompany Name: " + companyName + "\nFull time: " + isFullTime + "\nYears of work experience: " + yearsOfExperience + " years" + "\nSalary: $" + salary + ",0" + "\nMarried: " + isMarried);

    }
}
