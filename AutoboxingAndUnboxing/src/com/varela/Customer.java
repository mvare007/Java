package com.varela;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public void printTransactions() {
        for(int i = 0; i < transactions.size(); i++) {
            System.out.println(i + " -> " + transactions.get(i).doubleValue()+ "€");
        }
    }
}
