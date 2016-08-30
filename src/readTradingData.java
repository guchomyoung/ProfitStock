/**
 * Created by Naver on 2016. 8. 18..
 */
import java.io.*;

public class readTradingData {
    public static void main (String args[] ) throws IOException {
        String fname = "/Users/Naver/Downloads/stock-cell.txt";
        FileInputStream fis = new FileInputStream( fname);
        int data = 0;
        while ((data = fis.read()) !=-1 ) {
            char c = (char) data;
            System.out.print(c);
        }
    }
}


/*
    String originalStr = "Å×½ºÆ®"; // 테스트
    String [] charSet = {"utf-8","euc-kr","ksc5601","iso-8859-1","x-windows-949"};

for (int i=0; i<charSet.length; i++) {
        for (int j=0; j<charSet.length; j++) {
        try {
        System.out.println("[" + charSet[i] +"," + charSet[j] +"] = " + new String(originalStr.getBytes(charSet[i]), charSet[j]));
        } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
        }
        }
        }
*/