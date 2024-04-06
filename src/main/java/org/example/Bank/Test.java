package org.example.Bank;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Account a=new Account();
        a.balance=1000;
        a.accountNumber="555";
        a.ifscCode="SBI91540";
        a.userName="vinny";
        a.password="12345";
        a.pinNumber="4436";

        Card card=new Card();
        card.account=a;
        card.cardNumber="3993 5194 9976";
        card.cvv="222";
        card.expiry=new Date();

        Atm atm=new Atm();
        atm.atmId="5678";
        atm.balance=2000;
        atm.location="Kodad";

        Transaction t=new Transaction();
        t.atm=atm;
        t.card=card;
        t.transactionID="42570987";
        t.withdrawAmt=500;
    }
}
