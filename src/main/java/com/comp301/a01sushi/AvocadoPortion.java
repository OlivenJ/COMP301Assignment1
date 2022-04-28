package com.comp301.a01sushi;

public class AvocadoPortion extends IngredientPortionParent {
    private double amount;

    public AvocadoPortion(double amount) {
        super(new Avocado(), amount);
    }
}
