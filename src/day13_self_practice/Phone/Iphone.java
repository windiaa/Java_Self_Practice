package day13_self_practice.Phone;

public class Iphone extends Phone {
    public Iphone(String model, String size, double price, String color) {
        super("Iphone", model, size, price, color);
    }

    public void faceTime(String phoneNumber) {
        System.out.println("Facetiming with the number " + phoneNumber);
    }
}
