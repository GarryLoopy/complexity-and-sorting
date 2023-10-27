/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

import comparator.baseAreaComparator;
import comparator.heightComparator;
import comparator.volumeComparator;
import complexityandsorting.drivers.Shape;
import static swap.swap.swap;

/**
 *
 * @author osman
 */
public class sort {
    
    
    
    //bubble sort
    public static void bubbleSortH(Shape[] array){
        
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
                if (new volumeComparator().compare(array[j], array[j+1]) == -1){
                    swap(array, j, j+1);
                }
            }
        }
    }
    

    //merge sort
    public static void mergeSortH(Shape[] array){
        int arrayLength = array.length;
        
        if (arrayLength < 2){
            return;
        }
        int midIndex = arrayLength /2;
        Shape[] leftHalf = new Shape[midIndex];
        Shape[] rightHalf = new Shape[arrayLength - midIndex];
        
        for (int i = 0; i < midIndex; i++){
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < arrayLength; i++){
            rightHalf[i- midIndex] = array[i]; 
        }
        
        mergeSortH(leftHalf);
        mergeSortH(rightHalf);
        mergeH(array, leftHalf, rightHalf);
    }
    
    private static void mergeH(Shape[] array, Shape[] leftHalf, Shape[] rightHalf){
        
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        int i = 0, j = 0, k = 0;
        
        while (i < leftSize && j < rightSize){
            if (leftHalf[i].compareTo(rightHalf[j]) == -1){
                array[k] = leftHalf[i];
                i++;
            }
            else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
         
        }
        while (j < rightSize){
            array[k] = rightHalf[j];
            k++;
            j++;
         
        }
    }
    

    public static void mergeSortBA(Shape[] array){
        int arrayLength = array.length;
        
        if (arrayLength < 2){
            return;
        }
        int midIndex = arrayLength /2;
        Shape[] leftHalf = new Shape[midIndex];
        Shape[] rightHalf = new Shape[arrayLength - midIndex];
        
        for (int i = 0; i < midIndex; i++){
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < arrayLength; i++){
            rightHalf[i- midIndex] = array[i]; 
        }
        
        mergeSortBA(leftHalf);
        mergeSortBA(rightHalf);
        mergeBA(array, leftHalf, rightHalf);
    }
    
    private static void mergeBA(Shape[] array, Shape[] leftHalf, Shape[] rightHalf){
        
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        int i = 0, j = 0, k = 0;
        
        while (i < leftSize && j < rightSize){
            if (new baseAreaComparator().compare(leftHalf[i], rightHalf[j]) == -1){
                array[k] = leftHalf[i];
                i++;
            }
            else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
         
        }
        while (j < rightSize){
            array[k] = rightHalf[j];
            k++;
            j++;
         
        }
    }
    

    public static void mergeSortV(Shape[] array){
        int arrayLength = array.length;
        
        if (arrayLength < 2){
            return;
        }
        int midIndex = arrayLength /2;
        Shape[] leftHalf = new Shape[midIndex];
        Shape[] rightHalf = new Shape[arrayLength - midIndex];
        
        for (int i = 0; i < midIndex; i++){
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < arrayLength; i++){
            rightHalf[i- midIndex] = array[i]; 
        }
        
        mergeSortV(leftHalf);
        mergeSortV(rightHalf);
        mergeV(array, leftHalf, rightHalf);
    }
    
    private static void mergeV(Shape[] array, Shape[] leftHalf, Shape[] rightHalf){
        
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        int i = 0, j = 0, k = 0;
        
        while (i < leftSize && j < rightSize){
            if (new volumeComparator().compare(leftHalf[i], rightHalf[j]) == -1){
                array[k] = leftHalf[i];
                i++;
            }
            else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
         
        }
        while (j < rightSize){
            array[k] = rightHalf[j];
            k++;
            j++;
         
        }
    }
    
    //quickSort
    public  static void quickSortH(Shape[] array, int lowIndex, int hightIndex){
        
        Shape pivot = array[hightIndex];
        
        Shape leftPointer;
        
        
        
    }
    
    //insersion sort
    
    public static void insersionSortH(Shape[] array){
        for (int i = 1; i < array.length; i++){
            Shape currentShape = array[i];
            
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(currentShape) == 1){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = currentShape;
            
        }

    }
    public static void insersionSortBA(Shape[] array){
        for (int i = 1; i < array.length; i++){
            Shape currentShape = array[i];
            
            int j = i - 1;
            while (j >= 0 && new baseAreaComparator().compare(array[j], currentShape) == 1){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = currentShape;
            
        }
        
    }
    public static void insersionSortV(Shape[] array){
        for (int i = 1; i < array.length; i++){
            Shape currentShape = array[i];
            
            int j = i - 1;
            while (j >= 0 && new volumeComparator().compare(array[j], currentShape) == 1){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = currentShape;
            
        }
        
    }
    
    
}
