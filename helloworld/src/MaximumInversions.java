import java.util.Scanner;
public class MaximumInversions {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1: Read input values
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            // Step 3: Find the maximum sum of inversions
            int result = findMaxInversions(N, K, A);

            // Step 4: Output the result
            System.out.println(result);

            scanner.close();
        }

        // Step 2: Function to count inversions in a subsegment
        private static int countInversions(int[] subsegment) {
            int inversions = 0;
            for (int i = 0; i < subsegment.length - 1; i++) {
                for (int j = i + 1; j < subsegment.length; j++) {
                    if (subsegment[i] > subsegment[j]) {
                        inversions++;
                    }
                }
            }
            return inversions;
        }

        // Step 3: Function to find maximum sum of inversions
        private static int findMaxInversions(int N, int K, int[] A) {
            int maxSum = Integer.MIN_VALUE;

            // Iterate over all possible subsegments
            for (int i = 0; i <= N - K; i++) {
                for (int j = i + K - 1; j < N; j++) {
                    int[] subsegment = new int[j - i + 1];

                    // Create the subsegment
                    for (int k = i; k <= j; k++) {
                        subsegment[k - i] = A[k];
                    }

                    // Count inversions in the subsegment
                    int inversions = countInversions(subsegment);

                    // Update maxSum if needed
                    if (inversions > maxSum) {
                        maxSum = inversions;
                    }
                }
            }

            return maxSum;
        }
    }


