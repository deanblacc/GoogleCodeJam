package AlienLanguage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class AlienLanguage {
    public static void main(String[] args) {
        final String home = "/Users/Dean/Documents/workspace/Intel/GCJ/googlecodejam/";
        final String input = home + "AlienLanguage/io/A-large-practice.in";
        final String output = home + "AlienLanguage/io/A-large-practice.out";

        try {
            Scanner sc = new Scanner(new FileReader(input));
            PrintWriter pw = new PrintWriter(output);

            String[] vals = sc.nextLine().split(" ");

            int l = Integer.valueOf(vals[0]), d = Integer.valueOf(vals[1]), n = Integer.valueOf(vals[2]);
            Set<String> dict = new HashSet<>();

            for(int i = 0; i < d; i++) {
                dict.add(sc.nextLine());
            }

            for(int j = 0; j < n; j++) {
                char[] line = sc.nextLine().toCharArray();
                StringBuffer sb = new StringBuffer();
                sb.append('^');
                for(char c : line) {
                    if(c == '(') sb.append('[');
                    else if(c == ')') sb.append(']');
                    else sb.append(c);
                }
                sb.append('$');

                int matches = 0;

                Pattern pattern = Pattern.compile(sb.toString());

                for(String s : dict) {
                    if(pattern.matcher(s).matches()) matches++;
                }

                pw.write("Case #" + (j+1) + ": " + matches + "\n");
            }

            pw.flush();
            pw.close();
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
