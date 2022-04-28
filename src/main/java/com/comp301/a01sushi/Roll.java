package com.comp301.a01sushi;

public class Roll implements Sushi {

    private String name;
    private double price;
    private int calories;
    private boolean isVegetarian;
    private boolean hasRice;
    private boolean hasShellfish;
    private IngredientPortion[] plate;

    public Roll(String name, IngredientPortion[] roll_ingredients) {
        

        this.name = name;
        this.plate = roll_ingredients;

        int length = roll_ingredients.length;

    }

}
