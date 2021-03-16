package robots;

import fileIO.MyFileWriter;

import java.util.ArrayList;
import java.util.List;

public class SimulationFromFile {

    public void simulateFromFile() {

        MyFileWriter fileIO = new MyFileWriter();

        List<int[]> dailyTransport = getDailyTransport(fileIO);

               /* new int[][]{
                {3, 20},
                {2, 32},
                {5, 20},
                {3, 16}
        };*/

        List<Robot> robots = getRobots(fileIO);

              /*  new Robot[]{
                new Mac("R2", 4),
                new Eco("3CPO", 3),
                new Pro("BB8", 10),
                new Eco("E12", 4)
        };*/

        for (int i = 0; i < dailyTransport.size(); i++) {
            int dailyCharge = dailyTransport.get(i)[0];
            int dailyItems = dailyTransport.get(i)[1];
            System.out.println(
                    "< DAY " + (i + 1) + " >");
            System.out.println();
            Robot.restItem += dailyItems;
            for (Robot r : robots) {
                r.transport(dailyCharge, Robot.restItem);
                System.out.println(r.toString());
            }
            System.out.println();
        }
    }

    private List<Robot> getRobots(MyFileWriter fileIO) {
        List<Robot> robots = new ArrayList<>();
        List<String> datas = fileIO.readFile("robotfactory.txt");
        for (String data : datas) {
            String robotType = fileIO.decodeLine(data).get(0);
            String robotName = fileIO.decodeLine(data).get(0);
            String robotCharge = fileIO.decodeLine(data).get(0);
            robots.add(robotFactory(robotType, robotName, robotCharge));
        }
        return robots;
    }

    private Robot robotFactory(String robotType, String robotName, String robotCharge) {

        if (robotType.equals())

    }

    private List<int[]> getDailyTransport(MyFileWriter fileIO){
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
