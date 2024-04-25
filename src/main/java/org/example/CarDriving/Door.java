package org.example.CarDriving;

public class Door {
    public String type;
    public String brand;

    public String windowType;

    @Override
    public String toString() {
        return "Door{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", windowType='" + windowType + '\'' +
                '}';
    }
}
