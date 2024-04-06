package org.example.Swiggy;

public class OrderedItems {
    public Product product;
    public int price;
    public int quantity;

    @Override
    public String toString() {
        return "OrderedItems{" +
                "product=" + product +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
