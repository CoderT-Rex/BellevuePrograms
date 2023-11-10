//Joshua Rex
//Programming with Java 2235-DD
//6/7/23

import java.util.Scanner;

public class Jrexmodule4 {
    public static void main(String args[]) {
    //Greet the user and explain purpose of program
    System.out.println("Welcome to string checker!");
    System.out.println("This program will prompt you to enter two phrases.");
    System.out.println("The program will then check if either the first phrase");
    System.out.println("or the secon phrase is contained in the other.");        
        
    //Prompt the user to enter the first string
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String stringOne = scanner.nextLine();
    
    //Prompt the user to enter the second string
    System.out.print("Enter the second string: ");
    String stringTwo = scanner.nextLine();
    
    //Check if either string is contained in the other.
    if (stringOne.equals(stringTwo)){
        System.out.println("The two strings are the same.");
    }
    else if (stringOne.contains(stringTwo)){
        System.out.println("The second string is a subset of the first.");
    }
    else if (stringTwo.contains(stringOne)){
        System.out.println("The first string is a subset of the second.");
    }
    else {
        System.out.println("Neither string is contained in the other");
    }
    
    }
}
