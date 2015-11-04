import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;


public class displayAssnAverages {

        public static void main(String[] args) throws IOException {

            BufferedReader bf = new BufferedReader(new FileReader("input.txt"));

            boolean status = bf.ready();

            String nextLine = " ";

            while (status) {
                nextLine = bf.readLine();
                StringTokenizer st = new StringTokenizer(nextLine, ", ");

                int sizeTokens = st.countTokens();
                String [] tokens = new String[sizeTokens];


                while (st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                }

                System.out.println(" ");
                status = bf.ready();


                int studentGrade = sizeTokens / 7;

                System.out.println(studentGrade);

            }

            // int T = Integer.parseInt(" ");

            // System.out.println(" ");





        }





}






/*        // Format the scores
        DecimalFormat df = new DecimalFormat("###.#");
        df.setRoundingMode(RoundingMode.HALF_UP);*/

        // ArrayList<Double> Q1Sum = new ArrayList<Double>();

/*        Scanner scanner = new Scanner(new File("input.txt"));

        // BufferedReader bf = new BufferedReader(new FileReader(new File("input.txt")));

        String delims = ", ";

        StringTokenizer strToken = new StringTokenizer(delims);


        while (strToken.hasMoreElements()) {
            System.out.println("StringTokenizer: " + strToken.nextElement());
        }


        String nextToken = strToken.nextToken();

        while (nextToken != strToken.TT_WORD) {

        }*/


        /*while (scanner.hasNext()) {

            // if the next is a int, print found and the int
            if (scanner.hasNextInt()) {
                System.out.println("Is number :" + scanner.nextInt());
            }
            // if no int is found, print "Not Found:" and the token
            System.out.println("Not number :" + scanner.next());
        }

        scanner.close(); */


        // Converts String Array into Double Array
    /*    while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] values = line.split(", ");

            double[] StudentScores = new double[values.length];


            for (int x = 1; x < values.length; x++) {
                StudentScores[x] = Double.parseDouble(values[x]);
            }

            // System.out.println(StudentScores[1]);


        }*/






/*            while (scanner.hasNextDouble()) {
                Double line1 = scanner.nextDouble();
                Double [] Q1values = line1.split(", ");

                double [] Q1total = new double[Q1values.length];


            }
            scanner.close();*/



         /*   double Q1sum = 0;

            for(int x = 1; x < values.length; x++) {
                StudentScores[x] = Double.parseDouble(values[x]);
                Q1sum += StudentScores[x];
            }*/





            /*int sum = IntStream.of(values.length).sum();
            System.out.println(sum);*/



       /*     double addv = 0;

            for (int i = 1; i < 8; i++) {
                addv += StudentScores[i][1];
            }

            System.out.println(addv);*/













