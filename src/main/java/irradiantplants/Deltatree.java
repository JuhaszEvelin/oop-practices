public class Deltatree extends Plant {

    /**
     * Deltafa: Alfa sugárzás hatására a tápanyag mennyisége hárommal csökken,
     * sugárzás nélküli napon a tápanyag eggyel csökken,
     * delta sugárzás hatására a tápanyag néggyel nő.
     * Ha a tápanyag mennyisége 5-nél kisebb, akkor 4 értékben növeli a delta sugárzás bekövetkezését,
     * ha 5 és 10 közé esik, akkor 1 értékben növeli a delta sugárzás bekövetkezését,
     * ha 10-nél több, akkor nem befolyásolja a másnapi sugárzást.
     */

    public Deltatree(String name) {
        super(name);
    }

    @Override
    public void reaction(Radiation radiation) {

        if (this.isAlive) {
            if (radiation.equals(Radiation.NONE)) {
                this.nutrient -= 1;
            }

            if (radiation.equals(Radiation.ALPHA)) {
                this.nutrient -= 3;
            }
            if (radiation.equals(Radiation.DELTA)) {
                this.nutrient += 1;
            }

            if (this.nutrient <= 0) {
                this.isAlive = false;
            }
        }

        if (this.isAlive) {
            if (this.nutrient < 5) {
                Plant.deltaRadiationDemand += 4;
            } else if (this.nutrient >= 5 && this.nutrient <= 10) {
                Plant.deltaRadiationDemand += 1;
            }
        }

    }


}
