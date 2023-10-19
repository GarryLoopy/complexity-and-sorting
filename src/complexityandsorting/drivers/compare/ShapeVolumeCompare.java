/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers.compare;

import complexityandsorting.drivers.Shape;


import java.util.Comparator;

/**
 *
 * @author garry
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
