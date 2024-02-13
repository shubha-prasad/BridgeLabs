package array;

import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the " + size + " values");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
}
