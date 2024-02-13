package time;

public class DS3ELSEIF {
    public static void main(String[] args) {
        char ch = '8';
        if ((ch <= 65 && ch >= 90) || (ch <= 97 && ch >= 122))
        {
            System.out.println(ch + "Is an Alphabet");
        }


        else if (ch <= 97 && ch >= 122)
        {
            System.out.println(ch + "Is a number");
        }
        else {
            System.out.println(ch + "Is a special character");
        }
    }
}
