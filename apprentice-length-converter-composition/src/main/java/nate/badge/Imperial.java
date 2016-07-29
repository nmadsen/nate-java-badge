package nate.badge;

/**
 * Created by roondog on 7/29/16.
 */
public abstract class Imperial {

  private double miles;
  private double feet;

  public Imperial() {
    miles = 0;
    feet = 0;
  }

  public Imperial(double m, double f) {
    miles = m;
    feet = f;
  }

  public double milesToKilometersInheritance() {
    return miles / 0.62137;
  }

}
