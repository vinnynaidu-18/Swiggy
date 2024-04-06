package org.example.Swiggy;

public class Address {
    public String area;
    public String city;
    public int streetNumber;
    public int pincode;
    public int flatNumber;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", streetNumber=" + streetNumber +
                ", pincode=" + pincode +
                ", flatNumber=" + flatNumber +
                '}';
    }
}
