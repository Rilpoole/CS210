import org.junit.Test;
import org.junit.Assert;

public class AverageTest {

    private final double machineEpsilonDouble = 1e-15;

    @Test
    public void positives() {
        int[] arr = { 1, 2, 3 };
        Assert.assertEquals(2.0, Average.calculateAverage(arr), machineEpsilonDouble);
    }

    @Test
    public void negatives() {
        int[] arr = { -1, -2, 5 };
        Assert.assertEquals(2.0 / 3, Average.calculateAverage(arr), machineEpsilonDouble);
    }

    @Test
    public void zeros() {
        int[] arr = { 0, 0, 0 };
        Assert.assertEquals(0.0, Average.calculateAverage(arr), machineEpsilonDouble);
    }

    @Test
    public void empty() {
        int[] arr = {};
        Assert.assertEquals(0.0, Average.calculateAverage(arr), machineEpsilonDouble);
    }

    @Test
    public void nullArray(){
        int[] arr = null;
        Assert.assertEquals(Double.NaN, Average.calculateAverage(arr), machineEpsilonDouble);
    }

    @Test
    public void singleNumber(){
        int[] arr = {1};
        Assert.assertEquals(1, Average.calculateAverage(arr), machineEpsilonDouble);
    }

    @Test
    public void singleZero(){
        int[] arr = {0};
        Assert.assertEquals(0, Average.calculateAverage(arr), machineEpsilonDouble);
    }

    @Test
    public void maxInt() {
        int[] arr = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };
        Assert.assertEquals(Integer.MAX_VALUE, Average.calculateAverage(arr), machineEpsilonDouble);
    }

    @Test
    public void minInt() {
        int[] arr = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        Assert.assertEquals(Integer.MIN_VALUE, Average.calculateAverage(arr), machineEpsilonDouble);
    }

    @Test
    public void character() {
        int[] arr = { 'a', 'b', 'c' };
        Assert.assertEquals(('a' + 'b' + 'c') / 3.0, Average.calculateAverage(arr), machineEpsilonDouble);
    }
}
