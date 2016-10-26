package nate.badge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by roondog on 7/30/16.
 */
public class BadEncapsulation {
  private static final Logger LOGGER = LoggerFactory.getLogger(BadEncapsulation.class);

  public int numerator;
  public int denominator;

  BadEncapsulation(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }
}
