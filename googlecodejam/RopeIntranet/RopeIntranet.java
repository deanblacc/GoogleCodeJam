package RopeIntranet;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RopeIntranet {
    public static void main(String[] args) {
        final String home = "/Users/Dean/Documents/workspace/Intel/GCJ/googlecodejam/";
        final String input = home + "RopeIntranet/io/A-large-practice.in";
        final String output = home + "RopeIntranet/io/A-large-practice.out";

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

        Set<Wire> pW = new HashSet<>(n);
        int intersect = 0;

        for(int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(" ");

            Wire w = new Wire(Integer.valueOf(data[0]), Integer.valueOf(data[1]));

            for(Wire wi : pW) {
                if((w.l < wi.l && w.r > wi.r) || (w.l > wi.l && w.r < wi.r)) {
                    intersect++;
                }
            }
            pW.add(w);
        }

        return "" + intersect;
    }
}

class Wire {
    int r, l;

    public Wire(int l, int r) {
        this.l = l;
        this.r = r;
    }
}
