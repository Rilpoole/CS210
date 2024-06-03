import org.junit.Test;
import org.junit.Assert;

public class Test_Circle_Area {
    @Test
    public void zeroRadius() {
        Circle c = new Circle(0);
        Assert.assertEquals(0.0, c.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void negativeRadius() {
        Circle c = new Circle(-1);
        Assert.assertEquals(0, c.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void nan() {
        Circle c = new Circle(Double.NaN);
        Assert.assertEquals(Double.NaN, c.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void typical() {
        Circle c = new Circle(10);
        Assert.assertEquals(Math.PI * Math.pow(10, 2), c.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void minAbs() {
        Circle c = new Circle(Double.MIN_VALUE);
        Assert.assertEquals(0.0, c.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void min() {
        Circle c = new Circle(-1 * Double.MAX_VALUE);
        Assert.assertEquals(0, c.area(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void maxAbs() {
        Circle c = new Circle(Double.MAX_VALUE);
        Assert.assertEquals(Double.POSITIVE_INFINITY, c.area(), Test_Environment.MACHINE_EPSILON);
    }
}