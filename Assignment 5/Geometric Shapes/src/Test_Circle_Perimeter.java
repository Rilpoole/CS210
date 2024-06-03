import org.junit.Assert;
import org.junit.Test;

public class Test_Circle_Perimeter {
    @Test
    public void zeroRadius() {
        Circle c = new Circle(0);
        Assert.assertEquals(0.0, c.perimeter(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void negativeRadius() {
        Circle c = new Circle(-1);
        Assert.assertEquals(0, c.perimeter(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void nan() {
        Circle c = new Circle(Double.NaN);
        Assert.assertEquals(Double.NaN, c.perimeter(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void typical() {
        Circle c = new Circle(10);
        Assert.assertEquals(2 * Math.PI * 10, c.perimeter(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void minAbs() {
        Circle c = new Circle(Double.MIN_VALUE);
        Assert.assertEquals(Double.MIN_VALUE, c.perimeter(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void min() {
        Circle c = new Circle(-1 * Double.MAX_VALUE);
        Assert.assertEquals(0, c.perimeter(), Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void maxAbs() {
        Circle c = new Circle(Double.MAX_VALUE);
        Assert.assertEquals(Double.POSITIVE_INFINITY, c.perimeter(), Test_Environment.MACHINE_EPSILON);
    }
}
