package org.example.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[]args) {
        Set<Car> carSet=new HashSet<>();

        Car car1=new Car();
        car1.name="Punch";

        Car car2=new Car();
        car2.name="BMW";

        carSet.add(car1);
        carSet.add(car2);

        System.out.println(carSet);
        Address address=new Address();
        address.area="lbnagar";
        address.faltNo="231";
        address.pincode="500028";
        address.state="Telangana";
        address.StreetNo="2";

        Address address1=new Address();
        Address test = address1;
        address1.area="lbnagar";
        address1.faltNo="231";
        address1.pincode="500028";
        address1.state="Telangana";
        address1.StreetNo="2";

        Set<Address>addressSet=new HashSet<>();
        addressSet.add(address1);
        addressSet.add(address);
        System.out.println(addressSet);
    }

}
