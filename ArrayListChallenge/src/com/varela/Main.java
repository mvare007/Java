package com.varela;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
	    boolean on = true;
	    int option = 0;

	    mainMenu();
	    while(on) {
            System.out.println("Select an option:");
            option = scanner.nextInt();

            switch(option) {
                case 0:
                    mainMenu();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    on = false;
                    break;
            }

        }
    }

    private static void mainMenu() {
        System.out.println("\nPress:");
        System.out.println("\t 0 - Show all the options");
        System.out.println("\t 1 - Display the list of contacts");
        System.out.println("\t 2 - Add a contact");
        System.out.println("\t 3 - Modify a contact");
        System.out.println("\t 4 - Delete a contact");
        System.out.println("\t 5 - Search for a contact");
        System.out.println("\t 6 - Turn off");
    }

    private static void add() {
        System.out.print("Enter contact name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        int number = scanner.nextInt();
        Contact newContact = Contact.createContact(name, number);
        mobilePhone.addContact(newContact);
    }

    private static void modify() {
        System.out.print("Enter the name of the contact you wish to modify: ");
        scanner.nextLine();

        String currentContactName = scanner.nextLine();
        int currentContactIndex = mobilePhone.findContact(currentContactName);

        System.out.print("Enter the new name of the contact: ");
        String newContactName = scanner.nextLine();
        System.out.print("Enter the new number of the contact: ");
        int number = scanner.nextInt();

        mobilePhone.modifyContact(currentContactIndex, new Contact(newContactName, number));
    }

    private static void remove() {
        System.out.print("Enter the name of the contact you want to delete:\r");
        scanner.nextLine();
        String name = scanner.nextLine();
        int contactIndex = mobilePhone.findContact(name);
        mobilePhone.removeContact(contactIndex);
    }

    private static void search() {
        System.out.print("Enter the name of the contact: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        if(mobilePhone.existsInList(name)) {
            System.out.println(name + " exists in the contact list");
        } else {
            System.out.println(name + " isn't present in the contact list");
        }
    }
}
