package complexityandsorting.drivers;

import complexityandsorting.utilities.Shape;
import java.util.Comparator;

/**
 * Represents a comparator for volume
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class ShapeVolumeCompare implements Comparator<Shape>{
    
    /**
     * Compares two shapes together via volume
     * @param shape1 the first shape to compare
     * @param shape2 the second shape to compare
     * @return 1 if the first shapes volume is greater than the second, -1 if the first shapes volume is less than the second, 
     * or 0 is they are both equal in volume
     */
    @Override
    public int compare(Shape shape1, Shape shape2)
    {
        double baseVolume1 = shape1.getVolume();
        double baseVolume2 = shape2.getVolume();
        
        if (baseVolume1 > baseVolume2)
            return 1;
        else if (baseVolume1 < baseVolume2)
            return -1;
        else
            return 0;
    }
}
