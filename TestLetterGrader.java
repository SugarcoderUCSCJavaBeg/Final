import java.io.IOException;

public class TestLetterGrader {

    public static void main(String[] args) throws IOException {
        LetterGrader letterGrader = new LetterGrader();
        System.out.println("This is all of the scores from the file.");
        System.out.println("\n");
        letterGrader.readScore();
        System.out.println("******************\n");

        // System.out.println("Displaying average scores, minimum scores and maximum scores.");
        // System.out.println("Q1    Q2    Q3    Q4    M1    M2    F");
        // System.out.println("..... Press enter to continue");

        // System.out.println("This is all the averages of the students.");

        letterGrader.displayAllAverages();

        // letterGrader.displayAssnAverages();      // Displays the average in the console (don't write to the fle)


        // System.out.println("******************\n");

        // letterGrader.calcLetterGrade(100);


        // System.out.println("******************\n");


        // letterGrader.printGrade();               Writes the grade in output file




    }
}
