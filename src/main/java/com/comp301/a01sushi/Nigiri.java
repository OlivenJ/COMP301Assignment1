package com.comp301.a01sushi;

public class Nigiri implements Sushi {
    public enum NigiriType {TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP}

    ;

    private double seafoodAmount = 0.75;
    private double riceAmount = 0.5;
    private IngredientPortion[] plate = new IngredientPortion[2];
    private String name;

    public Nigiri(NigiriType type) {
        switch (type) {
            case TUNA:
                plate[0] = new RicePortion(riceAmount);
                plate[1] = new TunaPortion(seafoodAmount);
                name = "tuna nigiri";
                break;
            case YELLOWTAIL:
                plate[0] = new RicePortion(riceAmount);
                plate[1] = new TunaPortion(seafoodAmount);
                name = "yellowtail nigiri";
                break;
            case EEL:
                plate[0] = new RicePortion(riceAmount);
                plate[1] = new EelPortion(seafoodAmount);
                name = "eel nigiri";
                break;
            case CRAB:
                plate[0] = new RicePortion(riceAmount);
                plate[1] = new CrabPortion(seafoodAmount);
                name = "eel nigiri";
                break;
            case SHRIMP:
                plate[0] = new RicePortion(riceAmount);
                plate[1] = new ShrimpPortion(seafoodAmount);
                name = "shrimp nigiri";
                break;
        }

    }

    public String getName() {
        return name;
    }

    public IngredientPortion[] getIngredients() {
        return plate;

    }

    public int getCalories() {
        int totalCalories = 0;
        int length = plate.length;
        for (int i = 0; i < length; i++) {
            totalCalories += (int) Math.round(plate[i].getCalories());
        }
        return totalCalories;
    }

    public double getCost() {
        double totalCost = 0.0;
        int length = plate.length;
        for (int i = 0; i < length; i++) {
            totalCost += plate[i].getCost();
        }
        return totalCost;
    }

    public boolean getHasRice() {
        return true;
    }

    public boolean getHasShellfish() {
        boolean result = false;
        int length = plate.length;
        for (int i = 0; i < length; i++) {
            if (plate[i].getIsShellfish()) {
                result = true;
            }
        }
        return result;
    }

    public boolean getIsVegetarian() {
        return false;

    }

}
