package day13_self_practice.Phone;

public class PhoneClient {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone("Iphone 14","5.6 inch",2.899,"White");
        Samsung samsung = new Samsung("Galaxy S7","6.1 inch",2.399,"Black");
        Nokia nokia = new Nokia("Brick","4 inch",1.999,"Gold");

        System.out.println("IPhone:");
        System.out.println(iPhone);
        iPhone.call("1234567890");
        iPhone.text("1234567890");

        System.out.println("Samsung:");
        System.out.println(samsung);
        samsung.call("9876543210");

        System.out.println("Nokia:");
        System.out.println(nokia);
        nokia.text("987654321");

    }
}
