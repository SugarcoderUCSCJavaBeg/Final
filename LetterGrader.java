import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LetterGrader {
    /* Total Score (100%): quiz1*.10 + quiz2*.10 + quiz3*.10 + quiz4*.10 +
                    mid1*.20 + mid2*.15 + final*.25
        Determination of grade: >=90% = A, 80-89% = B, 70-79% = C, 60-69% = D, <=59% = F
    */

    private static String fileName = "input_data";


    public static void main(String[] args) throws IOException {
        // Scanner scannerName = new Scanner(new File("input_data.txt"));



        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));


        // Finds out where the path is: System.out.println(new File("input_data").getAbsoluteFile());


//        try {
//            StringBuilder sb = new StringBuilder();
//            String line = bufferedReader.readLine();
//
//            while (line != null) {
//                sb.append(line);
//                sb.append(System.lineSeparator());
//                line = bufferedReader.readLine();
//            }
//            String everything = sb.toString();
//        } finally {
//            bufferedReader.close();
//        }
//
//    }


//    public static void readScore() {
//
//    }


    }
}
