package org.xpdojo.bank;

public class Account {
    private long acctNum;
    private float balance=0;
    private String acctType = "savings";

    public Account() {
        this.setAcctNum(-1);
        this.setBalance(0);
        this.setAcctType("unknown");
    }

    public Account(long acctNum, float balance, String acctType) {
        this.setAcctNum(acctNum);
        this.setBalance(balance);
        this.setAcctType(acctType);
    }

    public long getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(long acctNum) {
        this.acctNum = acctNum;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }
}
