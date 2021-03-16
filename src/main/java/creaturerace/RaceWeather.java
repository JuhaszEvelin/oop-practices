package com.lenyek.versenye;

import java.util.ArrayList;
import java.util.Arrays;

public class RaceWeather {

// n = napos, f = felhős és e = esős: nffeeennf
    ArrayList<Weather> weathers = new ArrayList<>(Arrays.asList(Weather.S, Weather.C, Weather.C, Weather.R,
        Weather.R, Weather.R, Weather.S, Weather.S, Weather.C));

    public ArrayList<Weather> getWeathers() {
        return weathers;
    }

}
