package robots;

public class Pro extends Robot {
    public Pro(String name, int charge) {
        super(name, charge);
        this.maxCapacity = 8;
        this.maxCharge = 12;
        this.type = RobotTypes.PRO;
    }

    @Override
    public void transport(int charge, int item) {
        this.charge = (Math.min((this.charge + charge), this.maxCharge));
        if (item <= 5) {
            this.maxTransportCapacityViaCharge = Math.min(item, this.charge);
            this.itemToTransport = Math.min(maxTransportCapacityViaCharge, maxCapacity);
            Robot.restItem -= this.itemToTransport;
            this.charge -= this.itemToTransport;

        } else {
            this.maxTransportCapacityViaCharge = Math.min(5, this.charge);
            this.itemToTransport = Math.min(maxTransportCapacityViaCharge, maxCapacity);
            Robot.restItem -= this.itemToTransport;
            this.charge -= this.itemToTransport;
            this.maxTransportCapacityViaCharge = Math.min((item - 5), (this.charge / 2));
            this.itemToTransport = Math.min(maxTransportCapacityViaCharge, maxCapacity);
            Robot.restItem -= itemToTransport;
            this.charge -= (itemToTransport * 2);

        }
    }
}
