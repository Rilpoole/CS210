import org.junit.Test;
import org.junit.Assert;

public class Test_Rectangle_Area {
    @Test
    public void zeroLength() {
        Rectangle r = new Rectangle(0, 1);
        Assert.assertEquals(0, r.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void zeroWidth() {
        Rectangle r = new Rectangle(1, 0);
        Assert.assertEquals(0, r.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void negativeLength() {
        Rectangle r = new Rectangle(-1, 1);
        Assert.assertEquals(0, r.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void negativeWidth() {
        Rectangle r = new Rectangle(1, -1);
        Assert.assertEquals(0, r.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void typical() {
        Rectangle r = new Rectangle(2, 2);
        Assert.assertEquals(4, r.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void minAbs() {
        Rectangle r = new Rectangle(Double.MIN_VALUE, 1);
        Assert.assertEquals(0, r.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void min() {
        Rectangle r = new Rectangle(-1 * Double.MAX_VALUE, 1);
        Assert.assertEquals(0, r.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void max() {
        Rectangle r = new Rectangle(Double.MAX_VALUE, 1);
        Assert.assertEquals(Double.MAX_VALUE, r.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void nan() {
        Rectangle r = new Rectangle(Double.NaN, 1);
        Assert.assertEquals(Double.NaN, r.area(), Test_Environment.MACHINE_EPSILON);
    }
}
