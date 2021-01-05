package robots;

public abstract class Robot {

    protected String name;
    public String type;
    protected int charge;
    protected int maxCharge;
    protected int maxCapacity;
    protected int maxTransportCapacityViaCharge;
    protected int itemToTransport;
    protected int batteryDecrease;
    public static int restItem;

    public Robot(String name, int charge) {
        this.name = name;
        this.charge = charge;

    }

    public void transport(int charge, int rest) {
        restItem = rest;
        System.out.print("          started charge: " + this.charge + " ");
        this.charge = Math.min((this.charge + charge), this.maxCharge);
        System.out.println(".........................................        total charge: " + this.charge);
        restItem -= this.itemToTransport;
        this.charge -= this.batteryDecrease;
    }

    @Override
    public String toString() {
        return
                name +
                        ": " + type + "    Charge: " + charge +
                        " ;    maxCharge = " + maxCharge +
                        " , maxCapacity = " + maxCapacity +
                        " , maxTransportCapacityViaCharge = " + maxTransportCapacityViaCharge +
                        " , itemToTransport = " + itemToTransport +
                        " ;  restitem  : " + restItem;
    }
}
