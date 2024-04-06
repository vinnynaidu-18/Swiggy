package org.example.SwiggyOrder;

public class Address {
    String area;
    String city;
    String faltNo;
    String  pincode;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", faltNo='" + faltNo + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public Address(String area, String city, String faltNo, String pincode) {
        this.area = area;
        this.city = city;
        this.faltNo = faltNo;
        this.pincode = pincode;
    }
}
