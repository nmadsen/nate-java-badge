package nate.badge;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    //Reader reader = new Reader();

    System.out.println(feetToMeters(5280));
    System.out.println(metersToFeet(400));
    System.out.println(kilometersToMiles(100));
    System.out.println(milesToKilometers(60));

  }

  private static double metersToFeet(double meters) {
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
