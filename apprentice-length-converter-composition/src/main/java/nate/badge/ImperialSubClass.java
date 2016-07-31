package nate.badge;

/**
 * Created by roondog on 7/29/16.
 */
public class ImperialSubClass extends Imperial {
  public ImperialSubClass(double miles, double feet) {
    super(miles,feet);
  }

  public double feetToMeters() {
    return this.feet / 3.2808;
  }

  @Override
  public int getNumberOfEggs() {
    return numberOfEggs - 1;
  }
}
