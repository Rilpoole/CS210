public class Average {
    /**
     * Calculates the average of an array of integer numbers.
     * Uses simple arithmetic average.
     * 
     * @param arr The array to average
     * @return The average of the numbers
     */
    public static double calculateAverage(int[] arr) {

        double average = 0.0;

        // Input checking
        if (arr == null) {
            average = Double.NaN;
        } else if (arr.length == 0) {
            average = 0.0;
        } else {
            // Calculate average
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            average = sum / arr.length;
        }
        return average;
    }
}