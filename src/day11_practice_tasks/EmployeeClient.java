package day11_practice_tasks;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Windia", 25,'F',"QA", 25000.00);
        System.out.println(employee1);
        employee1.work();
    }
}
