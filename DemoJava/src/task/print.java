package task;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();
        System.out.println("Enter the elements of the array");
        int[] array = new int[size];
        System.out.println("First half of array");
        printFirstHalf(array);
        s.close();
    }

    private static void printFirstHalf(int[] array) {
        int halfSize = array.length / 2;
        for (int i = 0; i < halfSize; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}

