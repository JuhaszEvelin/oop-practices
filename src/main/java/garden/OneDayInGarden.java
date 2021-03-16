package com.garden;

import java.util.ArrayList;

public class OneDayInGarden {

    public static void oneDayInTheGarden(){
/**A szimulációban az alábbi növények vegyenek részt (fajta, azonosító, kezdő tápanyagszint):
 Virág V102 3
 Bokor B223 4
 Kaktusz K15 2
 Kaktusz K18 1
 A szimuláció 5 napig tart, és az alábbi tápanyagokat kapják a növények egységesen: víz, tápoldat, semmi, víz, műtrágya*/

        ArrayList<Nutrients> nutriList = new ArrayList<Nutrients>();
        nutriList.add(Nutrients.WATER);
        nutriList.add(Nutrients.NUTRIENT);
        nutriList.add(Nutrients.NONE);
        nutriList.add(Nutrients.WATER);
        nutriList.add(Nutrients.FERTILIZER);

        Plants f = new Flower("V102", 3);
        Plants b = new Bush("B223", 4);
        Plants c1 = new Cactus("K15", 2);
        Plants c2 = new Cactus("K18", 1);

        ArrayList<Plants> plants = new ArrayList<Plants>();
        plants.add(f);
        plants.add(b);
        plants.add(c1);
        plants.add(c2);

        int i = 1;
        for (Nutrients nutrient:nutriList){
            System.out.println();
            System.out.println(i + ". day we give: " + nutrient.toString());

            for (Plants plant:plants) {
                plant.gardening(nutrient);
                System.out.println(plant.toString());

            }
            i++;
        }

    }
}
