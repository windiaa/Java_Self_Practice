package day11_practice_tasks;

public class Server {

    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder(){
        System.out.println(name + " is taking an order.");
    }

    public void cleanTable(){
        System.out.println(name + " is cleaning the table.");
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
/*
takeOrder(): server's name + "is taking an order"
	    cleanTable(): server's name + "is cleaning the table"
		toString(): returns a string repres
 */