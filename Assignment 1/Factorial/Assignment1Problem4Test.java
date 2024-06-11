import org.junit.Test;

import org.junit.Assert;

public class Assignment1Problem4Test {
    @Test
    /**
     * Tests that an input value less than zero will throw an exception.
     * @author Riley Poole
     */
    public void LessThanZeroException(){
        boolean thrown = false; 
        try{
            Assignment1Problem4.Factorial(-1);
        }catch(RuntimeException e){
            thrown = true; 
        }
        Assert.assertTrue(thrown);
    }
    
    @Test
    /**
     * Tests that an input value of zero will return one. 
     * @author Riley Poole
     */
    public void ZeroReturnsOne(){
        Assert.assertEquals(1,Assignment1Problem4.Factorial(0));//Zero
    }
    
    @Test
    /**
     * Tests that input of 1 will return 1.
     * This is the minimum reasonable input value.
     * @author Riley Poole
     */
    public void MinInputValue(){
        Assert.assertEquals(1,Assignment1Problem4.Factorial(1));
    }

    @Test
    /**
     * Tests that input of 5 will return 120.
     * This is a value within the reasonable input range 1 to 32.
     * @author Riley Poole
     */
    public void MedInputValue(){
        Assert.assertEquals(120,Assignment1Problem4.Factorial(5));
    }

    @Test
    /**
     * Tests that input of 32 will return without exception.
     * This is the maximum value within the reasonable input range. 
     * @author Riley Poole
     */
    public void MaxInputValue(){
        boolean thrown = false; 
        try{
            Assignment1Problem4.Factorial(32);
        }catch(RuntimeException e){
            thrown = true; 
        }
        Assert.assertFalse(thrown);
    }

    @Test
    /**
     * Tests that input higher than 32 will throw an exception.
     * @author Riley Poole
     */
    public void AboveMaxInput(){
        boolean thrown = false; 
        try{
            Assignment1Problem4.Factorial(33);
        }catch(RuntimeException e){
            thrown = true; 
        }
        Assert.assertTrue(thrown);
    }
}

