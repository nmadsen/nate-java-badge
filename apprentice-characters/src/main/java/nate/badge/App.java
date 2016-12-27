package nate.badge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    maxNumberOfChars();
  }

  private static void maxNumberOfChars() {
    int i = 0;
    StringBuilder stringBuilder = new StringBuilder();
    while (i < Integer.MAX_VALUE) {
      try {
        stringBuilder.append('a');
      } catch (OutOfMemoryError e) {
        LOGGER.info(String.valueOf("number of characters in stringbuilder: " + i));
        break;
      }
      i++;
    }
  }
}