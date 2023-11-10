/*
 Joshua Rex
Programming with Java 2235-DD
7/13/2023
 */

import java.util.Arrays;
import java.util.Random;

public class JrexModule10 {
    
//Create four methods that add the contents of varying types of arrays, divide
//those arrays by the number of items in them, and return the average.    
    
public static short average(short [] array){
    int sum = 0;
    for(int index = 1; index < array.length; index++){
    sum += array[index];}
    
short average = (short) (sum / array.length);
return average; 
}

public static int average(int [] array){
    int sum = 0;
    for(int index = 1; index < array.length; index++){
    sum += array[index];}
    
int average = sum / array.length;
return average; 
    
}
public static long average(long [] array){
   int sum = 0;
    for(int index = 1; index < array.length; index++){
    sum += array[index];}
    
int average = sum / array.length;
return average;  
}
public static double average(double [] array){
    int sum = 0;
    for(int index = 1; index < array.length; index++){
    sum += array[index];}
    
int average = sum / array.length;
return average; 
}
    
    public static void main(String args[]) {
    
//Intialize the arrays and fill with random numbers.       
    Random random = new Random(); 
    int intArray[] = new int[20];  
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);}
    short shortArray[] = new short[15];
    for (int i = 0; i < shortArray.length; i++) {
            shortArray[i] = (short) random.nextInt(10);}
    long longArray[] = new long[10]; 
    for (int i = 0; i < longArray.length; i++) {
            longArray[i] = random.nextLong(1000);}
    double doubleArray[] = new double[5];
       for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = random.nextDouble(10);}
       
//Display contents of the arrays, invoke the method to calculate the average, display the average       
     System.out.println("Integer Array:");
     System.out.println(Arrays.toString(intArray));
     System.out.println("Integer Array Average: ");
     System.out.println(average(intArray));
     System.out.println();
     System.out.println("Short Array:");
     System.out.println(Arrays.toString(shortArray));
     System.out.println("Short Array Average: ");
     System.out.println(average(shortArray));
     System.out.println();
     System.out.println("Long Array:");
     System.out.println(Arrays.toString(longArray));
     System.out.println("Long Array Average: ");
     System.out.println(average(longArray));
     System.out.println();
     System.out.println("Double Array:");
     System.out.println(Arrays.toString(doubleArray));
     System.out.println("Double Array Average: ");
     System.out.println(average(doubleArray));
     System.out.println();
    

    

    }}
