import java.io.*;
import java.util.ArrayList;

public class Writer {

    public static void writeToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Letter grade for 6 students given in output.txt file is:\n");
        writer.newLine();
        writer.newLine();
        writer.write("Bob Marley: " + calculateGrade(93.1));
        writer.newLine();
        writer.write("Clark Kent: " + calculateGrade(85.7));
        writer.newLine();
        writer.write("Lois Lane: " + calculateGrade(76.8));
        writer.newLine();
        writer.write("Marie Calendar: " + calculateGrade(88.55));
        writer.newLine();
        writer.write("Sandra Dee: " + calculateGrade(97.60));
        writer.newLine();
        writer.write("Tom Brady: " + calculateGrade(93.75));
        writer.newLine();
        writer.close();
    }


    public static String calculateGrade(double average) {

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }




    public Writer() throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader bf = null;
        bf = new BufferedReader(new FileReader("input.txt"));

        while ((true)) {
            String line = null;
            try {
                line = bf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line == null) {
                break;
            }
            try {
                list.add(Integer.parseInt((line)));
            } catch (Exception e) {
            }

            String[] columns = line.split(",\\s*");

            int quiz1 = Integer.parseInt(columns[1]);
            int quiz2 = Integer.parseInt(columns[2]);
            int quiz3 = Integer.parseInt(columns[3]);
            int quiz4 = Integer.parseInt(columns[4]);
            int mid1 = Integer.parseInt(columns[5]);
            int mid2 = Integer.parseInt(columns[6]);
            int final1 = Integer.parseInt(columns[7]);


            double finalGrade = (quiz1 *.10) + (quiz2 *.10) + (quiz3*.10) + (quiz4*.10) + (mid1*.20) + (mid2*.15) + (final1*.25);

            // System.out.println(finalGrade);        This will print out the final grade of each student.

        }

        try {
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
