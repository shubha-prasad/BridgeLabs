package array;

import java.util.Scanner;

public class ClassB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();
        int [] a = new int[size];
        System.out.println("Enter the " + size + "array");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = s.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        System.out.println(sum);

    }

}
