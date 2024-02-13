package task;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = s.nextInt();
        System.out.println("Enter the elements of the array");
        int[] array = new int[size];
        for(int i = 0; i < size;i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("To print even or odd number");

    }
}
