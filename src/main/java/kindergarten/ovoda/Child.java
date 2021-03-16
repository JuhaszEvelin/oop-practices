package kindergarten.ovoda;

public abstract class Child {

    protected boolean isWhine = false; //nyafogás
    protected int satisfaction;
    static int headcount = 0;
    protected String type;
    protected String name;
    protected int ID;


    public Child() {
        headcount += 1;
       // System.out.println(headcount);
        this.name = RandomHelper.getRandomName();
        this.type = this.getClass().toString();
        this.satisfaction = 2;
        this.ID = headcount;
    }

    public abstract void activityResponse(Activity activity);

    @Override
    public String toString() {
        return this.ID + " " +
                this.name +
                " satisfaction = " + this.satisfaction +
                " // type = " + this.type + " // " +
                (this.isWhine ? "Say: WHINE WHINE" : " ");
    }
}
