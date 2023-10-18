/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers.sort;

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
        double baseArea1 = shape1.calculateVolume();
        double baseArea2 = shape2.calculateVolume();
        
        if (baseArea1 > baseArea2)
            return 1;
        else if (baseArea1 < baseArea2)
            return -1;
        else
            return 0;
    }
}
