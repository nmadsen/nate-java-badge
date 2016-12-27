package nate.badge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Nathan Madsen (nmadsen@familysearch.org) on 12/22/16.
 */
public class FancyReader {
  protected static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  private ArrayList lines;
  private String filename;

  public FancyReader(String filename) {
    this.filename = filename;
    lines = new ArrayList(10000);
  }

  public ArrayList readFile() {
    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
      for (String line = reader.readLine(); line != null; line = reader.readLine()) {
        lines.add(line);
      }
    } catch (IOException e) {
      LOGGER.error("IOException trying to read from file", e);
    }
    return lines;
  }
}
