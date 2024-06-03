import org.junit.Test;
import org.junit.Assert;

public class Test_Circle {
    @Test
    public void zeroRadius(){
        Circle c = new Circle(0);
        Assert.assertEquals(0.0,c.area(),Test_Environment.MACHINE_EPSILON);
    }

    @Test
    public void negativeRadius(){
        
    }
}
