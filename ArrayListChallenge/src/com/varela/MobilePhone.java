package com.varela;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList;

    public MobilePhone() {
        this.contactList = new ArrayList<Contact>();
    }

    private ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void addContact(Contact contact) {
        if(existsInList(contact.getName())) {
            System.out.println("Contact with the same name already exists in the list");
        } else {
            contactList.add(contact);
        }
    }

    public void printContactList() {
        for(int i = 0; i < contactList.size(); i++) {
            System.out.println("Name: " + contactList.get(i).getName());
            System.out.println("Number: " + contactList.get(i).getNumber());
            System.out.println();
        }
    }

    public void modifyContact(int index, Contact newContact) {
        if(index >= 0) {
            contactList.set(index, newContact);
            System.out.println(newContact.getName() + " has been added to the contact list.");
        } else {
            System.out.println("The provided contact doesn't exist in the list.");
        }
    }

    public void removeContact(int index) {
        if(index >= 0) {
            contactList.remove(index);
        }
    }

    public int findContact(String name) {
        Contact targetContact = null;
        int indexOfContact = -1;
        for(int i = 0; i < contactList.size(); i++) {
            if(contactList.get(i).getName().equals(name)) {
                targetContact = contactList.get(i);
                indexOfContact = getContactList().indexOf(targetContact);
            }
        }

        return indexOfContact;
    }

    public boolean existsInList(String name) {
        int index = findContact(name);
        if(index >= 0) {
            return true;
        }

        return false;
    }
}

