package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String[] classmatesName = {"Windia Lastname", "Amel Kadric", "Paul Melnyk"};
        String[] reversed = new String[classmatesName.length];

        for (int i = classmatesName.length - 1, j = 0; i >= 0; i--, j++) {
        reversed[j] = "\n" + classmatesName[i].substring(classmatesName[i].indexOf(" ") +1)
        + " " + classmatesName[i].substring(0,classmatesName[i].indexOf(" "));
        }

        System.out.println(Arrays.toString(reversed));


    }
}
