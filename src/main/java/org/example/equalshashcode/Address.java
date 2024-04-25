package org.example.equalshashcode;
public class Address {

    public String area;
    public  String StreetNo;
    public String faltNo;

    public String pincode;
    public String state;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", StreetNo='" + StreetNo + '\'' +
                ", faltNo='" + faltNo + '\'' +
                ", pincode='" + pincode + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Getclass"+this.getClass());
        if (this == o)
            return true;
        if ( this.getClass() != o.getClass())
            return false;

        Address  otheraddress = (Address) o;
        return this. area.equals( otheraddress.area) &&
                this.StreetNo.equals(otheraddress.StreetNo) &&
                this.faltNo.equals(otheraddress.faltNo) &&
                this.pincode.equals(otheraddress.pincode) &&
                this.state.equals(otheraddress.state);
    }

    @Override
    public int hashCode() {
        return this.area.hashCode()+
                this.pincode.hashCode()+
                this.faltNo.hashCode()+
                this.StreetNo.hashCode();
    }
}


