package day09_practice_tasks;

import java.util.Arrays;

public class ClassmateInitials {
    public static void main(String[] args) {

        String[] classmatesName = {"Windia Lastname" , "Amel Kadric" , "Paul Melnyk"};

        String[] initials = new String[classmatesName.length];

        for (int i = 0; i < classmatesName.length; i++) {

            initials[i] ="\n" +classmatesName[i].charAt(0) + "." + classmatesName[i].charAt(classmatesName[i].indexOf(" ")+1);

        }

        System.out.println(Arrays.toString(initials));

    }
}
