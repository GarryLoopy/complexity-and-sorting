package complexityandsorting.drivers;

import complexityandsorting.utilities.Shape;

import java.util.Comparator;

/**
 *
 * @author garry
 */
public class ShapeBaseAreaCompare implements Comparator<Shape>{
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
