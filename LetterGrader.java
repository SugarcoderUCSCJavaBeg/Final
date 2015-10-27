import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

    /* Total Score (100%): quiz1*.10 + quiz2*.10 + quiz3*.10 + quiz4*.10 +
                    mid1*.20 + mid2*.15 + final*.25
        Determination of grade: >=90% = A, 80-89% = B, 70-79% = C, 60-69% = D, <=59% = F
    */

public class LetterGrader {

    // Gets the exact path: System.out.println(new File("input.txt").getAbsolutePath());



    public int readScore () {
        try {
            Scanner diskScanner = new Scanner(new File("input.txt"));
            while (diskScanner.hasNextLine()) {
                System.out.println(diskScanner.nextLine());
            }
            diskScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }



    public static void displayAllAverages() throws FileNotFoundException {

        // Format the scores
        DecimalFormat df = new DecimalFormat("###.#");
        df.setRoundingMode(RoundingMode.HALF_UP);

        ArrayList<Double> studentAverages = new ArrayList<Double>();


            Scanner scanner = new Scanner(new File("input.txt"));

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] values = line.split(", ");


                // Converts String Array into Double Array
                double [] scoresPerPerson = new double[values.length];

                for (int i = 1; i < values.length; i++) {
                    scoresPerPerson[i] = Double.parseDouble(values[i]);
                }

                // Find the sum, and then find the average; add it to an arrayList
                double sum = 0.0;

                for (double i : scoresPerPerson) {
                    sum += i;
                }


                double average = sum / values.length;

                studentAverages.add(average);

            }
        scanner.close();




        // Compute the average and get the maximum scores and minimum scores.

        double max = 0;
        double min = 100;
        double computeAverage = 0;

        for (double average : studentAverages) {
            if (average > max) {
                max = average;
            }
            if (average < min) {
                min = average;
            }
            computeAverage += average;
        }

        computeAverage /= studentAverages.size();

        System.out.println();
        System.out.println("High : " + df.format(max));
        System.out.println("Low : " + df.format(min));
        System.out.println("Average : " + df.format(computeAverage));


        System.out.println("****************");


    }
}




























