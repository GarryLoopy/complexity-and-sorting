package complexityandsorting.drivers;

import complexityandsorting.utilities.Shape;

import java.util.Comparator;

/**
 * Represents a comparator for
 * @author garry
 */
public class ShapeBaseAreaCompare implements Comparator<Shape>{

    /**
     * Compares two shapes together via base area
     * @param shape1 The first shape to compare
     * @param shape2 The second shape to compare to
     * @return 1 if the first shapes base area is greater than the second shape, -1 is the base area is less or 0 if the areas are equal to each other
     */
    @Override
    public int compare(Shape shape1, Shape shape2)
    {
        if (shape1.getBaseArea() > shape2.getBaseArea())
            return 1;
        else if (shape1.getBaseArea() < shape2.getBaseArea())
            return -1;
        else
            return 0;
    }
}
