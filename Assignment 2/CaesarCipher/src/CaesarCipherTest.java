import org.junit.Test;
import org.junit.Assert;

public class CaesarCipherTest {
    @Test
    /**
     * Tests that an empty input returns empty
     */
    public void emptyInput(){
        Assert.assertEquals("", CaesarCipher.encrypt("", 27));
    }

    @Test
    /**
     * Tests that a mixed string with no shift returns itself. 
     */
    public void mixedNoChange(){
        Assert.assertEquals("ABC-123-$ $-abc", CaesarCipher.encrypt("ABC-123-$ $-abc", 0));
    }

    @Test
    /**
     * Tests that a mixed string will wrap around in the forward direction.
     */
    public void mixedWrapForward(){
        Assert.assertEquals("BCD-123-$ $-bcd", CaesarCipher.encrypt("ABC-123-$ $-abc", 27));
    }

    @Test
    /**
     * Tests that a mixed string will wrap around in the backwards direction. 
     */
    public void mixedWrapBackward(){
        Assert.assertEquals("ZAB-123-$ $-zab", CaesarCipher.encrypt("ABC-123-$ $-abc", -27));
    }

    @Test
    /**
     * Tests that a lower letter is ciphered correctly forward. 
     */
    public void basicLowerTest(){
        Assert.assertEquals("c",CaesarCipher.encrypt("a", 2));
    }

    @Test
    /**
     * Tests that an uppercase letter is ciphered correctly forward. 
     */
    public void basicUpperTest(){
        Assert.assertEquals("C", CaesarCipher.encrypt("A",2));
    }

    @Test
    /**
     * Tests that a lower letter wraps around in the forward direction. 
     */
    public void wrapLowerForward(){
        Assert.assertEquals("a",CaesarCipher.encrypt("z", 1));
    }

    @Test
    /**
     * Tests that a lower letter wraps around in the backwards direction. 
     */
    public void wrapLowerBackward(){
        Assert.assertEquals("z",CaesarCipher.encrypt("a", -1));
    }

    @Test
    /**
     * Tests that an upper letter wraps around in the forward direction. 
     */
    public void wrapUpperForward(){
        Assert.assertEquals("A",CaesarCipher.encrypt("Z", 1));
    }

    @Test
    /**
     * Tests that a letter wraps around in the backwards direction. 
     */
    public void wrapUpperBackward(){
        Assert.assertEquals("Z",CaesarCipher.encrypt("A", -1));
    }

    @Test
    /**
     * Tests that lower letters are ciphered forward. 
     */
    public void basicLower(){
        Assert.assertEquals("bcd", CaesarCipher.encrypt("abc", 1));
    }

    @Test
    /**
     * Tests that upper letters are ciphered forward. 
     */
    public void basicUpper(){
        Assert.assertEquals("BCD", CaesarCipher.encrypt("ABC", 1));
    }

    @Test
    /**
     * Tests that lower letters wrap forward. 
     */
    public void wrapLower(){
        Assert.assertEquals("aaa", CaesarCipher.encrypt("zzz", 1));
    }

    @Test
    /**
     * Tests that upper letters wrap forward. 
     */
    public void wrapUpper(){
        Assert.assertEquals("AAA", CaesarCipher.encrypt("ZZZ", 1));
    }

    @Test
    /**
     * Tests that shifts beyond 26 wrap correctly. 
     */
    public void wrapModLowerForward(){
        Assert.assertEquals("bbb",CaesarCipher.encrypt("aaa", 27));
    }

    @Test
    /**
     * Tests that shifts less than -26 wrap correctly. 
     */
    public void wrapModLowerBackward(){
        Assert.assertEquals("zzz",CaesarCipher.encrypt("aaa", -27));
    }
}
