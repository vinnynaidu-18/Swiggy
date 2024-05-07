package org.example.SwiggyApp;

public enum ExceptionHandling {
    NO_RESTAURANT_FOUND(100, "Restaurant not found"),
    NO_DISH_FOUND(101, "Dish not found"),
    LOGIN_FAILED(102, "Login failed"),
    INSUFFICIENT_FUNDS(103, "INSUFFICIENT FUNDS");

    public final int code;
    public final String message;

    ExceptionHandling(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
