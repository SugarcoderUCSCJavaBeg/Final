import java.io.IOException;
import java.util.Scanner;

public class TestLetterGrader {

    public static void main(String[] args) throws IOException {

        boolean quit = false;
        LetterGrader letterGrader = new LetterGrader();
        System.out.println("These are all the scores from the file.");
        System.out.println("\n");
        letterGrader.readScore();
        System.out.println("******************\n");


        System.out.println("Here are the class average, minimum, and maximum scores.");
        System.out.println("         Q1            Q2          Q3            Q4           M1           M2           F");
        System.out.printf("Average: " + "%f%12f%12f%12f%12f%12f%12f\n", displayAverages.Q1avg(), displayAverages.Q2avg(), displayAverages.Q3avg(), displayAverages.Q4avg(), displayAverages.mid1avg(), displayAverages.mid2avg(), displayAverages.final1avg());
        System.out.printf("Minimum: " + "%d%12d%12d%12d%12d%12d%12d\n", displayAverages.Q1min(), displayAverages.Q2min(), displayAverages.Q3min(), displayAverages.Q4min(), displayAverages.mid1min(), displayAverages.mid2min(), displayAverages.final1min());
        System.out.printf("Maximum: " + "%d%12d%12d%12d%12d%12d%12d\n", displayAverages.Q1max(), displayAverages.Q2max(), displayAverages.Q3max(), displayAverages.Q4max(), displayAverages.mid1max(), displayAverages.mid2max(), displayAverages.final1max() );
        System.out.println(" ");

        while(!quit) {
            System.out.println("..... Press Enter to continue");
            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();
            System.exit(0);
        }




        // System.out.println("******************\n");

        // letterGrader.calcLetterGrade(100);


        // System.out.println("******************\n");


        // letterGrader.printGrade();               Writes the grade in output file




    }
}
