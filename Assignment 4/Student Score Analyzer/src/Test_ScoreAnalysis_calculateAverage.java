import org.junit.Assert;
import org.junit.Test;

public class Test_ScoreAnalysis_calculateAverage {

    @Test
    public void nullArray() {
        Assert.assertEquals(0.0, ScoreAnalysis.calculateAverage(null), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void emptyArray() {
        int[] empty = {};
        Assert.assertEquals(0.0, ScoreAnalysis.calculateAverage(empty), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void singleValue() {
        int[] single = { 1 };
        Assert.assertEquals(1.0, ScoreAnalysis.calculateAverage(single), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void basic() {
        int[] scores = { 10, 20, 30, 40, 50, 60, 70 };
        Assert.assertEquals(40.0, ScoreAnalysis.calculateAverage(scores), Test_Environment.MACHINE_EPSILON);
    }

    // It is nonsensical to have a negative score, but the function should still be
    // able to handle this input without crashing.
    @Test
    public void negative() {
        int[] scores = { -10, -20, -30 };
        Assert.assertEquals(-20.0, ScoreAnalysis.calculateAverage(scores), Test_Environment.MACHINE_EPSILON);
    }

    // It is nonsensical to have a negative score, but the function should still be
    // able to handle this input without crashing.
    @Test
    public void sumToZero() {
        int[] scores = { -10, 10 };
        Assert.assertEquals(0, ScoreAnalysis.calculateAverage(scores), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void maxInt() {
        int[] scores = { Integer.MAX_VALUE, Integer.MAX_VALUE };
        Assert.assertEquals(Integer.MAX_VALUE, ScoreAnalysis.calculateAverage(scores),
                Test_Environment.MACHINE_EPSILON);
    }

    // It is nonsensical to have a negative score, but the function should still be
    // able to handle this input without crashing.
    @Test
    public void minInt() {
        int[] scores = { Integer.MIN_VALUE, Integer.MIN_VALUE };
        Assert.assertEquals(Integer.MIN_VALUE, ScoreAnalysis.calculateAverage(scores),
                Test_Environment.MACHINE_EPSILON);
    }
}
