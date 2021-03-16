public abstract class Plant {


    protected String name;
    protected int nutrient;
    protected boolean isAlive;
    static int alphaRadiationDemand = 0;
    static int deltaRadiationDemand = 0;

    public Plant(String name) {
        this.name = name;
        this.nutrient = 5;
        this.isAlive = true;

    }

    public abstract void reaction(Radiation radiation);

    public void plantsAlive() {
        if (this.isAlive) {
            System.out.println(this.name + " is alive");
        }

    }

    @Override
    public String toString() {
        return
                name + "  " +
                " Nutrient = " + nutrient +
                (isAlive ? ", ALIVE " : ", DEAD ");
    }
}
