package time;
import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Read input values
            System.out.println("Enter the size of the array:");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Checking even or odd for each element:");

            for (int i = 0; i < size; i++) {
                if (isEven(array[i])) {
                    System.out.println(array[i] + " is even.");
                } else {
                    System.out.println(array[i] + " is odd.");
                }
            }

            scanner.close();
        }

        private static boolean isEven(int number) {


        return number % 2 == 0;
        }
    }



