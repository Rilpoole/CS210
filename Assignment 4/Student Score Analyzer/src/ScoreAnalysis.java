public class ScoreAnalysis {

    /**
     * Calculates the arithmetic average of an array of integers.
     * 
     * @param scores The array of integers to be averaged
     * @return The average of the integers
     */
    public static double calculateAverage(int[] scores) {

        // Validate input
        if (scores == null) {
            return 0.0;
        } else if (scores.length == 0) {
            return 0.0;
        }

        double average = 0.0;

        // Calculate the averate
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        average = sum / scores.length;

        return average;
    }

    /**
     * Determines the maximum integer in an array
     * 
     * @param scores
     * @return
     */
    public static int findMaxScore(int[] scores) {

        // Validate input
        if (scores == null) {
            return 0;
        } else if (scores.length == 0) {
            return 0;
        }

        int maxScore = scores[0];

        // Determine the maximum
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        return maxScore;
    }

    /**
     * Determines the minimum integer value in an array.
     * 
     * @param scores The array of integers to search.
     * @return The maximum integer found.
     */
    public static int findMinScore(int[] scores) {

        // Validate input
        if (scores == null) {
            return 0;
        } else if (scores.length == 0) {
            return 0;
        }

        int minScore = scores[0];

        // Search for minimum
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < minScore) {
                minScore = scores[i];
            }
        }

        return minScore;
    }
}
