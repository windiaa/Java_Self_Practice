package day13_self_practice.Person;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Windi", 30, "Female", "E123", 50000, "ABC Corp");
        Developer developer = new Developer("Bob", 35, "Male", "E456", 80000, "XYZ Inc", "Java");
        Teacher teacher = new Teacher("Charlie", 40, "Male", "E789", 60000, "Education Center");
        Driver driver = new Driver("David", 45, "Male", "E012", 45000, "Transport Services");
        System.out.println(teacher);
         teacher.work();

        System.out.println(developer);
        developer.work();
    }
}
