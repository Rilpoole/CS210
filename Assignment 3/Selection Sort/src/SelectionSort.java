public class SelectionSort {
    /**
     * Sorts an array in place decending using the selection sort algorithm.
     * 
     * @param numbers The array of numbers to be sorted.
     */
    public static void selectionSortDecending(int[] numbers) {
        if (numbers == null) {
            return;
        } else if (numbers.length < 2) {
            return;
        } else {
            int sortedEnd = 0;
            int maxIndex = 0;
            int searchIndex = 0;
            for (sortedEnd = 0; sortedEnd < numbers.length; sortedEnd++) {

                // Find next max index
                searchIndex = sortedEnd;
                maxIndex = sortedEnd;
                for (; searchIndex < numbers.length; searchIndex++) {
                    if (numbers[searchIndex] > numbers[maxIndex]) {
                        maxIndex = searchIndex;
                    }
                }
                swap(numbers, sortedEnd, maxIndex);
            }
        }
    }

    /**
     * Swaps elements of an array.
     * 
     * @param arr Array with elements to be swapped.
     * @param i   Position of one element to be swapped.
     * @param j   Position of other element to be swapped.
     */
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}