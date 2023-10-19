package complexityandsorting.drivers;

import complexityandsorting.utilities.Shape;
import java.util.Comparator;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class Sort {

    public static void Bubble(Shape[] data) {
        int dataLength = data.length;
        
        for (int outerIndex = dataLength; outerIndex > 1; outerIndex--)
        {
            for (int innerIndex = 0; innerIndex < outerIndex - 1; innerIndex++)
            {
                if (data[innerIndex].compareTo(data[innerIndex + 1]) == 1)
                {
                    Shape temp = data[innerIndex];
                    
                    data[innerIndex] = data[innerIndex + 1];
                    data[innerIndex + 1] = temp;
                }
            }
        }
    }
    public static void Bubble(Shape[] data, Comparator comparator)
    {
        int dataLength = data.length;
        
        for (int outerIndex = dataLength; outerIndex > 1; outerIndex--)
        {
            for (int innerIndex = 0; innerIndex < outerIndex - 1; innerIndex++)
            {
                if (comparator.compare(data[innerIndex], data[innerIndex + 1]) == 1)
                {
                    Shape temp = data[innerIndex];
                    
                    data[innerIndex] = data[innerIndex + 1];
                    data[innerIndex + 1] = temp;
                }
            }
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
