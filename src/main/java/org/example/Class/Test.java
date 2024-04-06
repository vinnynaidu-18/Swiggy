package org.example.Class;

public class Test {
    public static void main(String[]args){
        Address ad=new Address();
        ad.area="mellacheruvu";
        ad.city="kodad";
        ad.flatNumber=421;
        ad.pincode=508246;
        ad.streetNumber=2;

        UserDetails ud=new UserDetails();
        ud.userName="Vinny";
        ud.password="555";
        ud.address= ad;

        Address add=new Address();
        add.area="Santhoshnagar";
        add.city="Hyderabad";
        add.streetNumber=3;
        add.flatNumber=530;
        add.pincode=508216;

        Restarunt res=new Restarunt();
        res.name="Lucky Restarunt";
        res.address=add;

    }
}
