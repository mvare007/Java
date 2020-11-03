package com.varela;

import java.util.ArrayList;

public class Branch {
    private String name;
    private double initialTransactionAmount;
    private ArrayList<Customer> customers;

    public Branch(String name, double initialTransactionAmount) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
        this.initialTransactionAmount = initialTransactionAmount;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public double getInitialTransactionAmount() {
        return initialTransactionAmount;
    }

    public void addCustomer(Customer customer) {
        if(customerExists(customer)) {
            System.out.println("Error - Customer with the same name already exists");
        } else {
            customers.add(customer);
            System.out.println(customer.getName() + " added to " + this.getName());
        }
    }

    public void performTransaction(Customer customer, double extraAmount) {
        if(customerExists(customer)) {
            double amount = initialTransactionAmount + extraAmount;
            customer.addTransaction(amount);
        } else {
            System.out.println("Error - Customer not found");
        }
    }

    public void printCustomers() {
        for(int i = 0; i < customers.size(); i++) {
            System.out.println(i + " -> " + customers.get(i).getName());
            customers.get(i).printTransactions();
            System.out.println();
        }
    }

    private boolean customerExists(Customer customer) {
        if(customer == null) {
            return false;
        }

        boolean exists = false;
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(customer.getName())) {
                exists = true;
            }
        }

        return exists;
    }

    public Customer findCustomer(String name) {
        Customer customer = null;
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(name)) {
                customer = customers.get(i);
            }
        }

        return customer;
    }
}
