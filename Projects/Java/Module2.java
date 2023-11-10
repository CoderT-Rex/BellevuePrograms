//Joshua Rex
//Programming with Java 2235-DD
//Module 2 Programming Assignment
//5/30/2023

import java.util.Scanner;

public class Module2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    
    //Welcome user and state purpose of program
    
    System.out.println("Welcome to water temperature calculator!");
    System.out.println("This program will calculate the energy needed to heat");
    System.out.println("kilograms of water from an initial temperature in");
    System.out.println("Celsius to a final temperature in Celsius.");
    System.out.println("The result will be displayed in joules.");
    System.out.println("");
    
    //Prompt user for water mass in Kilograms
    System.out.print("How much water needs to be heated? Kilograms of water: ");
    double waterMass = input.nextDouble();
    System.out.println("");
    
    //Prompt the user for current temperature and desired temperature
    System.out.print("What is the water's current temperature? Temperature in Celsius: ");
    double currentTemp = input.nextDouble();
    System.out.println("");
    System.out.print("What is the desired water temperature Temperature in Celsius: ");
    double desiredTemp = input.nextDouble();
    System.out.println("");
    
    //Calulate how many joules it will take to cause the desired increase in temperature
    double adjustedTemp = (desiredTemp - currentTemp);
    double energy = waterMass * adjustedTemp * 4184;
    
    //Display the result
    System.out.println("It wil take "+ energy +" joules to increase the water temperature by "+ adjustedTemp +" degrees Celsius." );
    }
}
