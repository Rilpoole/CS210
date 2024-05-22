import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public class App {
    /**
     * Provides entry point for assignment 4 coding problem 2.
     * args[0] is input filepath args[1] is output filepath.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader(args[0]);
        Scanner scr = new Scanner(reader);
        FileWriter writer = new FileWriter(args[1]);
        while (scr.hasNextLine()) {
            writer.write(TextFormatter.formatText(scr.nextLine()));
            writer.write(TextFormatter.UNIX_NEW_LINE.toString()); // so multiple paragraphs are on new lines
        }
        scr.close();
        writer.close();
    }
}
