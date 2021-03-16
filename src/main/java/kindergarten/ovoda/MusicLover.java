package kindergarten.ovoda;

public class MusicLover extends Child {
    @Override
    public void activityResponse(Activity activity) {
        if (activity.equals(Activity.SINGING)) {
            this.satisfaction = 4;
        }

        if (activity.equals(Activity.PLAYINGBALL) || activity.equals(Activity.DRAWING)) {
            this.satisfaction -= 1;
        }

        if (this.satisfaction <= 0) {
            this.isWhine = true;
            this.satisfaction = 0;
            }


//Zenekedvelő: Ének esetén az elégedettsége négy lesz, tánc esetén nem változik, labdázás és rajz esetén eggyel csökken.
    }

}
