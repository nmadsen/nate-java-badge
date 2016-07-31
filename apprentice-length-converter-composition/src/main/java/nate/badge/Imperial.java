package nate.badge;

/**
 * Created by roondog on 7/29/16.
 */
public abstract class Imperial {

  private double miles;
  protected double feet;
  protected int numberOfEggs;
  private boolean isTall;
  private char letterGrade;

  public Imperial() {
    miles = 0;
    feet = 0;
  }

  public Imperial(double miles, double feet, int numberOfEggs, boolean isTall, char letterGrade) {
    this.miles = miles;
    this.feet = feet;
    this.numberOfEggs = numberOfEggs;
    this.isTall = isTall;
    this.letterGrade = letterGrade;
  }

  public Imperial(double miles) {
    this(miles, Distance.MILE.getDistance(), 12, false, 'A');
  }

  public Imperial(int numberOfEggs) {
    this(Distance.MARATHON.getDistance(), Distance.MILE.getDistance(), numberOfEggs, false, 'A');
  }

  public Imperial(boolean isTall) {
    this(Distance.MARATHON.getDistance(), Distance.MILE.getDistance(), 12, isTall, 'A');
  }

  public Imperial(char letterGrade) {
    this(Distance.MARATHON.getDistance(), Distance.MILE.getDistance(), 12, false, letterGrade);
  }

  public Imperial(double miles, double feet) {
    this.miles = miles;
    this.feet = feet;
  }

  public double milesToKilometersInheritance() {
    return this.miles / 0.62137;
  }

  public int getNumberOfEggs() {
    return numberOfEggs;
  }
}
