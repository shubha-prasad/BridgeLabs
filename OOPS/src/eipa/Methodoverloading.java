package eipa;
public class Methodoverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {

        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of three integers: " + add(5, 10, 15));
        System.out.println("Sum of two doubles: " + add(3.5, 2.7));
        System.out.println("Concatenated strings: " + concatenate("Hello", "World"));
    }
}

