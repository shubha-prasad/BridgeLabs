import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PermutationofaString {
    public static List<String> generatePermutationsIterative(String str)
    {
        List<String> permutations = new ArrayList<>();
        permutations.add("");
        for (char c : str.toCharArray())
        {
            List<String> newPermutations = new ArrayList<>();
            for (String perm : permutations)
            {

                for(int i = 0; i <= perm.length(); i++)
                {
                    newPermutations.add(perm.substring(0, i) + c + perm.substring(i));
                }
            }
            permutations = newPermutations;
        }
        return permutations;
    }
    public static List<String> generatePermutationsRecursive(String str)
    {
        List<String> permutations = new ArrayList<>();

        generatePermutationsRecursiveHelper("", str, permutations);
        return permutations;
    }
    private static void generatePermutationsRecursiveHelper(String prefix, String suffix, List<String> permutations)
    {
        int n = suffix.length();
        if (n == 0)
        {
            permutations.add(prefix);
        }
        else {
            for(int i = 0; i < n; i++) {
                generatePermutationsRecursiveHelper(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1), permutations);
            }
            }
        }
        public static boolean areStringArraysEqual(String[] arr1, String[] arr2)

    {
return Arrays.equals(arr1,arr2);
    }
    public static void main(String [] args) {
        String input = "shubha";
        List<String> iterativePermutations = generatePermutationsIterative(input);
        System.out.println("Iterative Permutations: " + iterativePermutations);
        List<String> recursivePermutations = generatePermutationsRecursive(input);
        System.out.println("Recursive Permutations: " + recursivePermutations);

        boolean arraysEqual = areStringArraysEqual(iterativePermutations.toArray(new String[0]),
                recursivePermutations.toArray(new String[0]));
        System.out.println("are the arrays equal? : " + arraysEqual);
    }

    }


