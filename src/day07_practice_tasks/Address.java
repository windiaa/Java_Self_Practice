package day07_practice_tasks;

public class Address {
    public int buildingNumber;

    public String street;

    public String city;

    public String state;

    public String zipCode;

    public String toString() {
        return buildingNumber + " " + street + " " + "\n" + city
                + " " + state + ", " + zipCode;

    }
}
