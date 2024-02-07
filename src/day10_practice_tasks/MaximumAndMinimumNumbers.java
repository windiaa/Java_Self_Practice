package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int max = list.get(0);
        int min = list.get(0);

        for (Integer each : list) {

            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);

    }
}
