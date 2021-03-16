package kindergarten.ovoda;

import java.util.ArrayList;
import java.util.Random;

public class RandomHelper {
    private static final Random RANDOM = new Random();


    public static ArrayList<Child> getChildren(int headCount) {
    /*    ArrayList<Child> basicChildTypes = new ArrayList<>();
        basicChildTypes.add(new Spirited());
        basicChildTypes.add(new Lazy());
        basicChildTypes.add(new MusicLover());
*/
        ArrayList<Child> randomChild = new ArrayList<>(headCount);

        for (int i = 0; i < headCount; i++) {

            int random = nextInt(3);

            if (random == 1){
                randomChild.add(new Spirited());
            }
            if (random == 2){
                randomChild.add(new Lazy());
            }
            if (random == 0){
                randomChild.add(new MusicLover());
            }
//            Child temp = basicChildTypes.get(nextInt((basicChildTypes.size())));
  //          randomChild.add(temp);
        }

        return randomChild;

    }

    private static final String[] POSSIBLE_NAMES = {
            "Eszter",
            "Pistike",
            "Bela",
            "Eniko",
            "Etelka",
            "Viktor",
            "Ubul",
            "Imike",
            "Janika",
            "Gizike",
            "Isti",
            "Andi",
            "Rami",
            "Nono",
            "Petike",
            "Lorka",
            "Andris",
            "Karcsika",
            "Jano",
            "Geza",
            "Balu",
            "Beni",
            "Lacika",
            "Lacus"
    };

    public static String getRandomName() {
        String randomName = chooseOne(POSSIBLE_NAMES);
        return randomName;
    }

    public static Activity getOneRandomActivity(){
        ArrayList<Activity> activities = getActivities();

        Activity randomActivity = activities.get(nextInt((activities.size())));
        return randomActivity;
    }

    public static ArrayList<Activity> getrandomActivity(int activitiyNum) {
        ArrayList<Activity> activities = getActivities();

        ArrayList<Activity> randoms = new ArrayList<>();

        for (int i = 0; i < activitiyNum; i++) {
            Activity temp = activities.get(nextInt((activities.size())));
            randoms.add(temp);
        }

        return randoms;
    }

    private static ArrayList<Activity> getActivities() {
        ArrayList<Activity> activities = new ArrayList<Activity>();
        activities.add(Activity.PLAYINGBALL);
        activities.add(Activity.DANCE);
        activities.add(Activity.DRAWING);
        activities.add(Activity.SINGING);
        return activities;
    }

    public static String chooseOne(String[] possibilities) {
        if (possibilities == null || possibilities.length < 1) {
            final String msg =
                    "Possibilities should be a non-empty array of strings.";
            throw new IllegalArgumentException(msg);
        }
        return possibilities[nextInt(possibilities.length)];
    }

    public static int nextInt(int upper) {
        return RANDOM.nextInt(upper);
    }

    public static int nextInt(int lower, int upper) {
        return lower + nextInt(upper - lower);
    }


}
