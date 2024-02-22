package day11_practice_tasks;

public class CydeoStudentClient {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Windia", 25,101,'A',33,1);
        CydeoStudent student2 = new CydeoStudent("John",34,405,'B',33,1);


        student1.study(student1.name);
        student2.attendClass(student2.name);
        student1.setSchoolName(CydeoStudent.schoolName);
        student2.setProgrammingLanguagee(CydeoStudent.programmingLanguage);
        System.out.println(student1);
        System.out.println(student2);
    }
}
