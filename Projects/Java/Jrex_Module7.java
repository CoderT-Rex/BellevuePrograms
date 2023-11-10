/*
Joshua Rex
Programming with Java 2235-DD
6/27/2023
 */

import java.util.Scanner;
        
public class Jrex_Module7 {

//Create a class for checking passwords, according to the rules of the assignment    
    public static boolean passCheck(String password){        
        
//Create five variables to detect if the password is long enough and has a Character,
//a Digit, an Uppercase, and a lowercase
        boolean hasDigit = false;
        boolean hasCharacter = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean longEnough = false;
        
//Test if the password is shorter than 8 characters.
        if (password.length() >= 8){
            longEnough = true;
            }
            
//Create a for loop that executes for every character in the string        
        for(int loop = 0; loop < password.length(); loop++){
            
//Test the character of the password according to the current iteration of the 
//loop
            char passCharacter = password.charAt(loop);

//If the current chracter being tested has a letter, the boolean value is set to 
//true.             
            if (Character.isLetter(passCharacter)){
            hasCharacter = true;}
  
//If the current character being tested has a digit, the boolean value is set to
//true
            if (Character.isDigit(passCharacter)){
            hasDigit = true;}
            
//If the current character being tested is in uppercase, the boolean value is set to
//true            
            if (Character.isUpperCase(passCharacter)){
            hasUppercase = true;}

//If the current character being tested is in lowercase, the boolean value is set to
//true             
            if (Character.isLowerCase(passCharacter)){
            hasLowercase = true;}

//If all qualifications have been met, return true.                      
            if(longEnough && hasCharacter && hasDigit && hasUppercase && hasLowercase){
            return true;}
    }

//If one of the boolean variables is not met, tell the user how to improve their
//password.

        if (!longEnough){
        System.out.println("Your password must be at least 8 characters.");}

        if(!hasCharacter){
        System.out.println("Your password must contain at least one letter.");}

        if(!hasDigit){
        System.out.println("Your password must contain at least one number.");}

        if(!hasUppercase){
        System.out.println("Your password must contain at least one uppercase letter.");}

        if(!hasLowercase){
        System.out.println("Your password must contain at least one lowercase letter.");}

//If one of the qualifications has not been met when the loop ends, return false.
        return false;}
    
//I decided to have some fun with this assignment and make extra classes. These
//will print a "CAPTCHA" test if the user enters a bad password too many times.
//Art by Hayley Jane Wakenshaw on asciiart.eu
    
    public static void carEmoticon(){
System.out.println(" ______     ");
System.out.println("/|_||_\\`.__ ");
System.out.println("(   _    _ _\\");
System.out.println("=`-(_)--(_)-'");
    }
    
    public static void busEmoticon(){
System.out.println("                          __ ");
System.out.println(" .-----------------------'  |");
System.out.println("/| _ .---. .---. .---. .---.|");
System.out.println("|j||||___| |___| |___| |___||");
System.out.println("|=|||=======================|");
System.out.println("[_|j||(O)\\__________|(O)\\___]");
    }
    
    public static void bikeEmoticon(){
System.out.println("         _            ");
System.out.println("        D/_            ");
System.out.println("        /(_`._,-.      ");
System.out.println(" _____(o) `--'(o)_____ ");
    }
    
    public static void main(String args[]) {
//Add a scanner for input
        Scanner input = new Scanner(System.in);
        
//This is something extra I added, an "Are you human?" test that will 
//trigger if the user enters a bad password 5 times.
        int areYouHuman = 0;
        
//Intialize the loop for the user to enter their password.
        while (true){
        System.out.print("What is your password? ");
        String password = input.nextLine();
        
//Intialize the method created above to check the password        
        boolean passOk = passCheck(password);
        
//Entering a password that fits all the assignment parameters will quit the 
//program.
        if (passOk){
          System.out.println("Your password is strong.");
          break;}
        
//If the user does not enter a valid password, the loop repeats. After five
//incorrect attempts, this "Are You Human?" test will trigger.
        areYouHuman++;
        if (areYouHuman >= 5){
            while (true){
               
//Print a picture of a car, bus, and bike. Have the user enter the corresponding
//number to continue entering a new password.

            System.out.println();
            System.out.println("Are you human? CAPTCHA");
            System.out.println();
            System.out.println("You have entered an incorrect password too many times.");
            System.out.println("Please answer the following question:");
            System.out.println();
            System.out.println("Which of these is a bike?");
            System.out.println("1: ");
            carEmoticon(); 
            System.out.println("2: ");
            busEmoticon();
            System.out.println("3: ");
            bikeEmoticon();
            System.out.println("4: "); 
            carEmoticon();
            System.out.println();
            System.out.print("Enter the corresponding number: ");

//If the user selects the bike (option 3) this loop will break and they can 
//resume trying to create a password. 
            int humanTest = input.nextInt();
                if (humanTest == 3){
                    System.out.println();
                    System.out.println("Good!");
                    System.out.println();
                    areYouHuman = 0;
                    break;}

//If the user makes an incorrect selection, the program will repeat.                
                else{
                    System.out.println();
                    System.out.println("Please try again.");}
            }}
    }
}}

/* Flaws in the program, that I do not yet know how to fix:
1) After doing the captcha test, the scanner does not wait for new input.
2) During the captcha test, if the user enters a letter, the program crashes.
Since these topics go outside of the assignment parameters, I left them for now.
*/