import java.util.Scanner;
        public class Jrex_module6 {
    public static void main(String[] args) {
        
//Prompt user for number of rows in the pyramid
        Scanner input = new Scanner(System.in);
        System.out.print("How many lines would you like in your pyramid? ");
        int rows = input.nextInt();
        


        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Print spaces for formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("   ");
            }

            // Print numbers in ascending order
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-3d", num);
                num *= 2;
            }

            // Print numbers in descending order
            num /= 4;
            for (int j = 0; j < i; j++) {
                System.out.printf("%-3d", num);
                num /= 2;
            }

            // Print spaces for formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("   ");
            }

            // Print @ symbol
            System.out.println(" @");
        }
    }
}

