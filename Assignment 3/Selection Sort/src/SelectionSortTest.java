import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class SelectionSortTest {
    @Test
    public void accendingPositive() {
        int arr[] = { 1, 2, 3 };
        int expected[] = { 3, 2, 1 };
        SelectionSort.selectionSortDecending(arr);
        Assert.assertEquals(true, Arrays.equals(arr, expected));
    }

    @Test
    public void accendingNegative() {
        int arr[] = { -3, -2, -1 };
        int expected[] = { -1, -2, -3 };
        SelectionSort.selectionSortDecending(arr);
        Assert.assertEquals(true, Arrays.equals(arr, expected));
    }

    @Test
    public void empty() {
        int arr[] = {};
        int expected[] = {};
        SelectionSort.selectionSortDecending(arr);
        Assert.assertEquals(true, Arrays.equals(arr, expected));
    }

    @Test
    public void nullArray() {
        int arr[] = null;
        int expected[] = null;
        SelectionSort.selectionSortDecending(arr);
        Assert.assertEquals(true, Arrays.equals(arr, expected));
    }

    @Test
    public void singleElement() {
        int arr[] = { 1 };
        int expected[] = { 1 };
        SelectionSort.selectionSortDecending(arr);
        Assert.assertEquals(true, Arrays.equals(arr, expected));
    }

    @Test
    public void repeatingNumbers() {
        int arr[] = { 1, 1, 1, 3 };
        int expected[] = { 3, 1, 1, 1 };
        SelectionSort.selectionSortDecending(arr);
        Assert.assertEquals(true, Arrays.equals(arr, expected));
    }

    @Test
    public void allSame() {
        int arr[] = { 2, 2, 2, 2 };
        int expected[] = { 2, 2, 2, 2 };
        SelectionSort.selectionSortDecending(arr);
        Assert.assertEquals(true, Arrays.equals(arr, expected));
    }

    @Test
    public void allZero() {
        int arr[] = { 0, 0, 0 };
        int expected[] = { 0, 0, 0 };
        SelectionSort.selectionSortDecending(arr);
        Assert.assertEquals(true, Arrays.equals(arr, expected));
    }

    @Test
    public void multipleZero() {
        int arr[] = { 0, 0, 0, 1 };
        int expected[] = { 1, 0, 0, 0 };
        SelectionSort.selectionSortDecending(arr);
        Assert.assertEquals(true, Arrays.equals(arr, expected));
    }
}
