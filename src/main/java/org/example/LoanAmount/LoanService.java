package org.example.LoanAmount;

import java.util.UUID;

public class LoanService {
    public static  Loan approveLoan(User user){
        Loan loan =new Loan();
        loan.fisrtName="Vinny";
        loan.lastName="Thota";
        loan.amount="50000";
        loan.emiAmt="3500";
        loan.tensuretime="12 months";
        loan.loanId= UUID.randomUUID().toString();
        loan.intrest=0.5;

      return loan;
    }



}

