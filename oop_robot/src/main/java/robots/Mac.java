package robots;

public class Mac extends Robot{
    /**Mac: Maximális töltési szintje 10,
     * maximális szállítási kapacitása 10 egység,
     * egy egység szállítása eggyel csökkenti a töltési szintet.*/
    public Mac(String name, int charge) {

        super(name, charge);
        this.maxCapacity = 10;
        this.maxCharge = 10;
        this.type = "MAC";
        this.maxTransportCapacityViaCharge = Math.min(Robot.restItem, this.charge);
        this.itemToTransport = Math.min(this.maxTransportCapacityViaCharge, this.maxCapacity);
        this.batteryDecrease = this.itemToTransport;
    }


}
