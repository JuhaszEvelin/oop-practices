package robots;

public class Eco extends Robot {
    public Eco(String name, int charge) {
        super(name, charge);
        this.maxCapacity = 6;
        this.maxCharge = 4;
        this.type = "ECO";
    }

    @Override
    public void transport(int charge, int item) {
        this.charge = (Math.min((this.charge + charge), this.maxCharge));
        this.maxTransportCapacityViaCharge = Math.min(item, (this.charge * 2));
        this.itemToTransport = Math.min(maxTransportCapacityViaCharge, maxCapacity);
        Robot.restItem -= itemToTransport;
        this.charge -= (itemToTransport / 2);
    }
}
