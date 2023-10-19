/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZacksStuff;

import java.util.Arrays;

/**
 *
 * @author osman
 */
public class binarySearchString {
    
    
    public static int binSearch(String[] arr, String target){

        int l = 0;
        int r = arr.length -1;
        
        while (l <= r){
            int m = l + (r-l)/2;
            if (Arrays.asList(arr).indexOf(target) == m){
                return m;
            }
            else if (Arrays.asList(arr).indexOf(target) > m ){
                l = m + 1;
            }
            else if (Arrays.asList(arr).indexOf(target) < m){
                r = m - 1;
            }
        }
        return -1; //value doesn't exi  st
    }
    
    
}
