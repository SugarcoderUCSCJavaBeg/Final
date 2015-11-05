import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testAvg {

    public static void main(String[] args) throws IOException {

        String token1 = " ";

        Scanner inFile1 = new Scanner(new File("input.txt")).useDelimiter(",\\s*");


        List<String> temps = new ArrayList<String>();

        while (inFile1.hasNext()) {
            // find next line
            token1 = inFile1.next();
            temps.add(token1);
        }
        inFile1.close();

        String[] tempsArray = temps.toArray(new String[0]);

        for (String s : tempsArray) {
            System.out.println(s);
        }

    }


}
