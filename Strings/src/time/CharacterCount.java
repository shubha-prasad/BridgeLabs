package time;

public class CharacterCount {
        public static void main(String[] args) {
            String inputSequence = "Shubha1234";
            int characterCount = countCharacters(inputSequence);
            System.out.println("Number of characters in the sequence: " + characterCount);
        }

        public static int countCharacters(String inputSequence) {
            int count = 0;

            for (int i = 0; i < inputSequence.length(); i++) {
                if (Character.isLetter(inputSequence.charAt(i))) {
                    count++;
                }
            }

            return count;
        }
    }

