package org.example.LoanAmount;

public class LoanAmountTest {
    public static void main(String[]args){
        Address address=new Address();
        address.area="Mellacheruvu";
        address.flatNo="421";
        address.country="India";
        address.pincode="508216";

        User user=new User();
        user.firstName="Vinny";
        user.lastName="THOTA";
        user.dob="01/07/2002";
        user.mobileNo="9154021693";
        user.annualIncome=500000;
        user.adharNo="3993 5194 9976";
        user.panCard="CAPVRO140";
        user.address=address;


        LoanService ls=new LoanService();
        Loan loan=LoanService.approveLoan(user);
        System.out.println(Loan.loanId);

    }
}
