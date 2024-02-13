import javax.sound.midi.MidiFileFormat;

public class DS3 {
    public static void main (String [] args)
    {
        char ch = 'S';
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
        {
            System.out.println(ch + " is an alphabet");
        }
        else if(ch >= 97 && ch <= 122)
        {
            System.out.println(ch + " is a digit");
        }
        else {
            System.out.println(ch + " is a special character");
        }

    }
}
