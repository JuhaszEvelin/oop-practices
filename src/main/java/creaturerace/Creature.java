package com.lenyek.versenye;

public abstract class Creature {

    public abstract String getName();
    public abstract int getTravelledDistance();
    public abstract boolean isAlive();
    public abstract int getAvailableWater();
    public abstract int getMaxWaterCapacity();


    public abstract void waterConsumption(Weather w);

    public abstract void progress(Weather w);

}

