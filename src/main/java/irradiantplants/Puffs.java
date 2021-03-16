public class Puffs extends Plant {

    /**
     * Puffancs: Alfa sugárzás hatására a tápanyag mennyisége kettővel nő,
     * sugárzás mentes napon a tápanyag eggyel csökken,
     * delta sugárzás esetén a tápanyag kettővel csökken.
     * Minden esetben úgy befolyásolja a másnapi sugárzást,
     * hogy 10 - tápanyag értékben növeli az alfa sugárzás bekövetkezését.
     * Ez a fajta akkor is elpusztul, ha a tápanyag mennyisége 10 fölé emelkedik.
     * Először a tápanyag változik, és ha a növény ezután él, akkor befolyásolhatja a sugárzást.
     */

    public Puffs(String name) {
        super(name);
    }

    @Override
    public void reaction(Radiation radiation) {
        if (this.isAlive) {
            if (radiation.equals(Radiation.NONE)) {
                this.nutrient -= 1;
            }

            if (radiation.equals(Radiation.ALPHA)) {
                this.nutrient += 2;
            }
            if (radiation.equals(Radiation.DELTA)) {
                this.nutrient -= 2;
            }

            if (this.nutrient <= 0 || this.nutrient > 10) {
                this.isAlive = false;
            }
        }

        if (this.isAlive) {
            Plant.alphaRadiationDemand += 10 - this.nutrient;
        }
    }


}
