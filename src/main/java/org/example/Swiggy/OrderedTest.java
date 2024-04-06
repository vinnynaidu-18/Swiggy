package org.example.Swiggy;

public class OrderedTest {

    public static void main(String[]args){
        Address ad=new Address();
        ad.flatNumber=421;
        ad.area="Sri Nagar Colony";
        ad.city="Mellacheruvu";
        ad.pincode=508216;
        ad.streetNumber=2;

        Product product=new Product();
        product.productPrice=589.50;
        product.quantity=4;
        product.name="Biriyani";

        OrderedItems od=new OrderedItems();
        od.product=product;
        od.quantity=4;
        od.price=250;

        Ordered ordered=new Ordered();
        ordered.price=250;
        ordered.tipAmt=50;
        ordered.address=ad;
        ordered.orderedItems=od;
        ordered.serviceCharges=100;

        System.out.println(ordered);


    }
}
