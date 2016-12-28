package nate.badge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


/**
 * @author Nathan Madsen (nmadsen@familysearch.org) on 12/28/16.
 */
public class SorterTest {
  Sorter sorter = new Sorter(true);

  @Before
  public void setup() {
    sorter.lines = new ArrayList<>(4);
    sorter.lines.add("d");
    sorter.lines.add("o");
    sorter.lines.add("o");
    sorter.lines.add("f");
  }
  @Test
  public void reverseOrderIfNeededTest() {
    sorter.reverseOrderIfNeeded();
    ArrayList expected = new ArrayList(4);
    expected.add("f");
    expected.add("o");
    expected.add("o");
    expected.add("d");
    Assert.assertEquals(expected, sorter.lines);
  }
}
