package complexityandsorting.drivers;

import java.util.Comparator;
import complexityandsorting.utilities.Shape;

public class ShapeBaseAreaCompare implements Comparator<Shape> {
  @Override
  public int compare(Shape shape1, Shape shape2) {
    double baseArea1 = shape1.calculateBaseArea();
    double baseArea2 = shape2.calculateBaseArea();

    if (baseArea1 > baseArea2)
      return 1;
    else if (baseArea1 < baseArea2)
      return -1;
    else
      return 0;
  }
}
