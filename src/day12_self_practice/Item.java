package day12_self_practice;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name == null) || (name.trim().isEmpty())) {
            System.err.println("The name cannot be empty or blank.");
            System.exit(1);
        }
        if (!name.matches("^[a-zA-Z\\s]+$")) {
            System.err.println("Name must contain only letters and spaces.");
            System.exit(1);
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("The unitPrice cannot be negative.");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.err.println("The quantity cannot be negative.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", calcCost" + calcCost() +
                '}';
    }
}
/*
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */