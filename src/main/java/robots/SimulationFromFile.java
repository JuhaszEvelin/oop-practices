package robots;

import fileIO.MyFileWriter;

import java.util.ArrayList;
import java.util.List;

public class SimulationFromFile {

    public void simulateFromFile() {

        MyFileWriter fileIO = new MyFileWriter();

        List<int[]> dailyTransport = getDailyTransport(fileIO);

        List<Robot> robots = getRobots(fileIO);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dailyTransport.size(); i++) {
            int dailyCharge = dailyTransport.get(i)[0];
            int dailyItems = dailyTransport.get(i)[1];
            sb.append("< DAY " + (i + 1) + " >" + System.lineSeparator());
            Robot.restItem += dailyItems;
            for (Robot r : robots) {
                r.transport(dailyCharge, Robot.restItem);
                sb.append(r.toString() + System.lineSeparator());
            }
        }

        String saveToFile = sb.toString();
        fileIO.writeFile("robotsimulation.txt", saveToFile);

        System.out.println(" ~~~~~~~ Simulation saved to file ~~~~~~~ ");

    }

    private List<Robot> getRobots(MyFileWriter fileIO) {
        List<Robot> robots = new ArrayList<>();
        List<String> datas = fileIO.readFile("robotfactory.txt");
        for (String data : datas) {
            RobotTypes robotType = RobotTypes.valueOf(fileIO.decodeLine(data).get(0));
            String robotName = fileIO.decodeLine(data).get(1);
            int robotCharge = Integer.parseInt(fileIO.decodeLine(data).get(2));
            robots.add(robotFactory(robotType, robotName, robotCharge));
        }
        return robots;
    }

    private Robot robotFactory(RobotTypes robotType, String robotName, int robotCharge) {

        if (robotType.equals(RobotTypes.ECO)) {
            return new Eco(robotName, robotCharge);
        }
        if (robotType.equals(RobotTypes.MAC)) {
            return new Mac(robotName, robotCharge);
        }
        if (robotType.equals(RobotTypes.PRO)) {
            return new Pro(robotName, robotCharge);
        }

        return null;
    }

    private List<int[]> getDailyTransport(MyFileWriter fileIO) {
        List<String> datas = fileIO.readFile("robotsdailytransport.txt");
        List<int[]> dailyTransports = new ArrayList<>();
        for (String data : datas) {
            int charge = Integer.parseInt(fileIO.decodeLine(data).get(0));
            int transport = Integer.parseInt(fileIO.decodeLine(data).get(1));
            dailyTransports.add(new int[]{charge, transport});
        }
        return dailyTransports;
    }


}
