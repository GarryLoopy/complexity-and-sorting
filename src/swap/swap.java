/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swap;

import complexityandsorting.drivers.Shape;
import java.util.List;

/**
 *
 * @author osman
 */
public class swap {
    
    public static void swap(Shape[] array, int i, int j){
        Shape temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
}
