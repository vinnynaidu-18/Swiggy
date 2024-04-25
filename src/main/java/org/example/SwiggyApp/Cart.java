package org.example.SwiggyApp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Cart
{
    public List<Dish> items;
    public Cart() {
        this.items = new ArrayList<>();
    }
    Consumer<Dish> addItem=(dish)->{
        items.add(dish);
    };
    public List<Dish> getItems() {
        return items;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Dish item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

}
