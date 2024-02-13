public class Operators1 {
    public static void main (String [] args)
    {
        int a = 8;
        int b = 4;

        boolean x = true, y = false;
        System.out.println("Logical Operators :");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println("Conditional Operator :");
        int max = (a > b) ? a : b;
        System.out.println("Maximum number between a and b: " + max);
    }
}
