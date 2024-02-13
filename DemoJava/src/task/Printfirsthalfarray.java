package task;

import java.util.Scanner;

public class Printfirsthalfarray {
    Scanner s = new Scanner(System.in);
     System.out.println("Enter the size if the array");
     int size = s.nextInt();
     System.out.println("Enter the elements of the array");
     int[] array = new int[size];

     for(int i = 0; i < size; i++)
    {

        array[i] = s.nextInt();

            }
     System.out.println("First half array");

      printFirstHalf(array);
     s.close();
}
private static void printFirsthalf(int[] array) {
    int halfSize = array.length / 2;
    for (int i = 0; i < halfSize; i++)
    {
        System.out.println(array[i] + " ");
    }
    System.out.println();



    }
    }

