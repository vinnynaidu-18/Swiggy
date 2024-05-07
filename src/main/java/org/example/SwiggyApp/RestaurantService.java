package org.example.SwiggyApp;

import java.util.function.Supplier;

public class RestaurantService {
    Supplier<Restaurant> findRestaurant(Swiggy swiggy, String restaurantName) {
        return () -> {
            for (Restaurant restaurant : swiggy.getRestaurants()) {
                if (restaurant.getName().equalsIgnoreCase(restaurantName)) {
                    return restaurant;
                }
            }
            return null;
        };
    }
}
