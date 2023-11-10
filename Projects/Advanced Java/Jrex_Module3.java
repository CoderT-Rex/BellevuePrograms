

/**
 *Joshua Rex
 * Advanced Java Programming
 * 10/21/2023
 */

import java.util.ArrayList;
import java.util.Random;

public class Jrex_Module3 {

    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        Random rand = new Random();

        // Fill the original ArrayList with 50 random values from 1 to 20
        for (int i = 0; i < 50; i++) {
            int randomValue = rand.nextInt(20) + 1;
            originalList.add(randomValue);
        }

        System.out.println("Original ArrayList: " + originalList);

        ArrayList<Integer> newList = removeDuplicates(originalList);

        System.out.println("ArrayList without duplicates: " + newList);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();

        for (E item : list) {
            if (!newList.contains(item)) {
                newList.add(item);
            }
        }

        return newList;
    }
}

