package org.example.SwiggyOrder;

import java.util.Objects;

public class Address {
    String area;
    String city;
    String faltNo;
    String  pincode;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ( this.getClass() != o.getClass())
            return false;
        Address address = (Address) o;
        return this.area.equals( address.area) &&
                this.city.equals(address.city) &&
                this.faltNo.equals( address.faltNo) &&
                this.pincode.equals( address.pincode);
    }

    @Override
    public int hashCode() {
        return this.area.hashCode()+
                this.pincode.hashCode()+
                this.faltNo.hashCode()+
                this.city.hashCode();
    }

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
