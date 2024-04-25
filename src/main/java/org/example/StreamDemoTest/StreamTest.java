package org.example.StreamDemoTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class StreamTest {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        Map<Account,Account> accountAccountMap = accountService.getAccountSummary();

        Account account = new Account();
        account.accNo="123456789";
        Account fullAccount = accountAccountMap.get(account);
        System.out.println(fullAccount.accNo);

        Predicate<AccountDetails> predicate =(accountDetails )->accountDetails.txnType.equals("C");

        List<AccountDetails> creditAccountDetails=
                fullAccount.accountDetailsList.stream().filter(accountDetails -> predicate.test(accountDetails)).collect(Collectors.toList());
        System.out.println("Stream Details - "+creditAccountDetails);

        List<AccountDetails> creditDetailsNormal = new ArrayList<>();
        for (int i = 0;i<fullAccount.accountDetailsList.size();i++){
            if(fullAccount.accountDetailsList.get(i).txnType.equals("C")){
                creditDetailsNormal.add(fullAccount.accountDetailsList.get(i));

            }
        }
        System.out.println("Normal Loop Details - "+creditDetailsNormal);
        Map<String,Double>groupByTypeSum = fullAccount.accountDetailsList.stream().collect(
                groupingBy(AccountDetails::getTxnType,summingDouble(AccountDetails::getAmmount)));
        System.out.println(groupByTypeSum);

        Map<String,Double> groupByNormal = new HashMap<String,Double>();

        double creditSum=0;
        double debitSum = 0;

        for (int i=0;i<fullAccount.accountDetailsList.size();i++){
            if (fullAccount.accountDetailsList.get(i).txnType.equals("C")){
                AccountDetails detail = fullAccount.accountDetailsList.get(i);
                creditSum=creditSum+detail.getAmmount();
                groupByNormal.put("Credit",creditSum);
            } else if  (fullAccount.accountDetailsList.get(i).txnType.equals("D")){
                AccountDetails detail = fullAccount.accountDetailsList.get(i);
                debitSum=debitSum+detail.getAmmount();
                groupByNormal.put("Debit",debitSum);
            }
        }
        System.out.println(groupByNormal);
       /* System.out.println(creditSum);
        System.out.println(debitSum);*/
     }

}
