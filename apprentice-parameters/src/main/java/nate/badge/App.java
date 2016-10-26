package nate.badge;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    double x = 6.5;
    Person person = new Person("Nate", "Madsen");
    Person person2 = new Person("Michael", "Madsen");
    int y = 7;

    System.out.println(x);
    System.out.println(person);
    System.out.println(person2);
    System.out.println(y);
    System.out.println();

    changeValues(x, person, person2, y);

    System.out.println(x);
    System.out.println(person);
    System.out.println(person2);
    System.out.println(y);

    // casting

  }

  private static void changeValues(double a, Person b, final Person c, final int d) {
    a = 4.5;
    b.setFirstName("Roon");
    c.setLastName("Pillow");
    // d = 9;  // doesn't compile with this line (can't edit a final)
  }
}
