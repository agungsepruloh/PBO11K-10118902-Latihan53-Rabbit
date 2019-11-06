package com.pbo;

public class Animal {

    protected Boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public Boolean isVegetarian() {
        return this.vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}
