package additional_tasks;

public class CoffeeOrder {

    public String coffeeOption;
    public int coffeOrder;
    public double coffeePrice;


    public void CoffeeOrderInfo(String coffeeOption, int coffeeOrder, double coffeePrice) {
        this.coffeeOption = coffeeOption;
        this.coffeOrder = coffeeOrder;
        this.coffeePrice = coffeePrice;
    }

    public double calCost() {
        double totalPrice2 = 0;

//        double blackCoffeePrice = 5.0;
//        double lattePrice = 6.0;
//        double cappuccinoPrice = 10;
//
        double orderPrice = (coffeOrder == 1) ? 5 : (coffeOrder == 2) ? 6 : (coffeOrder == 3) ? 10 :
                (coffeOrder == 1 && coffeOrder == 2) ? 5 + 6 : (coffeOrder == 1 && coffeOrder == 3) ? 5 + 10 :
                        6 + 10;

        return totalPrice2;
    }
}
