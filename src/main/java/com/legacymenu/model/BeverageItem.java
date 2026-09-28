package com.legacymenu.model;

public class BeverageItem extends MenuItem{
    private double volumeLiters;
    public BeverageItem(String name, double price, double volumeLiters) {
        super(name, price);
        this.volumeLiters = volumeLiters;
    }

    public double getVolumeLiters() {return volumeLiters;}

    @Override
    public String getDetails() {
        return "Beverage: " + getName() + " | Volume: " + getVolumeLiters() + "L | Price: " + getPrice();
    }
}
