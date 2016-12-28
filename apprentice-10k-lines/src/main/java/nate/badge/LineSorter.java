package nate.badge;

import java.util.Collections;

import static nate.badge.App.writeToFile;

/**
 * @author Nathan Madsen (nmadsen@familysearch.org) on 12/12/16.
 */
public class LineSorter extends Sorter{

  public LineSorter(boolean reverse) {
    super(reverse);
  }

  public void sortFile(String inputFile, String outputFile) {
    fancyReader = new FancyReader(inputFile);
    lines = fancyReader.readFile();
    Collections.sort(lines);
    LOGGER.info("done sorting");
    reverseOrderIfNeeded();
    writeToFile(outputFile, lines);
  }
}
