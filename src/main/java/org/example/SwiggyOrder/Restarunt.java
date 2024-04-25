package org.example.SwiggyOrder;

import java.util.List;
import java.util.Objects;

public class Restarunt {
    public String restaruntName;
    public String phoneNumber;
    public String rating;
    public Dishes dishes;

    public Address address;
    List<Dishes> dishList;

    @Override
    public String toString() {
        return "Restarunt{" +
                "restaruntName='" + restaruntName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rating='" + rating + '\'' +
                ", dishes=" + dishes +
                ", address=" + address +
                ", dishList=" + dishList +
                '}';
    }
}

