package robots;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Robot {

    protected String robotName;
    public RobotTypes type;
    protected int charge;
    protected int maxCharge;
    protected int maxCapacity;
    protected int maxTransportCapacityViaCharge;
    protected int itemToTransport;
    public static int restItem;

    public Robot(String name, int charge) {
        this.robotName = name;
        this.charge = charge;
    }

    public abstract void transport(int charge, int item);

    @Override
    public String toString() {
        return
                "<Name: " + robotName + "> <Type: " + type + "> <Charge: " + charge +
                        "<MaxCharge: " + maxCharge +
                        "><MaxCapacity: " + maxCapacity +
                        "><MaxTransportCapacityViaCharge: " + maxTransportCapacityViaCharge +
                        "><ItemToTransport: " + itemToTransport +
                        "><Restitem: " + restItem + System.lineSeparator();
    }

}
