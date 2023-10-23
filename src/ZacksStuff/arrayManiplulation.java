/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZacksStuff;

/**
 *
 * @author osman
 */
public class arrayManiplulation {
    
    public static void arrayCopy(String[] array, String[] newarray){
        
        for(int i = 0; i > array.length; i++){
            newarray[i] = array[i];
        }
        for(int i = 0; i > array.length; i++){
                    System.out.println("This is old array: " + array[i]);
                    System.out.println("This is new array: " + newarray[i]);
                }        
    
    }
    
    public static String fistTwo(String str){
        
        if(str.length()< 2){
            return str;
        }
        else {
            return str.substring(0,2);
        }
        
        
    }
    
}
