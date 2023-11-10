
/**
 * Joshua Rex
 * Advanced Java Programming
 * 10/21/2023
 */

public class Jrex_Module2 {
    public static double calculateSeries(int i) {
        if (i == 1) {
            return 1.0 / 2.0;
        } else {
            double currentTerm = (double) i / (i + 1);
            return currentTerm + calculateSeries(i - 1);
        }
    }

    public static void main(String[] args) {
        int[] inputValues = {4, 9, 14};

        for (int i : inputValues) {
            double result = calculateSeries(i);
            System.out.println("inputValue(" + i + ") = " + result);
        }
    }
}
