package nate.badge;

/**
 * Hello world!
 */
public class App {
  static final double MARATHON = 42.16481;
  static final double HALF_MAARATHON = 21.08241;

  static Metric metric;

  public static void main(String[] args) {
    //ConversionTwo reader = new ConversionTwo();
    double kilometers = 0;
    double feet = 0;
    metric = new Metric(MARATHON, HALF_MAARATHON);
    Imperial imperial = new ImperialSubClass(MARATHON, HALF_MAARATHON);

    kilometers = imperial.milesToKilometersInheritance();
    feet = metric.metersToFeetComposition();



//    System.out.println(feetToMeters(5280));
//    System.out.println(metersToFeetStatic(400));
//    System.out.println(kilometersToMiles(100));
//    System.out.println(milesToKilometers(60));

  }

  private static double metersToFeetStatic(double meters) {
    return meters * 3.2808;
  }

  private static double feetToMeters(double feet) {
    return feet / 3.2808;
  }

  private static double kilometersToMiles(double kilometers) {
    return kilometers * 0.62137;
  }

  private static double milesToKilometers(double miles) {
    return miles / 0.62137;
  }
}
