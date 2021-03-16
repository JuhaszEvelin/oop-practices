package robots;

public class Simulation {

    /**
     * A szimuláció 4 napig tart. Minden nap rátöltünk a robotokra a lentiek szerint:
     * • 1. nap ◦ töltés mennyisége: 3 ◦ Beérkezett áruk mennyisége: 20
     * • 2. nap ◦ töltés mennyisége: 2 ◦ Beérkezett áruk mennyisége: 32
     * • 3. nap ◦ töltés mennyisége: 5 ◦ Beérkezett áruk mennyisége: 20
     * • 4. nap ◦ töltés mennyisége: 3 ◦ Beérkezett áruk mennyisége: 16
     * <p>
     * A szimulációban résztvevő robotok:
     * <p>
     * • R2, egy Mac típusú robot 4 egység alap töltöttséggel
     * • 3CPO, egy Eco típusú robot 3 egység alap töltöttségi szinttel
     * • BB8, egy Pro típusú robot 10 egység alap töltöttséggel
     * • E12, egy Eco típus, 4 egység alap töltöttséggel
     */

    public static void simulate() {

        int[][] dailyTransport = new int[][]{
                {3, 20},
                {2, 32},
                {5, 20},
                {3, 16}
        };

        Robot[] robots = new Robot[]{
                new Mac("R2", 4),
                new Eco("3CPO", 3),
                new Pro("BB8", 10),
                new Eco("E12", 4)
        };

        System.out.println(" ~~~~~~~ Simulation from inner DB started  ~~~~~~~ ");

        for (int i = 0; i < dailyTransport.length; i++) {
            int dailyItems = dailyTransport[i][1];
            int dailyCharge = dailyTransport[i][0];
            System.out.println(
                    "< DAY " + (i + 1) + " >");
            System.out.println();
            Robot.restItem += dailyItems;
            for (Robot r : robots) {
                r.transport(dailyCharge, Robot.restItem);
                System.out.println(r.toString());
            }
            System.out.println();
        }

        System.out.println(" ~~~~~~~ Simulation from inner DB ended ~~~~~~~ ");
        System.out.println();

    }


}
