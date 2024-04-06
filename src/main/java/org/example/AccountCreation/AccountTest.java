package org.example.AccountCreation;

import org.example.AccountCreation.AccountService;
import org.example.AccountCreation.Address;
import org.example.AccountCreation.UserName;

public class AccountTest {
    public static void main (String[]args){
        UserName userName=new UserName();
        Address userAddress=new Address();
        userAddress.area="Mellacheruvu";
        userAddress.flatNo="421";
        userAddress.pincode="508216";
        userAddress.country="India";


        userName.lastName="VINNY";
        userName.firstName="THOTA";
        userName.adharNo="3993 5194 9976";
        userName.dob="01/07/2002";
        userName.mobileNo="8686712798";
        userName.panCard="CAVPOTR104";
        userName.address=userAddress;

        AccountService accountService=new AccountService();
        accountService.createAccount(userName);
        System.out.println(PassBook.accountNumber);
    }
}
