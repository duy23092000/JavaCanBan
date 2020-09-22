package test17;

import java.util.Date;

public class Account {
    private int accountID;
    private double accountBalance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){

    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Account(int accountID, double accountBalance) {
        this.accountID = accountID;
        this.accountBalance = accountBalance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12) * 100;
    }

    public void deposit (double depositAmount) {
        accountBalance += depositAmount;
    }

    public void withdraw (double withdrawAmount) {
        if (withdrawAmount <= accountBalance){
            accountBalance -= withdrawAmount;
        }
        else{
            System.out.println("Số dư không đủ!");
        }
    }


}
