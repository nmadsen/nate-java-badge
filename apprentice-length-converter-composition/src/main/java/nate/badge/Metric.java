package nate.badge;

/**
 * Created by roondog on 7/29/16.
 */
public class Metric {

  private double kilometers;
  private double meters;

  public Metric() {
    kilometers = 0;
    meters = 0;
  }

  public Metric(double kilometers, double meters) {
    this.kilometers = kilometers;
    this.meters = meters;
  }

  public double metersToFeetComposition() {
    return this.meters * 3.2808;
  }

  public double kilometersToMilesComposition() {
    return this.kilometers * 0.62137;
  }
}
