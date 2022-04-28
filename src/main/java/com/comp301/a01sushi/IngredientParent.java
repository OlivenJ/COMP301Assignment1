package com.comp301.a01sushi;

public class IngredientParent implements Ingredient {

    private String name;
    private double price;
    private int calories;
    private boolean isVegetarian;
    private boolean hasRice;
    private boolean hasShellfish;

    public IngredientParent(String name, double price,
                            int calories, boolean vegetarian,
                            boolean rice, boolean shellfish) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.isVegetarian = vegetarian;
        this.hasRice = rice;
        this.hasShellfish = shellfish;
    }

    public String getName() {
        return name;

    }

    public double getCaloriesPerDollar() {
        return calories / price;

    }

    public int getCaloriesPerOunce() {
        return calories;

    }

    public double getPricePerOunce() {
        return price;

    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    public boolean getIsRice() {
        return hasRice;
    }

    public boolean getIsShellfish() {
        return hasShellfish;
    }

    public boolean equals(Ingredient other) {

        if (other == null) {
            return false;
        }

        if (other.getName().equals(this.name)
                && other.getCaloriesPerOunce() == this.calories
                && other.getPricePerOunce() == this.price //TODO this is not correct
                && other.getIsVegetarian() == this.isVegetarian
                && other.getIsRice() == this.hasRice
                && other.getIsShellfish() == this.hasShellfish) {
            return true;
        } else {
            return false;
        }
    }
}
