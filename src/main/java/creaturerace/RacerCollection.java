package com.lenyek.versenye;

import java.util.ArrayList;

public class RacerCollection {

    ArrayList<Creature> racers = new ArrayList<Creature>();

    public void setRacers(Creature racer) {
        this.racers.add(racer);
    }

    public ArrayList<Creature> getRacers() {
        return racers;
    }
}
