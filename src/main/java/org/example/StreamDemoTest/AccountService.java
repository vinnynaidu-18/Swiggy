package org.example.StreamDemoTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AccountService {
        public Map<Account,Account> getAccountSummary(){


        Address userAddress = new Address();
        userAddress.drno="111";
        userAddress.street="kphb";
        userAddress.village="hyd";
        userAddress.pincode="500055";

        Address bankAddress= new Address();
        bankAddress.drno="000";
        bankAddress.street="jntu";
        bankAddress.village="hyd";
        bankAddress.pincode="500155";

        User user = new User();
        user.name="salaar";
        user.address=userAddress;

        AccountDetails accountDetails1 = new AccountDetails();
        accountDetails1.ammount=1000;
        accountDetails1.description="Self";
        accountDetails1.valueDate=new Date();
        accountDetails1.txnDate=new Date();
        accountDetails1.txnType="C";

        AccountDetails accountDetails2 = new AccountDetails();
        accountDetails2.ammount=200;
        accountDetails2.description="Self";
        accountDetails2.valueDate=new Date();
        accountDetails2.txnDate=new Date();
        accountDetails2.txnType="D";

        AccountDetails accountDetails3 = new AccountDetails();
        accountDetails3.ammount=1000;
        accountDetails3.description="Self";
        accountDetails3.valueDate=new Date();
        accountDetails3.txnDate=new Date();
        accountDetails3.txnType="C";


        Account account = new Account();
        account.accountDetailsList=new ArrayList<>();
        account.accountDetailsList.add(accountDetails1);
        account.accountDetailsList.add(accountDetails2);
        account.accountDetailsList.add(accountDetails3);
        account.accNo="123456789";
        account.address=bankAddress;
        account.ifsc="987456321";
        account.balance=0;
        account.user=user;

        Map<Account,Account> accountMap=new HashMap<>();
        accountMap.put(account,account);

        return accountMap;
   }



}
