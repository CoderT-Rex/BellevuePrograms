/*
 Joshua Rex
Programming with Java 2235-DD
7/6/2023
 */

import java.util.Scanner;
import java.util.Arrays;

public class JrexModule9 {

    public static void main(String args[]) {
    
//Intialize the array and set variables to the intial input by the user.       
        
    int numbers[] = new int[20];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 20 integers:");
    numbers[0] = input.nextInt();
    int sum = numbers[0];
    int highest = numbers[0];
    int lowest = numbers[0];
    
//Create a loop that fills out the rest of the array, simultaneously checking if
//new numbers are higher or lower than what was previously entered, and adding each
//new number to the total.

    for(int index = 1; index < numbers.length; index++){
    numbers[index] = input.nextInt();
    sum += numbers[index];
        if (numbers[index] > highest) {
            highest = numbers[index];
            }
        if (numbers[index] < lowest) {
            lowest = numbers[index];
            }
    }
    
    //Calculate Average
    
    double average = (double) sum / numbers.length;
    
    //Display results
    System.out.println("Integers entered in the array: " + Arrays.toString(numbers));
    System.out.println("Highest value: " + highest);
    System.out.println("Lowest value: " + lowest);
    System.out.println("Average: " + average);
    System.out.println("Sum: " + sum);

    input.close();
}}
