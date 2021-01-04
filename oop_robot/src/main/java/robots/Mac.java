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
        //this.maxTransportCapacityViaCharge = this.charge > maxCapacity ? maxCapacity : this.charge;
        //adott napon max ennyit tud vinni ha töltöttség > maxcap akkor max, ha nem akkor töltöttség értéke
    }

    @Override
    public void transport(int charge, int item) {
        System.out.print("          started charge: " + this. charge + " ");
        this.charge = ((this.charge + charge) > this.maxCharge ? this.maxCharge : (this.charge + charge));

        System.out.println(".........................................        total charge: " + this.charge);

        this.maxTransportCapacityViaCharge = item > this.charge ? this.charge : item;
        this.itemToTransport = maxTransportCapacityViaCharge > maxCapacity ? maxCapacity : maxTransportCapacityViaCharge;
        Robot.restItem -= this.itemToTransport;
        this.charge -= this.itemToTransport;


    }
}
