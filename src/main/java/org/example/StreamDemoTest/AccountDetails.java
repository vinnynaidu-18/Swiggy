package org.example.StreamDemoTest;

import java.util.Date;

public class AccountDetails {
    public Date txnDate;
    public Date valueDate;
    public double ammount;
    public String description;

    public String txnType;

    @Override
    public String toString() {
        return "AccountDetails{" +
                "txnDate=" + txnDate +
                ", valueDate=" + valueDate +
                ", ammount=" + ammount +
                ", description='" + description + '\'' +
                ", txnType='" + txnType + '\'' +
                '}';
    }

    public double getAmmount() {
        return ammount;
    }

    public String getTxnType() {
        return txnType;
    }

}
