import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws IOException {
        {
            Random rand = new Random();
            int[] tab_p = new int[256];
            for (int i_p = 0; i_p < tab_p.length; i_p++) {
                tab_p[i_p] = rand.nextInt((256));
            }
            for (int i_p = 0; i_p < 256; i_p++) {
                out.println("Wartośś znaku: [index początkowy] [" + i_p + "] = " + tab_p[i_p]);
            }

            System.out.println("***********************************************************************");


            int[] tab_w = new int[256];
            for (int i_w = 0; i_w < tab_w.length; i_w++) {
                tab_w[i_w] = rand.nextInt((256));
            }
            for (int i_w = 0; i_w < 10; i_w++) {
                out.println("Wartośś znaku: [index weryfikacji]  [" + i_w + "] = " + tab_w[i_w]);
            }

            System.out.println("TEST nr 1");
            String s = "Z";
            BigInteger zam_test;
            zam_test = new BigInteger(s.getBytes());
            System.out.println("Test zamiany znaku [" + s + "]: "  + zam_test + " z wykazu liczb losowanych.");


            String q = s;
            BigInteger bi = new BigInteger(q.getBytes());
            System.out.println(bi);
            String w = q.toString();
            System.out.println(w);








        }
    }
}