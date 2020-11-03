package com.varela;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        setTonerLevel(tonerLevel);
        this.numberOfPagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    private void setTonerLevel(int tonerLevel) {
        if(tonerLevel > 100) {
            this.tonerLevel = 100;
        } else if(tonerLevel < 0) {
            this.tonerLevel = 0;
            System.out.println("Attention: You placed an empty toner!");
        } else {
            this.tonerLevel = tonerLevel;
        }
    }

    public void fillToner() {
        this.tonerLevel = 100;
        System.out.println("Toner level filled up to the max");
    }

    public void printPage() {
        if(isDuplexPrinter) {
            this.numberOfPagesPrinted += 2;
            System.out.println("Printed 2 pages");
        } else {
            this.numberOfPagesPrinted++;
            System.out.println("Printed 1 page");
        }
    }
}
