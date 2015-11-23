import java.io.*;
import java.util.Scanner;

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




























