package robots;

public abstract class Robot {

    protected String name;
    public String type;
    protected int charge;
    protected int maxCharge;
    protected int maxCapacity;
    protected int maxTransportCapacityViaCharge;
    protected int itemToTransport;
    public static int restItem;

    public Robot(String name, int charge) {
        this.name = name;
        this.charge = charge;

    }

    public abstract void transport(int charge, int item);
    /*{
        this.itemToTransport = item;
        this.charge = ((charge + this.charge) > maxCharge) ? maxCharge : (charge + this.charge);
        restItem = item > maxTransportCapacityViaCharge ? restItem + item - maxTransportCapacityViaCharge : 0;
        this.charge -= item > maxTransportCapacityViaCharge ? maxTransportCapacityViaCharge : item;
    }*/

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
