package com.garden;

public class Cactus extends Plants {


    private String plantID;
    private int nutrientLevel;
    private boolean isAlive;

    public Cactus(String plantID, int nutrientLevel) {
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
        //Víz esetén a mérete eggyel csökken, tápoldat esetén eggyel nő, műtrágya esetén eggyel nő. A túlburjánzás határa 4.

        if (isAlive) {
            if (nutrients.equals(Nutrients.NONE)
                    || nutrients.equals(Nutrients.WATER)) {
                nutrientLevel = nutrientLevel - 1;
            } else if (nutrients.equals(Nutrients.NUTRIENT)
                    || nutrients.equals(Nutrients.FERTILIZER)) {
                nutrientLevel = nutrientLevel + 1;
            }
        }

        if (nutrientLevel <= 0 || nutrientLevel > 4) {
            isAlive = false;
        }
    }
}
