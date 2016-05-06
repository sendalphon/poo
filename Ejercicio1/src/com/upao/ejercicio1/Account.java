package com.upao.ejercicio1;


public class Account 
{
    public static final int ACCOUNTNUMBER=1234567;
    public static final double BALANCE=0.0;
    
    private int accountnumber;
    private double balance;
    
    
    public Account()
    {
        this.accountnumber=ACCOUNTNUMBER;
        this.balance=BALANCE;
    }
    public Account(int accountnumber, double balance) 
    {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountnumber=" + accountnumber + ", balance=" + balance + '}';
    }
    
    
}
