package nate.badge;

import java.util.Collections;

import static nate.badge.App.writeToFile;

/**
 * @author Nathan Madsen (nmadsen@familysearch.org) on 12/22/16.
 */
public class LineSorter2 extends Sorter{

  public LineSorter2(boolean reverse) {
    super(reverse);
  }

  public void sortFile(String inputFile, String outputFile) {
    fancyReader = new FancyReader(inputFile);
    lines = fancyReader.readFile();
    Collections.sort(lines);
    LOGGER.info("done with sorting");
    reverseOrderIfNeeded();
    writeToFile(outputFile, lines);
  }
}
