package com.garden;

public class Bush extends Plants {


    private String plantID;
    private int nutrientLevel;
    private boolean isAlive;

    public Bush(String plantID, int nutrientLevel) {
        this.plantID = plantID;
        this.nutrientLevel = nutrientLevel;
        this.isAlive = true;
    }

    public String getPlantID() {
        return plantID;
    }

    public int getNutrientLevel() {
        return nutrientLevel;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void gardening(Nutrients nutrients) {
        //Víz és műtrágya esetén a mérete eggyel nő, tápoldat esetén eggyel csökken.
        //    A túlburjánzás határa 10.

        if (isAlive) {
            if (nutrients.equals(Nutrients.NONE)
                    || nutrients.equals(Nutrients.NUTRIENT)) {
                nutrientLevel = nutrientLevel - 1;
            } else if (nutrients.equals(Nutrients.WATER)
                    || nutrients.equals(Nutrients.FERTILIZER)) {
                nutrientLevel = nutrientLevel + 1;
            }
        }

        if (nutrientLevel <= 0 || nutrientLevel > 10) {
            isAlive = false;
        }
    }
}




