import java.util.ArrayList;

public class OneDay {

    public static void oneDayOnThePlanet() {

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Puffs("Puffancs"));
        plants.add(new Deltatree("Deltafa"));
        plants.add(new Parabush("Parabokor"));

        for (int i = 1; i < 11; i++) {
            Radiation radiation = Radiation.NONE;

            if (Plant.deltaRadiationDemand - 3 >= Plant.alphaRadiationDemand) {
                radiation = Radiation.DELTA;
            }

            if (Plant.alphaRadiationDemand - 3 >= Plant.deltaRadiationDemand) {
                radiation = Radiation.ALPHA;
            }
            System.out.println("------------------------------------");
            System.out.println("DAY " + i + " : " + radiation);

            Plant.deltaRadiationDemand = 0;
            Plant.alphaRadiationDemand = 0;

            for (Plant p : plants) {
                p.reaction(radiation);
                p.plantsAlive();
//                System.out.println(p.toString());
            }

            System.out.println();
            System.out.println("Alphademands: " + Plant.alphaRadiationDemand);
            System.out.println("Deltademand: " + Plant.deltaRadiationDemand);
            System.out.println();

            if (i == 1 || i == 2 || i == 10) {
                for (Plant p : plants) {
                    System.out.println(p.toString());
                }
            }

        }


    }


}
