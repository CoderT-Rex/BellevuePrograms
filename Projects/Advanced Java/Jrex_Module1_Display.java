/**
 Joshua Rex
 * Advanced Java Programming
 * 10/19/2023
 */
import java.io.*;
import java.util.Date;

public class Jrex_Module1_Display {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("jrexdatafile.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            int[] randomIntegers = (int[]) ois.readObject();
            Date currentDate = (Date) ois.readObject();
            double[] randomDoubles = (double[]) ois.readObject();

            System.out.println("Random Integers:");
            for (int num : randomIntegers) {
                System.out.println(num);
            }

            System.out.println("\nCurrent Date:");
            System.out.println(currentDate);

            System.out.println("\nRandom Doubles:");
            for (double num : randomDoubles) {
                System.out.println(num);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

