package nate.badge;

/**
 * Created by roondog on 7/29/16.
 */
public class ImperialSubClass extends Imperial {
  public ImperialSubClass(double m, double f) {
    super(m,f);
  }

  public double feetToMeters(double feet) {
    return feet / 3.2808;
  }
}
