package time;


public class ReverseString {
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.reverseString();

    }

    public void reverseString()
    {
        String originalString = "123abc";
        String reverse = "";
//        char ch ;
        for(int i =originalString.length()-1;i>=0;i--){
            reverse = reverse+originalString.charAt(i);
        }
        System.out.println(reverse);
    }
}
