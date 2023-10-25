/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swap;

/**
 *
 * @author osman
 */
public class swap {
    
    public static void swap(int[] array, int i, int j){
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
}
