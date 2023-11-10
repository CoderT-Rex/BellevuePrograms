/*
 Joshua Rex
Programming with Java 2235-DD
7/20/2023
 */

import java.util.Arrays;
import java.util.Random;

public class JrexModule11 {
    
/*Create four methods that find the largest or smallest number in a method, this
is done by:
    
1) Create an array (called location) that will keep track of two values
that represent a certain location in an array passed to the method.
2) Create a variable that holds the lowest or largest possible value for items 
contained in the passed array.
3) Cycle through the array, and if any value is greater or smaller than the one
before, save its place in the location array and replace the largest/smallest
value with the new number
4) Return the values in the location array    
    */   
    
public static int [] locateLargest (double [][] arrayParam){    
    int[] location = new int[2];
    double largest = Double.MIN_VALUE;
    for (int i = 0; i < arrayParam.length; i++){
        for (int j = 0; j < arrayParam[i].length; j++){
            if (arrayParam[i][j] > largest) {
                location[0] = i;
                location[1] = j;
                largest = arrayParam[i][j]; }}}
    return location; }

public static int [] locateLargest (int [][] arrayParam){
    int[] location = new int[2];
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arrayParam.length; i++){
        for (int j = 0; j < arrayParam[i].length; j++){
            if (arrayParam[i][j] > largest) {
                location[0] = i;
                location[1] = j;
                largest = arrayParam[i][j];}}}
    return location; }

public static int [] locateSmallest (double [][] arrayParam){
    int[] location = new int[2];
    double smallest = Double.MAX_VALUE;
    for (int i = 0; i < arrayParam.length; i++){
        for (int j = 0; j < arrayParam[i].length; j++){
            if (arrayParam[i][j] < smallest) {
                location[0] = i;
                location[1] = j;
                smallest = arrayParam[i][j]; }}}
    return location; }
public static int [] locateSmallest (int [][] arrayParam){
        int[] location = new int[2];
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < arrayParam.length; i++){
        for (int j = 0; j < arrayParam[i].length; j++){
            if (arrayParam[i][j] < smallest) {
                location[0] = i;
                location[1] = j;
                smallest = arrayParam[i][j];}}}

    return location;}
    
public static void main(String args[]) {
    
//Intialize the arrays and fill with random numbers.       
Random random = new Random(); 
int intArray[][] = new int[4][3];  
    for (int i = 0; i < intArray.length; i++) {
        for (int j = 0; j < intArray[i].length; j++){
            intArray[i][j] = random.nextInt(100);}}
    
double doubleArray[][] = new double[4][3];
    for (int i = 0; i < doubleArray.length; i++) {
        for (int j = 0; j < doubleArray[i].length; j++){
            doubleArray[i][j] = random.nextDouble(10);}}
       
//Display contents of the array  

System.out.println("Integer Array:");
    for (int i = 0; i < intArray.length; i++) {
        for (int j = 0; j < intArray[i].length; j++) {
            System.out.print(intArray[i][j] + " ");}
    System.out.println();}
        
//invoke the method to find the location of the largest and smallest integers
//in the array and then display

int smallest[] = locateSmallest(intArray);
int largest[] = locateLargest(intArray);

System.out.println("Integer Array Smallest Value Location: ");
System.out.println(Arrays.toString(smallest));
System.out.println("Integer Array Largest Value Location: ");
System.out.println(Arrays.toString(largest));
System.out.println();

//Display contents of the array    
    
System.out.println("Double Array:");
    for (int i = 0; i < doubleArray.length; i++) {
        for (int j = 0; j < doubleArray[i].length; j++) {
            System.out.print(doubleArray[i][j] + " ");}
    System.out.println();}

//invoke the method to find the location of the largest and smallest integers
//in the array and then display       

smallest = locateSmallest(doubleArray);
largest = locateLargest(doubleArray);

System.out.println("Double Array Smallest Value Location: ");
System.out.println(Arrays.toString(smallest));
System.out.println("Double Array Largest Value Location: ");
System.out.println(Arrays.toString(largest));
System.out.println();

}}
