package nate.badge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by roondog on 7/30/16.
 */
public class GoodEncapsulation {
  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  private int numerator;
  private int denominator;


  GoodEncapsulation(int numerator, int denominator) {
    this.numerator = numerator;
    try {
      if (denominator == 0) {
        throw new IllegalArgumentException();
      }
      this.denominator = denominator;
    } catch (IllegalArgumentException e) {
      LOGGER.warn("trying to set denominator to 0. variable set to default value of 1.", e);
    }
  }

  public int getDenominator() {
    return denominator;
  }

  public void setDenominator(int denominator) {
    // we can not allow 0 as a denominator

    try {
      if (denominator == 0) {
        throw new IllegalArgumentException();
      }
      this.denominator = denominator;
    } catch (IllegalArgumentException e) {
      LOGGER.debug("trying to set denominator to 0. variable not changed.", e);
    }
  }

  public int getNumerator() {
    return numerator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }
}
