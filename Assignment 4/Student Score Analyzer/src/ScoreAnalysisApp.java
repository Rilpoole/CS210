import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.ArrayList;

public class ScoreAnalysisApp {
    /**
     * Provides an entry point for assignment 4 coding problem 1. Args[0] is he
     * input filepath Args[1] is the output filepath. Reads each line in the input
     * file, parses the name and scores, and writes to an output file.
     * <p>
     * Example input: John Doe, 80, 70, 90, 66
     * </p>
     * <p>
     * Example output: John Doe: Avg 76.5, Max 90, Min 66
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);
        Scanner inputLines = new Scanner(inputFile);
        FileWriter writer = new FileWriter(outputFile);
        Boolean printNewLine = false;

        // parse lines of input
        while (inputLines.hasNextLine()) {

            if (printNewLine) {
                writer.write("\n");
            }

            String firstName = "";
            String lastName = "";
            double average = 0.0;
            int minVal = 0;
            int maxVal = 0;

            // add to linked list
            ArrayList<Integer> scoresList = new ArrayList<Integer>();
            String[] line = inputLines.nextLine().split(", ");
            firstName = line[0].split(" ")[0];
            lastName = line[0].split(" ")[1];
            for (int i = 1; i < line.length; i++) {
                scoresList.add(Integer.parseInt(line[i]));
            }

            // turn linked list into integer array
            int[] scoresArray = new int[scoresList.size()];
            for (int i = 0; i < scoresArray.length; i++) {
                scoresArray[i] = scoresList.get(i);
            }

            // calculate and print to the output file
            average = ScoreAnalysis.calculateAverage(scoresArray);
            maxVal = ScoreAnalysis.findMaxScore(scoresArray);
            minVal = ScoreAnalysis.findMinScore(scoresArray);
            String outputString = String.format(
                    "%s %s: Avg %.1f, Max %d, Min %d",
                    firstName, lastName, average, maxVal, minVal);
            writer.write(outputString);

            printNewLine = true;
        }
        inputLines.close();
        writer.close();
    }
}
