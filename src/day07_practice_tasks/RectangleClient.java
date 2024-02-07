package day07_practice_tasks;

public class RectangleClient {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.width = 20;
        rectangle1.length = 32;

        rectangle1.calculateArea();

        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);

    }
}
