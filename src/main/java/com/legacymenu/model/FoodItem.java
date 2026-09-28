package main.java.com.legacymenu.model;
import java.util.List;

public class FoodItem extends MenuItem {
    private List<String> allegrens;

    public FoodItem(String name, double price, List<String> allegrens) {
        super(name, price);
        this.allegrens = allegrens;
    }

    public List<String> getAlgrens() {return allegrens;}

    @Override
    public String getDetails() {
        return "Food: " + getName() + " | Allergens: " + allegrens + " | Price: " + getPrice();
    }
}
