package org.example.FunctionDemotest;

public class Dish {
    public String dishName;

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                '}';
    }

    public Dish(String dishName) {
        this.dishName = dishName;
    }
}
