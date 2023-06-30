package School;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Objects;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Username:");
        String userInput = scanner2.nextLine();
        System.out.println("Enter Password::");
        String userPassword = scanner2.nextLine();
        String userNameInput = "Eni";
        int updateNo = 1;
        String updatedInfo = "NATHAN";

        try {
            File file = new File("src/School/database.txt");
            File tempFile = new File("src/School/temp.txt");
            FileWriter fileWriter = new FileWriter(tempFile);

            StringBuilder newData = new StringBuilder();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String dataFile = scanner.nextLine();
                String[] array = dataFile.split(" ");
                if ((Objects.equals(array[4], userNameInput))) {
                    array[updateNo] = updatedInfo;
                }
                newData.append(String.join(" ", array)).append("\n");
            }

            fileWriter.write(newData.toString());

            scanner.close();
            fileWriter.close();

            Path originalPath = file.toPath();
            Path tempPath = tempFile.toPath();
            Files.move(tempPath, originalPath, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Array updated successfully.");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
        }
    }
}
