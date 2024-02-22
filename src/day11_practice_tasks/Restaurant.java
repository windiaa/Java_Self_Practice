package day11_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;

    public int numberOfStars;

    public ArrayList<Server>servers;

    public ArrayList<Chef>chefs;

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }
}
/*
Owner (String)
			Location (String)
			numberOfStars (int)
			Servers (ArrayList of Server objects)
			Chefs (ArrayList of Chef objects)
 */