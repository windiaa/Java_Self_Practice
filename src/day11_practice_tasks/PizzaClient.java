package day11_practice_tasks;

import java.io.OutputStream;

public class PizzaClient {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small",2,2);
        Pizza pizza2 = new Pizza("medium",10,5);

        System.out.println(pizza1);
        System.out.println(pizza1.calcost("small",2,2));

        System.out.println(pizza2);
        System.out.println(pizza2.calcost("medium",10,5));




    }
}
