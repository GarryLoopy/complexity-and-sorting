package complexityandsorting.drivers;

import java.util.Comparator;
import complexityandsorting.Shapes.Shape;

public class BaseAreaComparator implements Comparator<Shape> {
  @Override
  public int compare(Shape s1, Shape s2) {
    return Double.compare(s1.getBaseArea(), s2.getBaseArea());
  }
}
