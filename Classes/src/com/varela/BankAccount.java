package com.varela;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void depositFunds(double funds) {
        this.balance += funds;
        System.out.println("Deposited " + funds + "$ in the account.");
        System.out.println("Current balance is: " + this.balance + "$");
    }

    public void withdrawFunds(double funds) {
        if (this.balance < funds) {
            System.out.println("Not enough funds in the account.");
        } else {
            this.balance -= funds;
            System.out.println("Withdrew " + funds + "$ from the account.");
            System.out.println("Current balance is: " + this.balance + "$");
        }
    }

}
