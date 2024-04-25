package org.example.StreamDemoTest;

import java.util.List;
import java.util.Objects;

public class Account {

        public String accNo;
        public String ifsc;
        public double balance;

        public Address address;
        public User user;

        List<AccountDetails> accountDetailsList;

    @Override
    public String toString() {
        return "Account{" +
                "accNo='" + accNo + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", balance=" + balance +
                ", address=" + address +
                ", user=" + user +
                ", accountDetailsList=" + accountDetailsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(accNo, account.accNo) && Objects.equals(ifsc, account.ifsc) && Objects.equals(address, account.address) && Objects.equals(user, account.user) && Objects.equals(accountDetailsList, account.accountDetailsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accNo, ifsc, balance, address, user, accountDetailsList);
    }
}
