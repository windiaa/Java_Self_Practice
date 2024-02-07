package day07_practice_tasks;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Jeff";
        employee1.age = 36;
        employee1.gender = 'M';
        employee1.jobTitle = "Banker";
        employee1.salary = 85_000;


        employee1.work();

        System.out.println(employee1);



    }
}
