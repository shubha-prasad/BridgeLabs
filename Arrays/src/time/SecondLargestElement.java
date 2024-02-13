package time;
public class SecondLargestElement {
    public static void main(String[] args) {
        int [] a = {10,20,30,40};
        int largest = a[0];
        int secondlargest = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > largest)
            {
                secondlargest = largest;
                largest = a[i];
            } else if (a[i] > secondlargest && a[i] != largest) {
                secondlargest = a[i];
            }
        }
        System.out.println("Second Largest : " + secondlargest);
    }
}