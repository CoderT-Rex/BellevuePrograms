/*
Joshua Thomas Rex
Module 1 Programming Assignment
Programming with Java 2235-DD
5/23/2023
 */
public class jrex_module1 {

    public static void main(String args[]) {
        // Calculates the required math formula and outputs the result. The first example uses numbers with a decimal point
        System.out.println(4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0));
        //The second example uses simple integers
        System.out.println(4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ));
    }   
    
        /*Both calculations are the same. However, the second answer gives a different, rounded output.
        This illustrates when greater accuracy is needed, floating numbers are necessary. In a simple calculation, 
        intgers are sufficent. Especially when dividing, a programmer should be aware of the need for floating numbers.
        An example that does not sacrifice accuracy for simplicity might be:
        4.0 * (1.0 - 1 / 3.0 + 1 / 5.0 - 1 / 7.0 + 1 / 9.0 - 1 / 11.0 + 1 / 13.0)
        By adding a decimal to the first number in each operation, you insure that the result is a floating number
        and no fractions are rounded in the process.
        */ 
}