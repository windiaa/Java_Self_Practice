package day11_practice_tasks;

public class Chef {

    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void name(){
        System.out.println(name + " is making order.");
    }

    public void washDishes(){
        System.out.println(name + " is washing a dishes.");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
/*
makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status

 */