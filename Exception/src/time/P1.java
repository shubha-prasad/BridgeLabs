package time;

public class P1 {
    public static void main(String[] args) {
        int a = 10;
        for(int i =5; i >= 0; i--)
        {
            try{
                System.out.println(a/i);
            }catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        }
    }
}
