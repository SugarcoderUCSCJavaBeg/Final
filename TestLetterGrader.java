import java.io.IOException;
import java.util.Scanner;

public class TestLetterGrader {

    public static void main(String[] args) throws IOException {

        boolean quit = false;
        LetterGrader letterGrader = new LetterGrader();
        System.out.println("These are all the scores from the file.\n");
        letterGrader.readScore();
        System.out.println("******************\n");

        System.out.println("Here are the class average, minimum, and maximum scores.");
        System.out.println("         Q1            Q2          Q3            Q4           M1           M2           F");
        System.out.printf("Average: " + "%f%12f%12f%12f%12f%12f%12f\n", letterGrader.Q1avg(), letterGrader.Q2avg(), letterGrader.Q3avg(), letterGrader.Q4avg(), letterGrader.mid1avg(), letterGrader.mid2avg(), letterGrader.final1avg());
        System.out.printf("Minimum: " + "%d%12d%12d%12d%12d%12d%12d\n", letterGrader.Q1min(), letterGrader.Q2min(), letterGrader.Q3min(), letterGrader.Q4min(), letterGrader.mid1min(), letterGrader.mid2min(), letterGrader.final1min());
        System.out.printf("Maximum: " + "%d%12d%12d%12d%12d%12d%12d\n", letterGrader.Q1max(), letterGrader.Q2max(), letterGrader.Q3max(), letterGrader.Q4max(), letterGrader.mid1max(), letterGrader.mid2max(), letterGrader.final1max());
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


        // letterGrader.printGrade();         Writes the grade in output file




    }
}
