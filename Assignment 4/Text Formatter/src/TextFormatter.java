public class TextFormatter {

    public static final StringBuilder UNIX_NEW_LINE = new StringBuilder("\n");

    /**
     * Formats an input string with the following conditions:
     * <p>
     * 1. Ensure each line contains at most 80 charactrs.
     * </p>
     * <p>
     * 2. Consolidate multiple consecutive shite spaces into a single white space.
     * </p>
     * <p>
     * 3. Remove spaces before punctuatio marks.
     * </p>
     * <p>
     * 4. Start each paragraph with two white spaces.
     * </p>
     * Each input string is assumed to be it's own independant paragraph.
     * 
     * @param text The input string to format.
     * @return The formatted string.
     */
    public static String formatText(String text) {

        // Validate input
        if (text == null) {
            return text;
        } else if (text.length() == 0) {
            return text;
        }

        StringBuilder formatted = new StringBuilder(text);

        // Format the string
        formatted = trim(formatted);
        formatted = consecutiveWhiteSpace(formatted);
        formatted = punct(formatted);
        formatted = new StringBuilder("  " + formatted);
        formatted = columnLimit(formatted);
        formatted = newlineWhiteSpace(formatted);

        return formatted.toString();
    }

    /**
     * Checks if the input character is punctuation.
     * 
     * @param c Input character to check
     * @return True if character is punctuation.
     */
    public static Boolean isPunct(char c) {
        Boolean isPunct = false;

        switch (c) {
            case '.':
                isPunct = true;
                break;
            case ',':
                isPunct = true;
                break;
            case '!':
                isPunct = true;
                break;
            case '?':
                isPunct = true;
                break;
            default:
                break;
        }

        return isPunct;
    }

    /**
     * Trim the leading and trailing whitespaces off of a string.
     * 
     * @param toFormat The string to trim.
     * @return The trimmed string.
     */
    private static StringBuilder trim(StringBuilder toFormat) {
        StringBuilder formatted = new StringBuilder();

        // Eliminate initial whitespace
        int start = 0;
        while (Character.isWhitespace(toFormat.charAt(start))) {
            start++;
        }

        // Eliminate trailing whitespace
        int end = toFormat.length();
        while (Character.isWhitespace(toFormat.charAt(start))) {
            end--;
        }

        formatted = new StringBuilder(toFormat.substring(start, end));

        return formatted;
    }

    /**
     * Remove consecutive whitespaces in a string.
     * 
     * @param toFormat String with possible consecutive whitespaces.
     * @return The string with consecutive whitespaces removed.
     */
    private static StringBuilder consecutiveWhiteSpace(StringBuilder toFormat) {
        StringBuilder formatted = new StringBuilder();

        // Eliminate consecutive whitespace
        for (int i = 0; i < toFormat.length(); i++) {
            if ((i - 1) > 0
                    && i < toFormat.length()
                    && Character.isWhitespace(toFormat.charAt(i))
                    && Character.isWhitespace(toFormat.charAt(i - 1))) {
            } else {
                formatted.append(toFormat.charAt(i));
            }
        }

        return formatted;
    }

    /**
     * Remove whitespaces before punctuation.
     * 
     * @param toFormat The string with possible whitespaces before punctuation.
     * @return The string with whitespaces before punctuation removed.
     */
    private static StringBuilder punct(StringBuilder toFormat) {
        StringBuilder formatted = new StringBuilder();

        // remove spaces before punctuation marks
        for (int i = 0; i < toFormat.length(); i++) {
            if ((i + 1) < toFormat.length()
                    && Character.isWhitespace(toFormat.charAt(i))
                    && isPunct(toFormat.charAt(i + 1))) {
                i++; // we need to move the index up to avoid double punctuation
                formatted.append(toFormat.charAt(i));
            } else {
                formatted.append(toFormat.charAt(i));
            }
        }

        return formatted;
    }

    /**
     * Enforce a column limit of 80 characters per line. Creates a new line when
     * necessary. Version 1.0 does not yet have the capability to bring the entire
     * word to the next line.
     * 
     * @param toFormat
     * @return
     * @version 1.0
     */
    private static StringBuilder columnLimit(StringBuilder toFormat) {
        StringBuilder formatted = new StringBuilder();

        int columnCounter = 1;
        for (int i = 0; i < toFormat.length(); i++) {
            if (columnCounter < 80) {// needs to be less than not equal too to avoid making new line 81st character
                formatted.append(toFormat.charAt(i));
                columnCounter++;
            } else {

                // start a new line
                formatted.append(UNIX_NEW_LINE.toString());

                // reset the counter
                columnCounter = 1;

                // to capture the letter before the new line
                i--;

                if (Character.isWhitespace(toFormat.charAt(i))) {
                    i++; // to avoid starting a new line with a space
                }
            }
        }
        return formatted;
    }

    /**
     * 
     * @param toFormat
     * @return
     */
    private static StringBuilder newlineWhiteSpace(StringBuilder toFormat) {
        StringBuilder formatted = new StringBuilder();

        // remove spaces before punctuation marks
        for (int i = 0; i < toFormat.length(); i++) {
            if ((i + 1) < toFormat.length() && toFormat.charAt(i) == UNIX_NEW_LINE.toString().charAt(0)
                    && Character.isWhitespace(toFormat.charAt(i + 1))) {
                formatted.append(toFormat.charAt(i));
                i++;// remove the space
            } else {
                formatted.append(toFormat.charAt(i));
            }
        }

        return formatted;
    }
}
