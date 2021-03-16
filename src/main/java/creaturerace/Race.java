package com.lenyek.versenye;

import java.util.ArrayList;

public class Race {

    /**
     * A versenyzők a következők legyenek:
     * <p>
     * Vandor a homokjáró, 4 egység kezdeti vízzel
     * Seta a lépegető, 7 egység vizet vitt magával
     * Csuszo a szivacs, 12 egység vitt magával
     * Siklo a szivacs, 10 egyszég vizet vitt magával.
     */


    public static void race() {

        Creature vandor = new Sandpiper("Vandor", 4);
        Creature seta = new Stepper("Seta", 7);
        Creature csusza = new Sponge("Csusza", 12);
        Creature siklo = new Sponge("Siklo", 10);

        RacerCollection racers = new RacerCollection();
        racers.setRacers(vandor);
        racers.setRacers(seta);
        racers.setRacers(csusza);
        racers.setRacers(siklo);

        RaceWeather raceWeather = new RaceWeather();

        for (Weather w : raceWeather.getWeathers()) {
            System.out.println();
            System.out.println("The weather is " + w);
            System.out.println();
            for (Creature racer : racers.getRacers()) {
                racer.waterConsumption(w);
                racer.progress(w);

                System.out.println();
                System.out.print(racer.getName());
                printTraveledDistance(racer.getTravelledDistance());
                System.out.println(" TRAVELED DISTANCE: " + racer.getTravelledDistance() + " AVAILABLE WATER: "
                + racer.getAvailableWater() + " MAX WATERCAPACITY: " + racer.getMaxWaterCapacity() +
                        " ALIVE: " + racer.isAlive());

            }

        }

        String winnerName = " DONTETLEN ";
        int winnerDistance = racers.getRacers().get(0).getTravelledDistance();
        for (Creature racer : racers.getRacers()) {
            if (racer.isAlive() && racer.getTravelledDistance() > winnerDistance) {
                winnerDistance = racer.getTravelledDistance();
                winnerName = racer.getName();
            } else if (racer.isAlive() && racer.getTravelledDistance() == winnerDistance){
                winnerName += " " + racer.getName() +", ";
            }
        }

        System.out.println("*************************************************************");
        System.out.println("THE WINNER IS");
        System.out.println();
        System.out.println();
        System.out.println("*** " + winnerName + " ***" );
        System.out.println();
        System.out.println(winnerName + " traveled: " + winnerDistance);

    }

    private static void printTraveledDistance(int dist){
        final String RED = "\033[0;31m";
        final String RESET = "\033[0m";

        for (int i = 0; i < dist; i ++){
            System.out.printf(RED + "--");
        }
        System.out.println(RESET);

    }

    public static void randomRace() {

        RandomHelper n = new RandomHelper();
        Creature c1 = new Sandpiper(n.getRandomName(), n.getRandomWater());
        Creature c2 = new Stepper(n.getRandomName(), n.getRandomWater());
        Creature c3 = new Sponge(n.getRandomName(), n.getRandomWater());

        RacerCollection racers = new RacerCollection();
        racers.setRacers(c1);
        racers.setRacers(c2);
        racers.setRacers(c3);

        ArrayList<Weather> raceWeather = n.getrandomWeather(10);

        for (Weather w : raceWeather) {
            System.out.println();
            System.out.println("The weather is " + w);
            System.out.println();
            for (Creature racer : racers.getRacers()) {
                racer.waterConsumption(w);
                racer.progress(w);

                System.out.println();
                System.out.print(racer.getName());
                printTraveledDistance(racer.getTravelledDistance());
                System.out.println(" TRAVELED DISTANCE: " + racer.getTravelledDistance() + " AVAILABLE WATER: "
                        + racer.getAvailableWater() + " MAX WATERCAPACITY: " + racer.getMaxWaterCapacity() +
                        " ALIVE: " + racer.isAlive());

            }

        }

        String winnerName = "DONTETLEN: ";
        int winnerDistance = 0;
        for (Creature racer : racers.getRacers()) {
            if (racer.isAlive() && racer.getTravelledDistance() > winnerDistance) {
                winnerDistance = racer.getTravelledDistance();
                winnerName = racer.getName();
            }else if (racer.isAlive() && racer.getTravelledDistance() == winnerDistance){
                winnerName += " " + racer.getName() +", ";
            }
        }

        System.out.println("*************************************************************");
        System.out.println("THE WINNER IS");
        System.out.println();
        System.out.println();
        System.out.println("*** " + winnerName + " ***" );
        System.out.println();
        System.out.println(winnerName + " traveled: " + winnerDistance);

    }

}
