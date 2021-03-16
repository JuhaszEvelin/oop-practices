package com.garden;

public class Flower extends Plants {


    private String plantID;
    private int nutrientLevel;
    private boolean isAlive;

    public Flower(String plantID, int nutrientLevel) {
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
        //Víz esetén a mérete hárommal nő, tápoldat és műtrágya esetén eggyel csökken.
        //    A túlburjánzás határa 6.

        if (isAlive) {
            if (nutrients.equals(Nutrients.NONE)
                    || nutrients.equals(Nutrients.NUTRIENT)
                    || nutrients.equals(Nutrients.FERTILIZER)) {
                nutrientLevel = nutrientLevel - 1;
            } else if (nutrients.equals(Nutrients.WATER)) {
                nutrientLevel = nutrientLevel + 3;
            }
        }

        if (nutrientLevel <= 0 || nutrientLevel > 6) {
            isAlive = false;
        }
    }
}



