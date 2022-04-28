package com.comp301.a01sushi;

public class Sashimi implements Sushi {

    public enum SashimiType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP}

    ;
    private double amount = 0.75;
    private String name;
    private IngredientPortion plate;


    public Sashimi(SashimiType type) {

        switch (type) {
            case TUNA:
                plate = new TunaPortion(amount);
                name = "tuna sashimi";
                break;
            case YELLOWTAIL:
                plate = new YellowtailPortion(amount);
                name = "yellowtail sashimi";
                break;
            case EEL:
                plate = new EelPortion(amount);
                name = "eel sashimi";
                break;
            case CRAB:
                plate = new CrabPortion(amount);
                name = "crab sashimi";
                break;
            case SHRIMP:
                plate = new ShrimpPortion(amount);
                name = "shrimp sashimi";
                break;
        }
    }

    public String getName() {
        return name;
    }

    public IngredientPortion[] getIngredients() {
        IngredientPortion[] ingredientList = {plate};


        return ingredientList;
        //TODO not sure
    }

    public int getCalories() {
        return (int) Math.round(plate.getCalories());
    }

    public double getCost() {
        return plate.getCost();
    }

    public boolean getHasRice() {
        return plate.getIsRice();
    }

    public boolean getHasShellfish() {
        return plate.getIsShellfish();
    }

    public boolean getIsVegetarian() {
        return plate.getIsVegetarian();
    }
}
