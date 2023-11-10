//Joshua Rex
//Programming with Java 2235-DD
//6/7/2023

import java.util.Random;
import java.util.Scanner;

public class Jrexmodule3 {

    public static void main(String args[]) {
        
        //Welcome user to game
        System.out.print("Welcome to Rock, Paper, Scissors Java Edition! ");
        
        //Prompt User for imput
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1: Rock, 2: Paper, 3: Scissors): ");
        int userChoice = scanner.nextInt();
        
        //Generate Computer's selection
        Random random = new Random();
        int computerChoice = 0;
        while (computerChoice == 0) {
        computerChoice = random.nextInt(3);
        }
        //Display Winner 
        if (computerChoice == 1 && userChoice == 1){
        System.out.println("Computer throws Rock against your Rock!");
        System.out.println("Tie!");
        } else if (computerChoice == 1 && userChoice == 2){
        System.out.println("Computer throws Rock against your Paper!");
        System.out.println("You Win!");
        } else if (computerChoice == 1 && userChoice == 3){
        System.out.println("Computer throws Rock against your Scissors!");
        System.out.println("You Lose!");
        } else if (computerChoice == 2 && userChoice == 1){
        System.out.println("Computer throws Paper against your Rock!");
        System.out.println("You Lose!");
        } else if (computerChoice == 2 && userChoice == 2){
        System.out.println("Computer throws Paper against your Paper!");
        System.out.println("Tie!");
        } else if (computerChoice == 2 && userChoice == 3){
        System.out.println("Computer throws Paper against your Scissors!");
        System.out.println("You Win!");
        } else if (computerChoice == 3 && userChoice == 1){
        System.out.println("Computer throws Scissors against your Rock!");
        System.out.println("You Win!");
        } else if (computerChoice == 3 && userChoice == 2){
        System.out.println("Computer throws Scissors against your Paper!");
        System.out.println("You Lose!");
        } else if (computerChoice == 3 && userChoice == 3){
        System.out.println("Computer throws Scissors against your Scissors!");
        System.out.println("Tie!");
        }else{
        System.out.println("Please enter a valid number.");
        }
        }
}
