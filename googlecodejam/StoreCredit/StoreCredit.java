package StoreCredit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class StoreCredit {
    public static void main(String[] args) {
        final String home = "/Users/Dean/Documents/workspace/Intel/GCJ/googlecodejam/";
        final String input = home + "StoreCredit/io/A-large-practice.in";
        final String output = home + "StoreCredit/io/A-large-practice.out";

        try {
            Scanner sc = new Scanner(new FileReader(input));
            PrintWriter pw = new PrintWriter(output);

            int testCases = Integer.valueOf(sc.nextLine());

            for(int i = 0; i < testCases; i++) {
                pw.print("Case #" + (i+1) + ": " + runCase(sc) + "\n");
            }
            pw.flush();
            pw.close();
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String runCase(Scanner sc) {
        int credit = Integer.valueOf(sc.nextLine());
        int nItems = Integer.valueOf(sc.nextLine());

        int[] items = new int[nItems];

        String[] vItems = sc.nextLine().split(" ");

        for(int i = 0; i < nItems; i++) {
            items[i] = Integer.valueOf(vItems[i]);
        }
        int i, j = 0;
        boolean broken = false;

        for(i = 0; i < nItems; i++) {
            for(j = i+1; j < nItems; j++) {
                if(items[i] + items[j] == credit) {
                    broken = true;
                    break;
                }
            }
            if(broken) break;
        }

        return "" + (i+1) + " " + (j+1);
    }
}
