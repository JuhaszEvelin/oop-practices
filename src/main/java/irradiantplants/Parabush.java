public class Parabush extends Plant {

    /**
     * Parabokor: Akár alfa, akár delta sugárzás hatására a tápanyag mennyisége eggyel nő.
     * Sugárzás nélküli napon a tápanyag eggyel csökken.
     * A másnapi sugárzást nem befolyásolja.
     */


    public Parabush(String name) {
        super(name);
    }

    @Override
    public void reaction(Radiation radiation) {
        if (this.isAlive) {
            if (radiation.equals(Radiation.NONE)) {
                this.nutrient -= 1;
            }

            if (radiation.equals(Radiation.ALPHA) || radiation.equals(Radiation.DELTA)) {
                this.nutrient += 1;
            }

            if (this.nutrient <= 0) {
                this.isAlive = false;
            }
        }

    }


}
