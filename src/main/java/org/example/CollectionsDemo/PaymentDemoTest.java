package org.example.CollectionsDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
public class PaymentDemoTest {
    public static void main(String[]args){

        Predicate<PaymentDemo> filterByAccountNumber = demo -> demo.accountNumber.equals("888");
        PaymentDemo paymentDemo=new PaymentDemo();
        paymentDemo.accountNumber="555";

        PaymentDemo paymentDemo1=new PaymentDemo();
        paymentDemo1.accountNumber="888";

        PaymentDemo paymentDemo2=new PaymentDemo();
        paymentDemo2.accountNumber="222";

        List<PaymentDemo> paymentDemoList=new ArrayList<>();
        paymentDemoList.add(paymentDemo);
        paymentDemoList.add(paymentDemo1);
        paymentDemoList.add(paymentDemo2);

        List<PaymentDemo> filteredList = filterPaymentDemoList(paymentDemoList, filterByAccountNumber);
        System.out.println("Filtered List:");
        for (PaymentDemo demo : filteredList) {
            System.out.println(demo.accountNumber);
        }
    }
    public static List<PaymentDemo> filterPaymentDemoList(List<PaymentDemo> demoList, Predicate<PaymentDemo> predicate) {
        List<PaymentDemo> filteredList = new ArrayList<>();
        for (PaymentDemo demo : demoList) {
            if (predicate.test(demo)) {
                filteredList.add(demo);
            }
        }
        return filteredList;
    }
}


