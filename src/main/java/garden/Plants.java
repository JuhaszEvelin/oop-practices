package com.garden;

public abstract class Plants {


    public abstract String getPlantID();

    public abstract int getNutrientLevel();

    public abstract boolean isAlive();

    public abstract void gardening(Nutrients nutrients);

    @Override
    public String toString() {
        return "Plant " + getPlantID() + " alive: " + isAlive() + " nutrient level: " + getNutrientLevel();
    }
}
