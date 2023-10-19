package complexityandsorting.drivers;

import complexityandsorting.utilities.Shape;
import java.util.Comparator;

/**
 *
 * @author Garry Jr Dayag
 */
public class ShapeVolumeCompare implements Comparator<Shape>{
    
    @Override
    public int compare(Shape shape1, Shape shape2)
    {
        double baseVolume1 = shape1.calculateVolume();
        double baseVolume2 = shape2.calculateVolume();
        
        if (baseVolume1 > baseVolume2)
            return 1;
        else if (baseVolume1 < baseVolume2)
            return -1;
        else
            return 0;
    }
}
