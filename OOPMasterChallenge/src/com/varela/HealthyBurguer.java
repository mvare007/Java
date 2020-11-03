package com.varela;

public class HealthyBurguer extends Hamburger {

    private Ingredient addition5;
    private Ingredient addition6;

    public HealthyBurguer(String meat) {
        super(meat, "Brown Rye Bread Roll");
    }

    public HealthyBurguer(String meat, Ingredient addition1) {
        super(meat, "Brown Rye Bread Roll", addition1);
    }

    public HealthyBurguer(String meat, Ingredient addition1, Ingredient addition2) {
        super(meat, "Brown Rye Bread Roll", addition1, addition2);
    }

    public HealthyBurguer(String meat, Ingredient addition1, Ingredient addition2, Ingredient addition3) {
        super(meat, "Brown Rye Bread Roll", addition1, addition2, addition3);
    }

    public HealthyBurguer(String meat, Ingredient addition1, Ingredient addition2, Ingredient addition3, Ingredient addition4) {
        super(meat, "Brown Rye Bread Roll", addition1, addition2, addition3, addition4);
    }

    public HealthyBurguer(String meat, Ingredient addition1, Ingredient addition2,
                          Ingredient addition3, Ingredient addition4, Ingredient addition5) {

        super(meat, "Brown Rye Bread Roll", addition1, addition2, addition3, addition4);
        this.addition5 = addition5;
    }

    public HealthyBurguer(String meat, Ingredient addition1, Ingredient addition2,
                          Ingredient addition3, Ingredient addition4, Ingredient addition5, Ingredient addition6) {

        super(meat, "Brown Rye Bread Roll", addition1, addition2, addition3, addition4);
        this.addition5 = addition5;
        this.addition6 = addition6;
    }

    public void setAddition5(Ingredient addition5) {
        this.addition5 = addition5;
    }

    public void setAddition6(Ingredient addition6) {
        this.addition6 = addition6;
    }

    @Override
    public int getAdditionsPrice() {
        int additionsPrice = 0;
        if(this.addition5 != null) {
            System.out.println(this.addition5.getName() + " price is: " + this.addition5.getPrice());
            additionsPrice += this.addition5.getPrice();
        }
        if(this.addition6 != null) {
            System.out.println(this.addition6.getName() + " price is: " + this.addition6.getPrice());
            additionsPrice += this.addition6.getPrice();
        }
        return (super.getAdditionsPrice() + additionsPrice);
    }
}
