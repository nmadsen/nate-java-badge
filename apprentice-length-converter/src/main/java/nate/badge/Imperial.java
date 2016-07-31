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
    this(miles, 5280, 12, false, 'A');
  }

  public Imperial(int numberOfEggs) {
    this(26.2, 5280, numberOfEggs, false, 'A');
  }

  public Imperial(boolean isTall) {
    this(26.2, 5280, 12, isTall, 'A');
  }

  public Imperial(char letterGrade) {
    this(26.2, 5280, 12, false, letterGrade);
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
