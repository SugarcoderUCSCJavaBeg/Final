import java.io.*;
import java.util.Scanner;

    /* Total Score (100%): quiz1*.10 + quiz2*.10 + quiz3*.10 + quiz4*.10 +
                    mid1*.20 + mid2*.15 + final*.25
        Determination of grade: >=90% = A, 80-89% = B, 70-79% = C, 60-69% = D, <=59% = F
    */

public class Reader {

    // Gets the exact path: System.out.println(new File("input.txt").getAbsolutePath());

    public static int readScore() {
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

}




























