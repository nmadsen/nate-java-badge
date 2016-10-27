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
    double kilometers = 0;
    double feet = 0;
    double miles = 0;
    metric = new Metric(Distance.MARATHON.getDistance(), Distance.HALF_MARATHON.getDistance());
    ImperialSubClass imperial = new ImperialSubClass(Distance.MARATHON.getDistance(), Distance.HALF_MARATHON.getDistance());

    if (imperial instanceof Imperial) {
      System.out.println("yes");
    }
    else {
      System.out.println("no");
    }

    kilometers = imperial.milesToKilometersInheritance(); // TODO: rework all of this
    feet = metric.metersToFeetComposition();
    miles = feetToMetersStatic(Distance.MILE.getDistance());


    // casting
    ImperialSubSubClass imperial1 = new ImperialSubSubClass();
    ImperialSubClass imperial2 =  (ImperialSubClass)imperial1;

    //show virtual method invocation
    ImperialSubClass imperialSubSubClass = new ImperialSubSubClass();
    imperialSubSubClass.subMethod();

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
