package day12_self_practice;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanut;


    public Candy(String brand,int quantity,double price,boolean hasPeanut){
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanut(hasPeanut);
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0){
            System.err.println("The quantity of candy cannot be set to zero or a negative value.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.err.println("The price of candy cannot be set to a negative value.");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanut() {
        return hasPeanut;
    }

    public void setHasPeanut(boolean hasPeanut) {
        this.hasPeanut = hasPeanut;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanut=" + hasPeanut +
                '}';
    }
}
/*


		toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.

	Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.
 */