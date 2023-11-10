//Joshua Rex
//Programming with Java 2235-DD
//6/7/23

import java.util.Scanner;

public class Jrexmodule5 {

    public static void main(String args[]) {
        
    //Adding a Scanner so we can pause between outputs.
    Scanner pause = new Scanner(System.in);
        
    //State Purpose of Program
    System.out.println("This program will add a series of fractions from 1/3.0");
    System.out.println("to 1/99.0. First it will add this sequence in an increasing");
    System.out.println("order, at intervals of two. Then, it will do so in a decreasing");
    System.out.println("order starting at 1/99.0 and continue down by two each addition.");
    System.out.println();
    System.out.print("Press Enter to continue...");
    pause.nextLine();
    System.out.println();
    
    //Initialize the values and create the first loop. The z value makes sure the
    //loop executes properly, while also making clear to the user what additions
    //took place in each step.
    System.out.println("In an increasing order starting from 1/3.0: ");
    double x = 1.0/3.0;
    double y = 1.0/5.0;
    int z = 5;
    while(z != 101.0){
        System.out.print(x+ " + 1/" +z+" = ");
        x = x + y;
        y = y + 1.0/z;
        z += 2;
        System.out.println(x);
    }
    
    //Pause output, so it looks nicer and the user can see what was just performed
    System.out.print("Press Enter to continue...");
    pause.nextLine();
    System.out.println();
    
    //Intialize second loop in same style but in decreasing order
    System.out.println("In an decreasing order starting from 1/99.0: ");
    x = 1/99.0;
    y = 1/97.0;
    z = 97;
    while(z != 1){
        System.out.print(x+ " + 1/" +z+" = ");
        x = x + y;
        y = 1.0/z;
        z -= 2;
        System.out.println(x);
    }
    System.out.print("Press Enter to exit...");
    pause.nextLine();
    }
}
