import java.io.*;

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
                System.out.println("****************************\n");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return 0;
        }




    public long calcLetterGrade() throws NumberFormatException, IOException {

        Scanner calcScanner = new Scanner(new File("input.txt"));
        ArrayList<Double> averages = new ArrayList<>();

        double max = 0, min = 100;

        while(calcScanner.hasNextLine()) {

            String line = calcScanner.nextLine();
            String[] score = line.split(",");


            double[] points = new double[score.length - 1];

            for (int i = 1; i < score.length; i++) {
                points[i - 1] = Double.parseDouble(score[i]);
            }

            double sumNum = 0.0;

            for (double i : points) {
                sumNum += i;
                min = Math.min(min, i);
                max = Math.max(max, i);
            }

            double avg = sumNum / 10;


            System.out.println(avg);
        }

        calcScanner.close();
        double avgSum = .0;

        for (double avg : averages) {
            avgSum += avg;
        }
        System.out.println("Maximum: " + max + "");
        System.out.println("Minimum: " + min + "");
        System.out.println("Average: " + avgSum / averages.size() + " ");




        return 0;
    }
}











