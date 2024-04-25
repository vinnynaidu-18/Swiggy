package org.example.equalshashcode;
public class EqualsHashCodeDemoTest {
    public static void main(String[]args){

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

        Address address2=new Address();
        address2.area="lbnagar";
        address2.faltNo="231";
        address2.pincode="500028";
        address2.state="Telangana";
        address2.StreetNo="2";

        System.out.println(address1.equals(address2));
        System.out.println(address2.equals(address1));
        System.out.println(address.equals(test));
        System.out.println(address.equals(address1));
        System.out.println(address.equals(""));
        System.out.println("address"+address.hashCode());
        System.out.println("address1"+address1.hashCode());
    }
}
