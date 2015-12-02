import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Sugarcoder on 11/03/2015.
 */

public class TestGrader {

    public static void main(String[] args) throws IOException {

        ScoreGrader scoreGrader = new ScoreGrader();
        Reader reader = new Reader();
        System.out.println("These are all the scores from the file.\n");
        reader.readScore();
        System.out.println("******************\n");

        System.out.println("Here are the class average, minimum, and maximum scores.");
        System.out.println("         Q1            Q2          Q3            Q4           M1           M2           F");
        System.out.printf("Average: " + "%f%12f%12f%12f%12f%12f%12f\n", scoreGrader.Q1avg(), scoreGrader.Q2avg(), scoreGrader.Q3avg(), scoreGrader.Q4avg(), scoreGrader.mid1avg(), scoreGrader.mid2avg(), scoreGrader.final1avg());
        System.out.printf("Minimum: " + "%d%12d%12d%12d%12d%12d%12d\n", scoreGrader.Q1min(), scoreGrader.Q2min(), scoreGrader.Q3min(), scoreGrader.Q4min(), scoreGrader.mid1min(), scoreGrader.mid2min(), scoreGrader.final1min());
        System.out.printf("Maximum: " + "%d%12d%12d%12d%12d%12d%12d\n", scoreGrader.Q1max(), scoreGrader.Q2max(), scoreGrader.Q3max(), scoreGrader.Q4max(), scoreGrader.mid1max(), scoreGrader.mid2max(), scoreGrader.final1max());
        System.out.println(" ");

        System.out.println("******************\n");

        // The code below will write to a file called "output.txt".

        Writer.writeToFile();

        System.out.println("Letter grade has been calculated for students listed in 'input.txt' file and written to 'output.txt' file.\n");


        doCleanup();

    }


    public static void doCleanup() {
        boolean quit = false;
        while(!quit) {
            System.out.println("..... Press Enter to continue");
            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();
            System.exit(0);
        }
    }

}
