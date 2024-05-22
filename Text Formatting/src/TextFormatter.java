import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TextFormatter {
    public static String formatText(String text) {
        String formatted = "";
        Scanner toFormat = new Scanner(text);
        ArrayList<SymbolTableEntry> symbolTable = new ArrayList<SymbolTableEntry>();

        // Build list of valid tokens, build symbol table
        Pattern word = Pattern.compile("\\w+");
        Pattern newLine = Pattern.compile("^"); // define new line as new paragraph
        Pattern punctuation = Pattern.compile("\\p{Punct}");

        Matcher wordMatch = word.matcher(text);
        Matcher newLineMatch = newLine.matcher(text);
        Matcher punctuationMatcher = punctuation.matcher(text);

        while (wordMatch.find()) {
            symbolTable.add(
                    new SymbolTableEntry(
                            wordMatch.start(),
                            wordMatch.end(),
                            wordMatch.group(),
                            "WORD"));
        }
        while (newLineMatch.find()) {
            symbolTable.add(
                    new SymbolTableEntry(
                            wordMatch.start(),
                            wordMatch.end(),
                            wordMatch.group(),
                            "NEWLINE"));
        }
        while (punctuationMatcher.find()) {
            symbolTable.add(
                    new SymbolTableEntry(
                            wordMatch.start(),
                            wordMatch.end(),
                            wordMatch.group(),
                            "PUNCT"));
        }

        toFormat.close();

        return formatted;
    }
}
