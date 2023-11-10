/*
 Joshua Rex
Programming with Java 2235-DD
8/29/2023
 */
import java.io.*;
import java.util.Random;

public class Jrex_Module5_2 {
    public static void main(String[] args) {
        String fileName = "data.file";

        // Generate 10 random numbers
        Random random = new Random();
        StringBuilder data = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            data.append(randomNumber).append(" ");
        }

        // Write data to the file
        try {
            FileWriter fileWriter = new FileWriter(fileName, true); // 'true' for appending
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data.toString());
            bufferedWriter.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read and display data from the file
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("Data read from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
