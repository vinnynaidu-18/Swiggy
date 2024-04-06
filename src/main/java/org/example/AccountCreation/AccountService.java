package org.example.AccountCreation;

import java.util.UUID;

public class AccountService {
    public PassBook createAccount(UserName userName){
        PassBook passBook=new PassBook();
        Address address = new Address();
        address.area="Mellacheruvu";
        address.country="India";
        address.flatNo="421";
        address.pincode="508216";

        String name= userName.firstName+""+userName.lastName+"";
        passBook.accountHolderName=name;
        passBook.userAddress= address;
        passBook.bankAddress= address;
        passBook.accountNumber= UUID.randomUUID().toString();
        passBook.ifscCode="SBIN0002169";
        return passBook;
    }

}
