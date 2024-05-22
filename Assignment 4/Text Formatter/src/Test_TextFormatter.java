import org.junit.Test;
import org.junit.Assert;

public class Test_TextFormatter {
    @Test
    public void multipleSpaces() {
        String toformat = "This  is  the  string  to  test.";
        String expected = "  This is the string to test.";
        String actual = TextFormatter.formatText(toformat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void columnLimit() {
        String toformat = "01234567890123456789012345678901234567890123456789012345678901234567890123456ABC";
        String expected = "  01234567890123456789012345678901234567890123456789012345678901234567890123456\nABC";
        String actual = TextFormatter.formatText(toformat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paragraphStartsWithTwoSpaces() {
        String toformat = "Paragraph.";
        String expected = "  Paragraph.";
        String actual = TextFormatter.formatText(toformat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void spacesBeforePunctuation() {
        String toformat = "  Test  .";
        String expected = "  Test.";
        String actual = TextFormatter.formatText(toformat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void assignmentHandoutExample() {
        String toformat = "This is a    sample text that    will be formatted. It contains   multiple   spaces and punctuation.  This   is   a single  paragraph ! !";
        String expected = "  This is a sample text that will be formatted. It contains multiple spaces and\npunctuation. This is a single paragraph!!";
        String actual = TextFormatter.formatText(toformat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nullString() {
        String toformat = null;
        String expected = null;
        String actual = TextFormatter.formatText(toformat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void emptyString() {
        String toformat = "";
        String expected = "";
        String actual = TextFormatter.formatText(toformat);
        Assert.assertEquals(expected, actual);
    }
}
