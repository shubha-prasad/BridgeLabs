import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        System.out.println(Pattern.matches(".a","sa"));

        String regex = "[A-Z]{1}[a-z]{3}";


        Pattern p= Pattern.compile(regex);

        for(int i = 0; i < names.size(); i++)
        {
            Matcher m = p.matcher(names.get(i));
            System.out.println("tHE first name is : ");
            System.out.println(names.get(i)+" "+m.matches());
        }

    }
}
