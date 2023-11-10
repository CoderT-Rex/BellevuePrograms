/**
 Joshua Rex
 * Advanced Java Programming
 * 10/19/2023
 */
import java.io.*;
import java.util.Date;
import java.util.Random;

public class Jrex_Module1 {
    public static void main(String[] args) {
        // Generate an array of five random integers
        int[] randomIntegers = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            randomIntegers[i] = random.nextInt(100); // Generate random integers between 0 and 99
        }

        // Create a Date object with the current date
        Date currentDate = new Date();

        // Generate an array of five random double values
        double[] randomDoubles = new double[5];
        for (int i = 0; i < 5; i++) {
            randomDoubles[i] = random.nextDouble(); // Generate random double values between 0.0 and 1.0
        }

        // Write the data to a file (jrexdatafile.dat)
        try (FileOutputStream fos = new FileOutputStream("jrexdatafile.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(randomIntegers);
            oos.writeObject(currentDate);
            oos.writeObject(randomDoubles);
            System.out.println("Data has been written to jrexdatafile.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
