package Q3_Q4;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    //constructor
    public Account() {}
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    //accessor & mutator
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    //method
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }
    public double getMonthlyInterest(){
        return getMonthlyInterestRate()*balance;
    }

    public void withdraw(double amount){
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("insufficient balance");
    }
    public void deposit(double amount){
        balance += amount;
    }
}
