package nate.badge;

/**
 * Created by roondog on 7/29/16.
 */
public abstract class Imperial {

  private double miles;
  protected double feet;
  protected int numberOfEggs;
  private boolean isTall;

  public Imperial(double miles, double feet, int numberOfEggs, boolean isTall) {
    this.miles = miles;
    this.feet = feet;
    this.numberOfEggs = numberOfEggs;
    this.isTall = isTall;
  }

  public Imperial(double miles, double feet, int numberOfEggs) {
    this(miles, feet, numberOfEggs, false);
  }

  public Imperial(double miles, double feet) {
    this(miles, feet, 12);
  }

  public Imperial(double miles) {
    this(miles, Distance.MILE.getDistance());
  }

  public double milesToKilometersInheritance() {
    return this.miles / 0.62137;
  }
}
