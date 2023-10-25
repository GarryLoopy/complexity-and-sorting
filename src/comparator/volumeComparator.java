/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparator;

import complexityandsorting.drivers.Shape;
import java.util.Comparator;

/**
 *
 * @author osman
 */
public class volumeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        if(o1.calculateVolume() > o1.calculateVolume()){
            return 1;
        }
        else if (o1.calculateVolume() < o1.calculateVolume()){
            return -1;
        }
        else return 0;
    }
    
}
