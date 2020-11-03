package com.varela;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank myBank = new Bank("Stillmunny Bank");

    public static void main(String[] args) {
        System.out.println("Welcome to " + myBank.getName());
        printInstructions();
        openBank();
    }

    public static void openBank() {
        boolean on = true;

        while (on) {
            System.out.println("\nPress (0 to print options) ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    createBranch();
                    break;
                case 2:
                    myBank.printBranches();
                    break;
                case 3:
                    displayCustomers();
                    break;
                case 4:
                    addCustomer();
                    break;
                case 5:
                    createTransaction();
                    break;
                case 6  :
                    System.out.println("Signing out...");
                    on = false;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("0 - Print instructions");
        System.out.println("1 - Create a new Branch");
        System.out.println("2 - Display all the branches of the bank");
        System.out.println("3 - Display customers and transactions of an existing branch");
        System.out.println("4 - Add a customer to an existing Branch");
        System.out.println("5 - Create a transaction for a customer in a branch");
        System.out.println("6 - Exit");
    }

    public static void createBranch() {
        System.out.print("Enter the name of the new branch: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the initial transaction amount of the new branch: ");
        double initialAmount = scanner.nextDouble();
        scanner.nextLine();

        Branch branch = new Branch(branchName, initialAmount);
        myBank.addBranch(branch);
    }

    public static void displayCustomers() {
        System.out.print("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        Branch branch = myBank.findBranch(branchName);

        if(branch != null) {
            branch.printCustomers();
        } else {
            System.out.println("No results for " + branchName);
        }
    }

    public static void addCustomer() {
        System.out.print("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        Branch branch = myBank.findBranch(branchName);

        if(branch != null) {
            System.out.println("Enter the name of the new customer: ");
            String name = scanner.nextLine();
            Customer customer = new Customer(name);
            branch.addCustomer(customer);
        } else {
            System.out.println("No results for " + branchName);
        }
    }

    public static void createTransaction() {
        System.out.print("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        Branch branch = myBank.findBranch(branchName);

        if(branch != null) {
            System.out.print("Enter the name of the customer: ");
            String customerName = scanner.nextLine();
            Customer customer = branch.findCustomer(customerName);

            System.out.println("Minimum transfer amount is: " + branch.getInitialTransactionAmount() + "€");
            System.out.print("Enter extra funds to transfer: (type 0 to skip) \r");
            double extraAmount = scanner.nextDouble();
            double amount = branch.getInitialTransactionAmount() + extraAmount;
            branch.performTransaction(customer, amount);
        } else {
            System.out.println("No results for " + branchName);
        }
    }
}
