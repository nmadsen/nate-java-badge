package nate.badge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Nathan Madsen (nmadsen@familysearch.org) on 12/22/16.
 */
public class Sorter {

  private boolean reverse;
  protected FancyReader fancyReader;
  protected static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  protected ArrayList<String> lines;

  public Sorter(boolean reverse) {
    this.reverse = reverse;
  }

  protected void reverseOrderIfNeeded() {
    if (reverse) {
      Collections.reverse(lines);
      LOGGER.info("order reversed");
    }
  }
}
