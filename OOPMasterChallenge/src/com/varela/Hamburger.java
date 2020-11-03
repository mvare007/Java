package com.varela;


public class Hamburger {

    private String meat;
    private String breadRollType;
    private Ingredient addition1;
    private Ingredient addition2;
    private Ingredient addition3;
    private Ingredient addition4;
    private int basePrice;
    private int finalPrice;

    public Hamburger(String meat, String breadRollType) {
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String meat, String breadRollType, Ingredient addition1) {
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.addition1 = addition1;
        this.basePrice = 4;
        this.finalPrice = this.basePrice + getAdditionsPrice();
    }

    public Hamburger(String meat, String breadRollType, Ingredient addition1, Ingredient addition2) {
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.basePrice = 4;
        this.finalPrice = this.basePrice + getAdditionsPrice();
    }

    public Hamburger(String meat, String breadRollType, Ingredient addition1, Ingredient addition2, Ingredient addition3) {
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.basePrice = 4;
        this.finalPrice = this.basePrice + getAdditionsPrice();
    }

    public Hamburger(String meat, String breadRollType, Ingredient addition1, Ingredient addition2, Ingredient addition3, Ingredient addition4) {
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        this.basePrice = 4;
        this.finalPrice = this.basePrice + getAdditionsPrice();
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getFinalPrice() {
        int finalPrice = getBasePrice() + getAdditionsPrice();
        System.out.println("The Final price for the " + getClass().getSimpleName() + " is: " + finalPrice);

        return finalPrice;
    }

    public int getAdditionsPrice() {
        int additionsPrice = 0;

        if(this.addition1 != null) {
            System.out.println(this.addition1.getName() + " price is: " + this.addition1.getPrice());
            additionsPrice += this.addition1.getPrice();
        }
        if(this.addition2 != null) {
            System.out.println(this.addition2.getName() + " price is: " + this.addition2.getPrice());
            additionsPrice += this.addition2.getPrice();
        }
        if(this.addition3 != null) {
            System.out.println(this.addition3.getName() + " price is: " + this.addition3.getPrice());
            additionsPrice += this.addition3.getPrice();
        }
        if(this.addition4 != null) {
            System.out.println(this.addition4.getName() + " price is: " + this.addition4.getPrice());
            additionsPrice += this.addition4.getPrice();
        }

        return additionsPrice;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setAddition1(Ingredient addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(Ingredient addition2) {
        this.addition2 = addition2;
    }

    public void setAddition3(Ingredient addition3) {
        this.addition3 = addition3;
    }

    public void setAddition4(Ingredient addition4) {
        this.addition4 = addition4;
    }
}
