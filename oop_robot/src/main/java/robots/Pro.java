package robots;

public class Pro extends Robot {
    public Pro(String name, int charge) {
        //Pro: Maximális töltési szintje 12, maximális szállítási kapacitása 8. Egy egység szállítása 5 egységig eggyel csökkenti a töltési szintet, az 5 feletti egységek kettővel (Pl. 7 egység esetén 5+4=9 a fogyasztás.)
        super(name, charge);
        this.maxCapacity = 8;
        this.maxCharge = 12;
        this.type = "PRO";

        if (Robot.restItem <= 5) {
            this.maxTransportCapacityViaCharge = Math.min(5, this.charge);
            this.itemToTransport = Math.min(this.maxTransportCapacityViaCharge, this.maxCapacity);
            this.batteryDecrease = this.itemToTransport;
        } else {
            this.maxTransportCapacityViaCharge = Math.min(5, this.charge);
            this.batteryDecrease = this.itemToTransport;

            this.itemToTransport = Math.min(this.maxTransportCapacityViaCharge, this.maxCapacity);
            this.itemToTransport = Math.min(this.maxTransportCapacityViaCharge, this.maxCapacity);
            Robot.restItem -= this.itemToTransport;
            this.charge -= this.batteryDecrease;

            this.maxTransportCapacityViaCharge = Math.min(Robot.restItem - 5, this.charge / 2);
            this.itemToTransport = Math.min(this.maxTransportCapacityViaCharge, this.maxCapacity);
            this.batteryDecrease = this.itemToTransport * 2;

        }
    }

/*
    @Override
    public void transport(int charge, int item) {
        System.out.print("          started charge: " + this.charge + " ");

        this.charge = ((this.charge + charge) > this.maxCharge ? this.maxCharge : (this.charge + charge));
        System.out.println(".........................................        total charge: " + this.charge);

        if (item <= 5) {
            this.maxTransportCapacityViaCharge = item > this.charge ? this.charge : item;
            this.itemToTransport = maxTransportCapacityViaCharge > maxCapacity ? maxCapacity : maxTransportCapacityViaCharge;
            Robot.restItem -= this.itemToTransport;
            this.charge -= this.itemToTransport;

        } else {
            this.maxTransportCapacityViaCharge = 5 > this.charge ? this.charge : 5;
            this.itemToTransport = maxTransportCapacityViaCharge > maxCapacity ? maxCapacity : maxTransportCapacityViaCharge;
            Robot.restItem -= this.itemToTransport;
            this.charge -= this.itemToTransport;


            this.maxTransportCapacityViaCharge = (item - 5) > (this.charge / 2) ? (this.charge / 2) : (item - 5);
            this.itemToTransport = maxTransportCapacityViaCharge > maxCapacity ? maxCapacity : maxTransportCapacityViaCharge;
            Robot.restItem -= itemToTransport;
            this.charge -= (itemToTransport * 2);

        }
    }
*/
}
