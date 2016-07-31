package nate.badge;

/**
 * Hello world!
 */
public class App {
  static final double MARATHON = 42.16481;
  static final double HALF_MAARATHON = 21.08241;
  static final double MILE = 5280;

  static Metric metric;

  public static void main(String[] args) {
    //ConversionTwo reader = new ConversionTwo();
    double kilometers = 0;
    double feet = 0;
    double miles = 0;
    metric = new Metric(MARATHON, HALF_MAARATHON);
    ImperialSubClass imperial = new ImperialSubClass(MARATHON, HALF_MAARATHON);

    if (imperial instanceof Imperial) {
      System.out.println("yes");
    }
    else {
      System.out.println("no");
    }

    // why this one?
    kilometers = imperial.milesToKilometersInheritance();
    // why this one?
    feet = metric.metersToFeetComposition();
    // why this one?
    miles = feetToMetersStatic(MILE);
  }

  public static double metersToFeetStatic(double meters) {
    return meters * 3.2808;
  }

  public static double feetToMetersStatic(double feet) {
    return feet / 3.2808;
  }

  public static double kilometersToMilesStatic(double kilometers) {
    return kilometers * 0.62137;
  }

  public static double milesToKilometersStatic(double miles) {
    return miles / 0.62137;
  }
}
