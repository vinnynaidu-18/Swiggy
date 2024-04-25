package org.example.Swiggy;

public class Ordered {
    public OrderedItems orderedItems;
    public int price;
    public  double serviceCharges;
    public  int tipAmt;

    public Address address;

    @Override
    public String toString() {
        return "Ordered{" +
                "orderedItems=" + orderedItems +
                ", price=" + price +
                ", serviceCharges=" + serviceCharges +
                ", tipAmt=" + tipAmt +
                ", address=" + address +
                '}';
    }
}
