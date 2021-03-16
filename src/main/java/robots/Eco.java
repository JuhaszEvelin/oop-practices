package robots;

public class Eco extends Robot {
    public Eco(String name, int charge) {

        //Eco: Maximális töltési szintje 4, maximális szállítási kapacitása 6, két egység szállítása eggyel csökkenti a töltési szintet. (Páratlan egység szállításakor a pár nélkül maradó egység is eggyel csökkent, azaz 5 egység esetén 3 lenne a fogyasztás.)
        super(name, charge);
        this.maxCapacity = 6;
        this.maxCharge = 4;
        this.type = "ECO";
        //   this.maxTransportCapacityViaCharge = (this.charge > (maxCapacity / 2)) ? maxCapacity : this.charge * 2;
    }

    @Override
    public void transport(int charge, int item) {
        System.out.print("          started charge: " + this.charge + " ");

        this.charge = ((this.charge + charge) > this.maxCharge ? this.maxCharge : (this.charge + charge));
        System.out.println(".........................................        total charge: " + this.charge);

        this.maxTransportCapacityViaCharge = item > (this.charge * 2) ? (this.charge * 2) : item;
        this.itemToTransport = maxTransportCapacityViaCharge > maxCapacity ? maxCapacity : maxTransportCapacityViaCharge;
        Robot.restItem -= itemToTransport;
        this.charge -= (itemToTransport / 2);
    }
}
