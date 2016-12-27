package nate.badge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    LineSorter lineSorter = new LineSorter(false);
    lineSorter.sortFile("10k_lines.txt", "10k_lines_sorted.txt");

    LineSorter2 lineSorterReverse = new LineSorter2(true);
    lineSorterReverse.sortFile("10k_lines.txt", "10k_lines_sorted_reverse.txt");

  }

  public static void writeToFile(String outputFile, ArrayList<String> lines) {
    try(FileWriter writer = new FileWriter(outputFile)) { // comment for reverse
      for (Object line : lines) {
        writer.append(line.toString() + "\n");
      }
    } catch (IOException e) {
      LOGGER.error("IOException trying to write to file", e);
    }
  }
}

// composition: FancyReader.readFile()
// inheritance: Sorter.reverseOrderIfNeeded()
//      static: App.writeToFile()
