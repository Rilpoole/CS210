import java.util.Scanner;

public class App {
    /**
     * Provides entry point for assignment 3 problem 1.
     * Continues to take input lines until 0 is entered.
     * Input line is in the format count-#-#-#.
     * Example 3 1 2 3 returns average of 1 2 3 which is 2.
     * Inputs are assumed to be integers and the output is a double.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int count = -1;
        while (count != 0) {

            // Determine count
            String line = scr.nextLine();
            Scanner inputs = new Scanner(line);
            if (inputs.hasNextInt()) {
                count = inputs.nextInt();
            }

            // Build array
            int[] arr = new int[count];
            int i = 0;
            while (inputs.hasNextInt()) {
                arr[i++] = inputs.nextInt();
            }

            // Calculate average
            Double average = Average.calculateAverage(arr);
            System.out.println(String.format("%.1f", average));
            inputs.close();
        }
        scr.close();
    }
}