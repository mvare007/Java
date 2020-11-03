package com.varela;

public class DeluxeBurguer extends Hamburger {

    public DeluxeBurguer(String meat, String breadRollType) {
        super(meat, breadRollType, new Ingredient("Chips", 2), new Ingredient("Drink", 3));
    }

    @Override
    public void setAddition1(Ingredient addition1) {
        System.out.println("Unable to add ingredients to the Deluxe Burguer!");
    }

    @Override
    public void setAddition2(Ingredient addition2) {
        System.out.println("Unable to add ingredients to the Deluxe Burguer!");
    }

    @Override
    public void setAddition3(Ingredient addition3) {
        System.out.println("Unable to add ingredients to the Deluxe Burguer!");
    }

    @Override
    public void setAddition4(Ingredient addition4) {
        System.out.println("Unable to add ingredients to the Deluxe Burguer!");
    }
}
