package com.lenyek.versenye;

public class Sponge extends Creature{
//szivacs

    //az egyedi neve, a rendelkezésre álló víz mennyisége, amaximálisan tárolható víz mennyisége, hogy él-e,
    // illetve az eddig megtett távolság
    //lények extends homokjáró, szivacs, lépegető.

    String name;
    int availableWater;
    int maxWaterCapacity = 20;
    boolean isAlive = true;
    int travelledDistance = 0;

    public Sponge(String name, int availableWater) {
        this.name = name;
        this.availableWater = availableWater;
    }

    public String getName() {
        return name;
    }

    public int getTravelledDistance() {
        return travelledDistance;
    }

    public int getAvailableWater() {
        return availableWater;
    }

    public int getMaxWaterCapacity() {
        return maxWaterCapacity;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void waterConsumption(Weather w) {

        if (isAlive) {
            if (w.equals(Weather.S)) {
                availableWater = availableWater - 4;
            }
            if (w.equals(Weather.C)) {
                availableWater = availableWater - 1;
            }
            if (w.equals(Weather.R)) {
                availableWater = availableWater + 6;
            }
        }
        if (availableWater <= 0){
            availableWater = 0;
            isAlive = false;
            System.out.println(name + " is dead!");
        }

        if (availableWater > maxWaterCapacity){
            availableWater = maxWaterCapacity;
        }

       // System.out.println(name + "has " + availableWater + " water yet.");


    }


    @Override
    public void progress(Weather w) {
        if (availableWater <= 0){
            availableWater = 0;
            isAlive = false;
            System.out.println(name + " is dead, cannot move anymore!");
        }

        if (isAlive) {
            if (w.equals(Weather.S)) {
                travelledDistance = travelledDistance + 0;
            }
            if (w.equals(Weather.C)) {
                travelledDistance = travelledDistance + 1;
            }
            if (w.equals(Weather.R)) {
                travelledDistance = travelledDistance + 3;
            }
        }
     //   System.out.println(name + "has " + travelledDistance + " distance travelled yet");
    }
}
