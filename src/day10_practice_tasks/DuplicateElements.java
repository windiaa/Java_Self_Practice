package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {

     ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        list.addAll(list);

        System.out.println(list);

    }
}
