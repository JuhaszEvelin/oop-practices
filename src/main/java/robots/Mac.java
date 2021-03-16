package robots;

public class Mac extends Robot {
    public Mac(String name, int charge) {
        super(name, charge);
        this.maxCapacity = 10;
        this.maxCharge = 10;
        this.type = RobotTypes.MAC;
    }

    @Override
    public void transport(int charge, int item) {
        this.charge = (Math.min((this.charge + charge), this.maxCharge));
        this.maxTransportCapacityViaCharge = Math.min(item, this.charge);
        this.itemToTransport = Math.min(maxTransportCapacityViaCharge, maxCapacity);
        Robot.restItem -= this.itemToTransport;
        this.charge -= this.itemToTransport;


    }
}
