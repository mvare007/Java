package com.varela;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ", " + groceryList.get(i));
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + position + " has been modified.");
    }

    public void removeGroceryItem(String newItem) {
        int position = findItem(newItem);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

//    public String findItem(String searchItem) {
//        // boolean exists = groceryList.contains(searchItem);
//
//        int position = groceryList.indexOf(searchItem);
//        if(position >= 0) {
//            return groceryList.get(position);
//        }
//
//        return null;
//    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }

        return false;
    }
}
