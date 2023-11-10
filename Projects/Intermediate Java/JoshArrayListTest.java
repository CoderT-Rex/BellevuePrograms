/*
 Joshua Rex
Programming with Java 2235-DD
8/10/2023
 */

import java.util.ArrayList;
import java.util.Scanner;

public class JoshArrayListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
//User enters numbers to populate the array        
        ArrayList<Integer> myList = new ArrayList<>();
        System.out.println("Enter integers (enter 0 to stop):");

//Continue to have user to enter numbers until zero is entered. Zero will be added to array per assignment instructions        
        boolean go = true;
        while (go) {
            int num = scanner.nextInt();
            myList.add(num);
            if (num == 0) {
                go = false;
            }
        }

 //Call method to display largest value       
        int largest = max(myList);
        System.out.println("The largest value in the list is: " + largest);
    }

//Method to display largest integer. Failsafe has been added if the list is empty, even though that should never happen given
//that zero will always be added to the list (per assignment instructions)    
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer max = list.get(0);

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}

