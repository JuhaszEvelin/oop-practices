package fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyFileWriter {

    public boolean fileExists(String fileName) {
        File file = new File("src/" + fileName);
        return file.exists();
    }

    public List<String> readFile(String fileName) {
        File file = new File("src/" + fileName);
        List<String> result = new ArrayList<>();
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                result.add(fileReader.nextLine());
            }
        } catch (IOException e) {
            System.out.println("There was an error! " + e);
            result.clear();
        }
        return result;
    }

    public void writeFile(String fileName, String data) {
        File file = new File("src/" + fileName);
        try {
            file.delete();
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("There was an error! " + e);
        }
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.append(data);
        } catch (IOException e) {
            System.out.println("There was an error! " + e);
        }
    }

    public String encodeLine(List<String> data) {
        return String.join(";", data) + ";" + System.lineSeparator();
    }

    public List<String> decodeLine(String data) {
        return Arrays.asList(data.split(";").clone());
    }
}
