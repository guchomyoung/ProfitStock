/**
 * Created by Naver on 2016. 8. 27..
 */

import java.io.*;
import java.util.StringTokenizer;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("data/stock-cell2.txt");
            FileReader fileReader = new FileReader(myFile);

            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            int i = 0;



            while ((line = reader.readLine()) != null) {

                System.out.println("["+line+"]");
/*
                StringTokenizer parser = new StringTokenizer(line,"\t");

                while(parser.hasMoreTokens()) {
                    System.out.println(parser.nextToken());

                }
 */
            }

            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
