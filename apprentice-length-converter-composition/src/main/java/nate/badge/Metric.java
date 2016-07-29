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

  public Metric(double k, double m) {
    kilometers = k;
    meters = m;
  }

  public double metersToFeetComposition() {
    return meters * 3.2808;
  }

  public double kilometersToMilesComposition() {
    return kilometers * 0.62137;
  }

}
