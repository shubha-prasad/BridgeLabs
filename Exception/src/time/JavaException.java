package time;

import java.io.IOException;

public class JavaException {
    public static void main(String[] args) throws IOException {
        JavaException j = new JavaException();
        j.demo();
        try{
            int data = 100/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println("Exception problem");
        }
        finally{
            System.out.println("finally block");
        }

    }
    public void demo() throws IOException{
        throw new IOException("error");
    }

}
