/*
 Joshua Rex
Programming with Java 2235-DD
8/29/2023
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jrex_Module5_1 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("0: Peter Piper");
        stringList.add("1: picked");
        stringList.add("2: a peck");
        stringList.add("3: of pickled ");
        stringList.add("4: peppers.");
        stringList.add("5: How many");
        stringList.add("6: pecks of");
        stringList.add("7: pickled peppers");
        stringList.add("8: did Peter Piper");
        stringList.add("9: pick?");

        System.out.println("ArrayList Elements:");
        for (String element : stringList) {
            System.out.println(element);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element you want to see again: ");
        
        try {
            int index = scanner.nextInt();
            String selectedElement = stringList.get(index);
            System.out.println("Selected element: " + selectedElement);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format.");
        }
    }
}

