import org.junit.Test;
import org.junit.Assert;

public class PrimeNumberCheckerTest {
    @Test
    /**
     * Checks that numbers less than two are not prime. 
     */
    public void lessThanTwo(){
        Assert.assertEquals(false, PrimeNumberChecker.isPrime(1));
    }

    @Test
    /**
     * Checks that two is prime. 
     */
    public void two(){
        Assert.assertEquals(true, PrimeNumberChecker.isPrime(2));
    }

    @Test
    /**
     * Chekcs that zero is not prime. Edge case.
     */
    public void zero(){
        Assert.assertEquals(false, PrimeNumberChecker.isPrime(0));
    }

    @Test
    /**
     * Checks that negative numbers are not prime. 
     */
    public void negative(){
        Assert.assertEquals(false, PrimeNumberChecker.isPrime(-1));
    }

    @Test
    /**
     * Checks that very large negative inputs do not ruin the algorithm. 
     */
    public void maxNegative(){
        Assert.assertEquals(false, PrimeNumberChecker.isPrime(-1*Integer.MAX_VALUE));
    }

    @Test
    /**
     * Checks that very large positive inputs can be handled within a reasonable time. 
     */
    public void maxPositive(){
        //Fun fact: this is called a Mersenne prime
        Assert.assertEquals(true,PrimeNumberChecker.isPrime(Integer.MAX_VALUE));
    }

    @Test
    /**
     * Checks a basic moderate positive input with known output. Prime. 
     */
    public void basicPrime(){
        Assert.assertEquals(true, PrimeNumberChecker.isPrime(7));
    }

    @Test
    /**
     * Checks a basic moderate posivite input with known output. Not prime. 
     */
    public void baisicNotPrime(){
        Assert.assertEquals(false, PrimeNumberChecker.isPrime(4));
    }


}
