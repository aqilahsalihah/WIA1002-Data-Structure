package Q3_Q4;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Account myAcc = new Account(1122, 20000);
        myAcc.setAnnualInterestRate(4.5);
        myAcc.withdraw(2500);
        myAcc.deposit(3000);

        System.out.println("Balance: RM" + myAcc.getBalance());
        System.out.println("Monthly Interest: " + myAcc.getMonthlyInterest());
        System.out.println("Date created: " + myAcc.getDateCreated());


        Account1 myAcc2 = new Account1("George", 1122, 1000);
        myAcc2.setAnnualInterestRate(1.5);
        myAcc2.deposit(30);
        myAcc2.deposit(40);
        myAcc2.deposit(50);
        myAcc2.withdraw(5);
        myAcc2.withdraw(4);
        myAcc2.withdraw(2);

        System.out.println("\nAccount Holder: " +myAcc2.getName());
        System.out.println("Balance: " + myAcc2.getBalance());
        System.out.println("Monthly Interest: " + myAcc2.getMonthlyInterest());
        System.out.println("Date created: " + myAcc2.getDateCreated());
        System.out.println("Transaction History:");
        myAcc2.displayTransaction();

    }
}
