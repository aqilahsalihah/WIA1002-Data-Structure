package Q3_Q4;

import java.util.ArrayList;
import java.util.Scanner;

public class Account1 extends Account{
    Scanner in = new Scanner(System.in);

    private String name;
    private ArrayList transaction;

    //constructor
    public Account1(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
        transaction = new ArrayList<Transaction>();

    }

    //accessor mutator
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList getTransaction() {
        return transaction;
    }

    public void withdraw(double amount){
        if (amount <= getBalance()) {
            double balance = getBalance() - amount;
            setBalance(balance);
//            System.out.print("Enter description:");
//            String s = in.nextLine();
            transaction.add(new Transaction('W', amount,balance,"withdraw"));
        }else
            System.out.println("insufficient balance");
    }

    public void deposit(double amount){
        double balance = getBalance() + amount;
        setBalance(balance);
        transaction.add(new Transaction('D', amount, balance, "deposit"));
    }

    public void displayTransaction(){
        for (int i = 0; i < transaction.size(); i++) {
            System.out.println(transaction.get(i).toString());
        }
    }
}
