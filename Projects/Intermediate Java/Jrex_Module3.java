/*
 Joshua Rex
Programming with Java 2235-DD
8/23/2023
 */
public class Jrex_Module3 {
    private int josh;

    public Jrex_Module3(int initialValue) {
        this.josh = initialValue;
    }

    public int getJosh() {
        return josh;
    }

    public void setJosh(int josh) {
        this.josh = josh;
    }

    public boolean isEven() {
        return josh % 2 == 0;
    }

    public boolean isOdd() {
        return josh % 2 != 0;
    }

    public boolean isPrime() {
        if (josh <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(josh); i++) {
            if (josh % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(Jrex_Module3 jrexModule3) {
        return jrexModule3.isEven();
    }

    public static boolean isOdd(Jrex_Module3 jrexModule3) {
        return jrexModule3.isOdd();
    }

    public static boolean isPrime(Jrex_Module3 jrexModule3) {
        return jrexModule3.isPrime();
    }

    public boolean equals(int value) {
        return josh == value;
    }

    public boolean equals(Jrex_Module3 jrexModule3) {
        return josh == jrexModule3.getJosh();
    }

    public static void main(String[] args) {
        // Creating three instances
        Jrex_Module3 annaInteger = new Jrex_Module3(5);
        Jrex_Module3 larryInteger = new Jrex_Module3(10);
        Jrex_Module3 sueInteger = new Jrex_Module3(8);

        // Testing isEven, isOdd, and isPrime methods
        System.out.println("Is Anna even? " + annaInteger.isEven());
        System.out.println("Is Larry even? " + larryInteger.isEven());
        System.out.println("Is Sue even? " + sueInteger.isEven());

        System.out.println("Is Anna odd? " + annaInteger.isOdd());
        System.out.println("Is Larry odd? " + larryInteger.isOdd());
        System.out.println("Is Sue odd? " + sueInteger.isOdd());

        System.out.println("Is Anna prime? " + annaInteger.isPrime());
        System.out.println("Is Larry prime? " + larryInteger.isPrime());
        System.out.println("Is Sue prime? " + sueInteger.isPrime());

        // Testing equals methods
        System.out.println("Anna equals Larry? " + annaInteger.equals(larryInteger));
        System.out.println("Anna equals Sue? " + annaInteger.equals(sueInteger));

        // Testing static methods
        System.out.println("Is 7 even? " + Jrex_Module3.isEven(7));
        System.out.println("Is 7 odd? " + Jrex_Module3.isOdd(7));
        System.out.println("Is 7 prime? " + Jrex_Module3.isPrime(7));
    }
}
