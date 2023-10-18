/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers.sort;

import complexityandsorting.drivers.Shape;

/**
 *
 * @author garry
 */
public class Sort {
    public static void Bubble(Shape[] shapes)
    {
        
    }
    
    public static void Insertion(Comparable[] data)
    {
        int n =data.length;
        for(int i=1;i<n;i++){
            Comparable key =shapes[i];
            int j =i-1;
            while(j>=0&&data[j].compareTo(key)>0){
                data[j+1]=data[j];
                j=j-1;
            }
            data[j+1]=key;
        }
    }
    
    public static void Selection(Comparable[] data)
    {
        int n =data.length;
        for(int i =0;i<n-1;i++){
            int minIndex =i;
            for(int j =j+1;j<n;j++){
                if(data[j].compareTo(data[minIndex])<0){
                    minIndex=j;
                }
            }
            Comparable temp=data[minIndex];
            data[minIndex]=data[i];
            data[i]=temp;
        }
    }
    
    public static void Merge(Shape[] shapes)
    {
        
    }
    
    public static void Quick(Shape[] shapes)
    {
        
    }
    public static void Heap(Shape[] shapes)
    {
        
    }
}
