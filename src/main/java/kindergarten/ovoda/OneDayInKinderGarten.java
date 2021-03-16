package kindergarten.ovoda;

import java.util.ArrayList;

public class OneDayInKinderGarten {
//Írjunk olyan programot, amely az óvoda egy napját szimulálja. A nap 6 órából áll,
// és fél óránként válthat tevékenységet az óvónéni. Minden tevékenységet mindenki csinál az adott fél órában.
// A gyerekek 2 elégedettségi ponttal érkeznek az óvodába. Írjuk ki a nap végén, hogy káoszba fulladt-e a nap, vagy sem.
// Ha legalább 3 gyerek elérte a nyafogó szintet, akkor hiába hozza vissza az ő elégedettségüket az óvónéni,
// nap végén ugyan úgy jeleznünk kell, hogy a káosz vette át az uralmat az oviban.


    private static void randomActivGroup(ArrayList<Child> group) {
        Activity randomActivity = RandomHelper.getOneRandomActivity();
        System.out.println(randomActivity);
        System.out.println();
        for (Child g : group) {
            g.activityResponse(randomActivity);
            System.out.println(g.toString());
        }

        System.out.println("********** GROUP ACTIVITY END **********");
        System.out.println();
    }

    private static boolean wasChaos(ArrayList<Child> group) {
        for (Child c : group) {
            if (c.isWhine) {
                return true;
            }
        }

        return false;
    }

    public static void defaultDay() {
        boolean wasChaos = false;

        Child c = new Spirited();
        Child c2 = new MusicLover();
        Child c3 = new Lazy();

        System.out.println(c.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        c.activityResponse(Activity.PLAYINGBALL);
        c2.activityResponse(Activity.PLAYINGBALL);
        c3.activityResponse(Activity.PLAYINGBALL);

        System.out.println(c.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());


    }


    public static void oneDayInKinderGarten() {

        ArrayList<Activity> activities = RandomHelper.getrandomActivity(12);
        ArrayList<Child> children = RandomHelper.getChildren(15);
        boolean wasChaos = false;

        for (Activity a : activities) {
            System.out.println(a);
            System.out.println();

            for (Child c : children) {

                c.activityResponse(a);
                System.out.println(c.toString());

                if (c.isWhine) {
                    wasChaos = true;
                }
            }
            System.out.println();
        }
        System.out.println(wasChaos ? "CHAOS" : "NO CHAOS");
    }

    public static void oneDayInKinderGartenBonus2() {
        ArrayList<Child> children = RandomHelper.getChildren(15);

        boolean wasChaos = false;

        for (int i = 0; i < 12; i++) {

            ArrayList<Child> group1 = new ArrayList<>();
            ArrayList<Child> group2 = new ArrayList<>();
            ArrayList<Child> group3 = new ArrayList<>();

            for (Child c : children) {
                int randomNum = RandomHelper.nextInt(3);
                if (randomNum == 0) {
                    group1.add(c);
                }
                if (randomNum == 1) {
                    group2.add(c);
                }
                if (randomNum == 2) {
                    group3.add(c);
                }

            }
            System.out.println("------------------- GROUP 1 -------------------");
            randomActivGroup(group1);
            wasChaos = wasChaos(group1);

            System.out.println("------------------- GROUP 2 -------------------");
            randomActivGroup(group2);
            wasChaos = wasChaos(group2);

            System.out.println("------------------- GROUP 3 -------------------");
            randomActivGroup(group3);
            wasChaos = wasChaos(group3);

        }
        System.out.println(wasChaos ? "CHAOS" : "NO CHAOS");
    }




    public static void oneDayInKinderGartenBonus3() {
        ArrayList<Child> children = RandomHelper.getChildren(15);

        boolean wasChaos = false;

        for (int i = 0; i < 12; i++) {

            ArrayList<Child> group1 = new ArrayList<>();
            ArrayList<Child> group2 = new ArrayList<>();
            ArrayList<Child> group3 = new ArrayList<>();

            for (Child c : children) {
                int randomNum = RandomHelper.nextInt(3);
                if (randomNum == 0) {
                    group1.add(c);
                }
                if (randomNum == 1) {
                    group2.add(c);
                }
                if (randomNum == 2) {
                    group3.add(c);
                }

            }
            System.out.println("------------------- GROUP 1 -------------------");
            randomActivGroup(group1);
            wasChaos = wasChaos(group1);

            System.out.println("------------------- GROUP 2 -------------------");
            randomActivGroup(group2);
            wasChaos = wasChaos(group2);

            System.out.println("------------------- GROUP 3 -------------------");
            randomActivGroup(group3);
            wasChaos = wasChaos(group3);

            if (wasChaos){
                System.out.println("The chaos broke loose");
                System.exit(0);
            }
        }
        System.out.println(wasChaos ? "CHAOS" : "NO CHAOS");
    }
}