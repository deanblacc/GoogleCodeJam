package ReverseWords;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        final String home = "/Users/Dean/Documents/workspace/Intel/GCJ/googlecodejam/";
        final String input = home + "ReverseWords/io/A-small-practice.in";
        final String output = home + "ReverseWords/io/A-small-practice.out";

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

    private static String runCase(Scanner sc) {
        String[] words = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length/2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        for(int j = 0; j < words.length; j++){
            sb.append(words[j]);
            sb.append(j < words.length - 1 ? " " : "");
        }

        return sb.toString();
    }
}
