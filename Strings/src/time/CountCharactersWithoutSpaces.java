package time;

public class CountCharactersWithoutSpaces {
        public static void main(String[] args) {
            String inputSequence = "how are you shubha";
            int characterCount = countCharactersWithoutSpaces(inputSequence);
            System.out.println("Number of characters without spaces: " + characterCount);
        }

        public static int countCharactersWithoutSpaces(String inputSequence) {
            int count = 0;

            for (int i = 0; i < inputSequence.length(); i++) {
                if (inputSequence.charAt(i) != ' ') {
                    count++;
                }
            }

            return count;
        }
    }


