package robots;

public class Warehouse {

    public static void main(String[] args) {
        Simulation.simulate();

        System.out.println("Simulate from file: ");
        Robot.restItem = 0;         //need to empty static field to get the same result
        SimulationFromFile sf = new SimulationFromFile();
        sf.simulateFromFile();
    }
}
