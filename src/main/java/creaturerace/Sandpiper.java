package com.lenyek.versenye;

public class Sandpiper extends Creature{
//homokjáró


    String name;
    int availableWater;
    int maxWaterCapacity = 8;
    boolean isAlive = true;
    int travelledDistance = 0;

    public Sandpiper(String name, int availableWater) {
        this.name = name;
        this.availableWater = availableWater;
    }

    public String getName() {
        return name;
    }

    public int getTravelledDistance() {
        return travelledDistance;
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public int getAvailableWater() {
        return availableWater;
    }

    @Override
    public int getMaxWaterCapacity() {
        return maxWaterCapacity;
    }

    @Override
    public void waterConsumption(Weather w) {

       if (isAlive) {
           if (w.equals(Weather.S)) {
               availableWater = availableWater - 1;
           }
           if (w.equals(Weather.C)) {
               availableWater = availableWater - 0;
           }
           if (w.equals(Weather.R)) {
               availableWater = availableWater + 3;
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

     //   System.out.println(name + "has " + availableWater + " water yet.");
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
                travelledDistance = travelledDistance + 3;
            }
            if (w.equals(Weather.C)) {
                travelledDistance = travelledDistance + 1;
            }
            if (w.equals(Weather.R)) {
                travelledDistance = travelledDistance + 0;
            }
        }

       // System.out.println(name + "has " + travelledDistance + " distance travelled yet");
    }
}
