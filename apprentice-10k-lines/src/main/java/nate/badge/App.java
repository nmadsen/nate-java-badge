package nate.badge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader("10k_lines.txt"));
        ArrayList lines = new ArrayList(10000);
        for(String line = reader.readLine(); line != null; line = reader.readLine()) {
            lines.add(line);
        }
        reader.close();
        Collections.sort(lines);
        System.out.print("done sorting");
        //Collections.reverse(lines); // uncomment for reverse

        FileWriter writer = new FileWriter("10k_lines_sorted.txt"); // comment for reverse
        //FileWriter writer = new FileWriter("10k_lines_sorted_reverse.txt"); // uncomment for reverse
        for(Object line : lines) {
            writer.append(line.toString() + "\n");
        }
        writer.close();
    }
}
