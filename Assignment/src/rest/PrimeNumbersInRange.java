package rest;
public class PrimeNumbersInRange {
    public static void main(String[] args) {
        int startRange = 0;
        int endRange = 1000;

        System.out.println("Prime numbers between " + startRange + " and " + endRange + ":");
        printPrimeNumbers(startRange, endRange);
    }

    public static void printPrimeNumbers(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

