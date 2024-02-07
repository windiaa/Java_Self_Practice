package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(!result.contains(each)){
                result.add(each);
            }
        }

        System.out.println(result);

    }


}
