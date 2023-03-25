package Q3_Q4;

import java.util.Date;

public class Transaction {
    private Date dateOfTransaction;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        dateOfTransaction = new Date(); //LocalDateTime
    }

    @Override
    public String toString() {
        return "\nType: " + type +
                "\nAmount: RM" + amount +
                "\nBalance: RM" + balance +
                "\nDescription: " + description + " RM" + balance;
    }
}
