package com.comp301.a01sushi;

public class IngredientPortionParent implements IngredientPortion {

    Ingredient ingredient;
    private double amount;

    public IngredientPortionParent(Ingredient ingredient, double amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("The amount shall not be negative.");
        }

        this.amount = amount;
        this.ingredient = ingredient;

    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return ingredient.getName();
    }

    public boolean getIsVegetarian() {
        return ingredient.getIsVegetarian();
    }

    public boolean getIsRice() {
        return ingredient.getIsRice();

    }

    public boolean getIsShellfish() {
        return ingredient.getIsShellfish();
    }

    public double getCalories() {
        return ingredient.getCaloriesPerOunce() * amount;
    }

    public double getCost() {
        return ingredient.getPricePerOunce() * amount;
    }

    public IngredientPortion combine(IngredientPortion other) {
        if (other == null) {
            return this;
        }

        if (other.getIngredient().equals(ingredient)) {
            throw new IllegalArgumentException("The ingredients shall be the same.");
        }

        double thisAmount = this.getAmount();
        double otherAmount = other.getAmount();

        return new IngredientPortionParent(this.getIngredient(), thisAmount + otherAmount);

    }
}
