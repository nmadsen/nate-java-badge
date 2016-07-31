package nate.badge;

/**
 * Created by roondog on 7/30/16.
 */
public enum Distance {
  MARATHON(26.2),
  HALF_MARATHON(13.1),
  MILE(5280),
  TEN_K(10000),
  FIVE_K(5000),
  FOUR_HUNDRED_METER(400);

  private final double distance;

  Distance(double distance) {
    this.distance = distance;
  }

  public double getDistance() {
    return distance;
  }
}
