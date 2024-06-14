import org.junit.Assert;
import org.junit.Test;

public class Test_Factorial {
    @Test
    public void negative(){
        Assert.assertEquals(-1,Factorial.calculate(-1));
    }

    @Test
    public void zero(){
        Assert.assertEquals(1,Factorial.calculate(0));
    }

    @Test
    public void positive(){
        Assert.assertEquals(6,Factorial.calculate(3));
    }

    @Test
    public void maxInt(){
        
    }

}
