package complexityandsorting.drivers;

import complexityandsorting.utilities.Shape;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class Sort {

    public static void Bubble(Shape[] data) {
        int dataLength = data.length;
        
        for (int index = 0; index <= dataLength - 1; )
        {
            int outerIndex = index + 1;
            
            
        }
    }

    public static void Insertion(Comparable[] data) {
        int n = data.length;
        for (int i = 1; i < n; i++) {
            Comparable key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].compareTo(key) > 0) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
    }

    public static void Selection(Comparable[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public static void Merge(Shape[] data) {

    }

    public static void Quick(Shape[] data) {

    }
    
    public static void Heap(Shape[] data)
    {
        
    }
}
