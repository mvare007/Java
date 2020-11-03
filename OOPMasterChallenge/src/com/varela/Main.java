package com.varela;

public class Main {

    public static void main(String[] args) {
        Ingredient lettuce = new Ingredient("Lettuce", 1);
        Ingredient friedOnion = new Ingredient("Fried Onions", 1);
        Ingredient pickles = new Ingredient("Pickles", 1);
        Ingredient hotSauce = new Ingredient("Hot Sauce", 1);
        Ingredient garlicSauce = new Ingredient("Garlic Sauce", 2);
        Ingredient largeChips = new Ingredient("Large Chips", 3);

        Hamburger hamburger = new Hamburger("Pork", "Whole Wheat", lettuce, friedOnion, pickles, largeChips);
        hamburger.getFinalPrice();

        HealthyBurguer healthyBurguer = new HealthyBurguer("Chicken", garlicSauce, hotSauce, largeChips, largeChips, friedOnion, pickles);
        healthyBurguer.getAdditionsPrice();
        System.out.println(healthyBurguer.getFinalPrice());


        DeluxeBurguer deluxeBurguer = new DeluxeBurguer("Beef", "Sesame Bread");
        deluxeBurguer.getAdditionsPrice();
        System.out.println(deluxeBurguer.getBasePrice());
        System.out.println(deluxeBurguer.getFinalPrice());


    }
}
