package org.example.SwiggyApp;
import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    public String name;

    public Address address;
    public List<Dish> menu;
    public double rating;

    public Restaurant(String name, Address address) {
        this.name = name;
        this.address = address;
        this.menu = new ArrayList<>();
        this.rating = 0;
    }

    public void addToMenu(Dish dish) {
        menu.add(dish);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Dish> getMenu() {
        return menu;
    }
}

