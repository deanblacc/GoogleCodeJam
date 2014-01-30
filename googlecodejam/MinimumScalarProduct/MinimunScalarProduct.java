package MinimumScalarProduct;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MinimunScalarProduct {
    public static void main(String[] args) {
        final String home = "/Users/Dean/Documents/workspace/Intel/GCJ/googlecodejam/";
        final String input = home + "MinimumScalarProduct/io/A-large-practice.in";
        final String output = home + "MinimumScalarProduct/io/A-large-practice.out";

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

        int n = Integer.valueOf(sc.nextLine());
        String[] xAsStr = sc.nextLine().split(" ");
        String[] yAsStr = sc.nextLine().split(" ");

        long[] x = new long[n];
        long[] y = new long[n];

        for(int i = 0; i < n; i++) {
            x[i] = Long.valueOf(xAsStr[i]);
            y[i] = Long.valueOf(yAsStr[i]);
        }

        Arrays.sort(x);
        Arrays.sort(y);

        long min = 0;

        for(int j = 0; j < n; j++) {
            min += x[j]*y[n - 1 - j];
        }

        return "" + min;
    }
}
