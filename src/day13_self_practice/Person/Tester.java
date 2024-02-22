package day13_self_practice.Person;

public class Tester extends Employee {

    public Tester(String name, int age, String gender, String employeeId, double salary, String companyName) {
        super(name, age, gender, employeeId, "Tester", salary, companyName);
    }

    public void work(){
        System.out.println("Tester" +" "+ getName() + " is testing.");
    }
}