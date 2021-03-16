package kindergarten.ovoda;

public class Spirited extends Child {

    public Spirited() {
        super();
    }

    //Eleven: Labdázás esetén az elégedettsége három lesz, tánc esetén nem változik, ének és rajz esetén eggyel csökken.
    @Override
    public void activityResponse(Activity activity) {

        if (activity.equals(Activity.PLAYINGBALL)) {
            this.satisfaction = 3;
        }

        if (activity.equals(Activity.SINGING) || activity.equals(Activity.DRAWING)) {
            this.satisfaction -= 1;
        }

        if (this.satisfaction <= 0) {
            this.isWhine = true;
            this.satisfaction = 0;
        }

    }
}
