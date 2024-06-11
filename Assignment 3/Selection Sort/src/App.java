import java.util.Scanner;

public class App {
    /**
     * Provides entry point for Assignment 3 Problem 2.
     * Takes arrays of integers as input and prints to standard output the sorted
     * array. The first element must be the number of elements. Enter 0 to exit.
     * Example input 5 10 7 2 15 8. Example return 15,10,8,7,2.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int count = -1;
        Scanner lines = new Scanner(System.in);
        while (count != 0) {

            // Determine count
            String line = lines.nextLine();
            Scanner inputs = new Scanner(line);
            if (inputs.hasNextInt()) {
                count = inputs.nextInt();
            }

            // Build input array
            int arr[] = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = inputs.nextInt();
            }
            inputs.close();

            // Sort
            SelectionSort.selectionSortDecending(arr);

            // Print sorted array
            if (arr.length > 0) {
                for (int i = 0; i < arr.length - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.print(arr[arr.length - 1]);
                System.out.print("\n");
            } else {
                System.out.print(0);
            }
        }
        lines.close();
    }
}
