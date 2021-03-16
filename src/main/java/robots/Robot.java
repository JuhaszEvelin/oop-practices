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

    @Override
    public String toString() {
        return
                "<Name: " + name + "> <Type: " + type + "> <Charge: " + charge +
                        "<MaxCharge: " + maxCharge +
                        "><MaxCapacity: " + maxCapacity +
                        "><MaxTransportCapacityViaCharge: " + maxTransportCapacityViaCharge +
                        "><ItemToTransport: " + itemToTransport +
                        "><Restitem: " + restItem;
    }



}
