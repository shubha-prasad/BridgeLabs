package time;

public class WordCountWithoutSpaces {
    public static void main(String[] args) {
        String inputString = "How are you shubha";
        int wordCount = countWordsWithoutSpaces(inputString);
        System.out.println("Number of words without spaces : " + wordCount);
    }

    public static int countWordsWithoutSpaces(String inputString) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) != ' ')
            {
                count++;
                while (i < inputString.length() - 1 && inputString.charAt(i + 1) != ' ') {
                    i++;
                }
            }
        }
        return count;
    }
}


