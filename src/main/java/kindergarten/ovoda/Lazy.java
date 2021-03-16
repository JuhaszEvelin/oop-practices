package kindergarten.ovoda;

public class Lazy extends Child {
    //Kényelmes: Rajz esetén az elégedettsége négy lesz, ének esetén nem változik, tánc esetén eggyel,
    // labdázás esetén kettővel csökken.
    @Override
    public void activityResponse(Activity activity) {
        if (activity.equals(Activity.DRAWING)) {
            this.satisfaction = 4;
        }

        if (activity.equals(Activity.DANCE)) {
            this.satisfaction -= 1;
        }

        if (activity.equals(Activity.PLAYINGBALL)) {
            this.satisfaction -= 2;
        }

        if (this.satisfaction <= 0) {
            this.isWhine = true;
            this.satisfaction = 0;
           }


    }
}
