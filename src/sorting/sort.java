/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

import comparator.baseAreaComparator;
import comparator.volumeComparator;
import complexityandsorting.drivers.Shape;
import static swap.swap.swap;

/**
 *
 * @author osman
 */
public class sort {
    
    //bubble sort
    public static void bubbleSortHeight(Shape[] array){
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (array[j].compareTo(array[j+1]) == 1){
                    swap(array, j, j+1);
                }
            }
        }
        
    }
    public static void bubbleSortBA(Shape[] array){
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (new baseAreaComparator().compare(array[j], array[j+1]) == 1){
                    swap(array, j, j+1);
                }
            }
        }
        
    }
    public static void bubbleSortV(Shape[] array){
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (new volumeComparator().compare(array[j], array[j+1]) == 1){
                    swap(array, j, j+1);
                }
            }
        }
        
    }
    
}
