package day09_practice_tasks;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {
                result[j++] = array[i];
            }

        }
            System.out.println(Arrays.toString(result));
    }

}
