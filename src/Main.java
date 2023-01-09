import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        int[] tab = new int[256];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt((256));
        }
        for (int i = 0; i < 256; i++) {
            System.out.println("Wartośś znaku: [" + i + "] = " + tab[i]);
        }
    }
}