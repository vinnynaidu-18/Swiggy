package org.example.CreditCrad;

import java.util.Date;
import java.util.UUID;

public class CreditCardService {
    public CreditCrad card(UserName userName){
        CreditCrad cc=new CreditCrad();
        cc.accontNumber= UUID.randomUUID().toString();
        cc.cvv=UUID.randomUUID().toString();
        cc.accountHolderName=UserName.name;
        cc.expiry=new Date();
        return cc;

    }
}
