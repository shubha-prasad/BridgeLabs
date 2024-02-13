package time;

public class CustomException {
    public static void validate(int age) throws InvalidAgeException{
        if(age<18)
        {
            throw new InvalidAgeException("age is not valid");
        }
        else{
            System.out.println("success");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        try {

            validate(15);
        }catch(InvalidAgeException ex){
            System.out.println("exception is occurred" + ex);
            ex.printStackTrace();
        }

    }
}
