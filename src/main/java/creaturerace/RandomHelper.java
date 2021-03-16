package com.lenyek.versenye;

import java.util.ArrayList;
import java.util.Random;

public class RandomHelper {

    private static final Random RANDOM = new Random();


    public String getRandomName() {
        String randomName = chooseOne(POSSIBLE_NAMES);
        return randomName;
    }

    public int getRandomWater(){
        int randomNum = 3 + (int)(Math.random() * ((10 - 3) + 1));
        return randomNum;
    }

    public ArrayList<Weather> getrandomWeather(int round){
        ArrayList<Weather> w = new ArrayList<Weather>();
        w.add(Weather.C);
        w.add(Weather.R);
        w.add(Weather.S);

        for (int i = 0; i < round-3; i++){
            Weather temp = w.get(nextInt(0, (w.size()-1)));
            w.add(temp);
        }

        return w;
    }

    private static final String[] POSSIBLE_NAMES = {
            "Epiphany",
            "Parallel",
            "Blitz",
            "Eos",
            "Evolution",
            "Wolf",
            "Union",
            "Empyrean",
            "Curiosity",
            "Gallop"
    };

    public static String chooseOne(String[] possibilities) {
        if (possibilities == null || possibilities.length < 1) {
            final String msg =
                    "Possibilities should be a non-empty array of strings.";
            throw new IllegalArgumentException(msg);
        }

        return possibilities[nextInt(0, possibilities.length)];
    }

    public static int nextInt(int upper) {
        return RANDOM.nextInt(upper);
    }
    public static int nextInt(int lower, int upper) {
        return lower + nextInt(upper - lower);
    }

}
