package com.varela;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public void addBranch(Branch branch) {
        if(branchExists(branch)) {
            System.out.println("Error - Branch " + branch.getName() + " already exists");
        } else {
            branches.add(branch);
            System.out.println("Branch -> " + branch.getName() + " created successfully");
        }
    }

    public void addCustomerToBranch(Branch branch, Customer customer) {
        branch.addCustomer(customer);
        branch.performTransaction(customer, branch.getInitialTransactionAmount());
    }

    public void printBranches() {
        for(int i = 0; i < branches.size(); i++) {
            System.out.println(i + " -> " + branches.get(i).getName());
        }
    }

    private boolean branchExists(Branch branch) {
        boolean exists = false;
        for(int i = 0; i < branches.size(); i++) {
            if(branches.get(i).getName().equals(branch.getName())) {
                exists = true;
            }
        }

        return exists;
    }

    public Branch findBranch(String name) {
        Branch branch = null;
        for(int i = 0; i < branches.size(); i++) {
            if(branches.get(i).getName().equals(name)) {
                branch = branches.get(i);
            }
        }

        return branch;
    }
}
