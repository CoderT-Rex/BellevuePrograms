
/**
 *Joshua Rex
 * Advanced Java Programming
 * 10/31/2023
 * 
 * This program measures how long it will take to go through a linked list using the
 * get index method versus an iterator. This is because linked lists are connected
 * via each previous element, and each time get index traverses the list, it starts from
 * the beginning. An iterator maintains its current place and is thus much more efficient.  
 */

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class Jrex_Module4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //I wanted to allow to a user to change the amount of items to experiment
        
        System.out.println("This program tests how long it will take to iterate "
                + "through a linked list using both an iterator and a get(index) method. "
                + "If no new data is entered, the default length of the list will be 50,000 items "
                + "for list one and 500,000 for list two. Each list will be filled with "
                + "consecutive integers, and their sum will be provided.");
        System.out.println();
        System.out.print("Would you like to change the default size of the list? (y/n) ");
        String response = scanner.next().toLowerCase(); // Read as a String and convert to lowercase
        
        boolean changeSize = response.equals("y");
        
        int size1 = changeSize ? getUserSize("Enter the size for the first list: ") : 50000;
        int size2 = changeSize ? getUserSize("Enter the size for the second list: ") : 500000;
        
        scanner.close();

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();


        // Populate the lists
        for (int i = 0; i < size1; i++) {
            list1.add(i);
        }
        for (int i = 0; i < size2; i++) {
            list2.add(i);
        }

        // Test the time to traverse the list using an iterator
        long startTime = System.currentTimeMillis();
        int sum1 = traverseWithIterator(list1);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to traverse list1 with an iterator: " + (endTime - startTime) + " ms");
        System.out.println("Sum of list1: " + sum1);

        startTime = System.currentTimeMillis();
        int sum2 = traverseWithIterator(list2);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to traverse list2 with an iterator: " + (endTime - startTime) + " ms");
        System.out.println("Sum of list2: " + sum2);

        // Test the time to traverse the list using get(index)
        startTime = System.currentTimeMillis();
        sum1 = traverseWithGet(list1);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to traverse list1 with get(index): " + (endTime - startTime) + " ms");
        System.out.println("Sum of list1: " + sum1);

        startTime = System.currentTimeMillis();
        sum2 = traverseWithGet(list2);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to traverse list2 with get(index): " + (endTime - startTime) + " ms");
        System.out.println("Sum of list2: " + sum2);
    }

    private static int traverseWithIterator(LinkedList<Integer> list) {
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }

    private static int traverseWithGet(LinkedList<Integer> list) {
        int sum = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sum += list.get(i);
        }
        return sum;
    }
    
    private static int getUserSize(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int size = scanner.nextInt();
        return size;
    }
}
