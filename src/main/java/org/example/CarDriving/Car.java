package org.example.CarDriving;

import java.util.List;

public class Car {
    AC ac;
    List<Door>doorlist;
    FuelTanker fuelTanker;
    Lights lights;
    Break breaks;
    List<Wheel>wheelList;
    List<Seats>seatsList;

    @Override
    public String toString() {
        return "Car{" +
                ", ac=" + ac +
                ", doorlist=" + doorlist +
                ", fuelTanker=" + fuelTanker +
                ", lights=" + lights +
                ", breaks=" + breaks +
                ", wheelList=" + wheelList +
                ", seatsList=" + seatsList +
                '}';
    }
}
