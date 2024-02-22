package day13_self_practice.Person;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, String gender, String employeeId, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, employeeId, "Tester", salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println("Developer" + " " +getName() + " is coding in" + " " + programmingLanguage);
    }
}