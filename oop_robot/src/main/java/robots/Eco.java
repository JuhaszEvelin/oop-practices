package robots;

public class Eco extends Robot {
    public Eco(String name, int charge) {

        //Eco: Maximális töltési szintje 4, maximális szállítási kapacitása 6, két egység szállítása eggyel csökkenti a töltési szintet. (Páratlan egység szállításakor a pár nélkül maradó egység is eggyel csökkent, azaz 5 egység esetén 3 lenne a fogyasztás.)
        super(name, charge);
        this.maxCapacity = 6;
        this.maxCharge = 4;
        this.type = "ECO";
        this.maxTransportCapacityViaCharge = Math.min(Robot.restItem, this.charge*2);
        this.itemToTransport = Math.min(this.maxTransportCapacityViaCharge, this.maxCapacity);
        this.batteryDecrease = this.itemToTransport/2;
     }


}
