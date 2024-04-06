package org.example.Swiggy;

public class Product {
    public String name;
    public int quantity;
    public double productPrice;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", productPrice=" + productPrice +
                '}';
    }
}
