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

        for (int outerIndex = dataLength; outerIndex > 1; outerIndex--) {
            for (int innerIndex = 0; innerIndex < outerIndex - 1; innerIndex++) {
                if (data[innerIndex].compareTo(data[innerIndex + 1]) == 1) {
                    Swap(data, innerIndex, innerIndex + 1);
                }
            }
        }
    }

    public static void Bubble(Shape[] data, Comparator<Shape> comparator) {
        int dataLength = data.length;

        for (int outerIndex = dataLength; outerIndex > 1; outerIndex--) {
            for (int innerIndex = 0; innerIndex < outerIndex - 1; innerIndex++) {
                if (comparator.compare(data[innerIndex], data[innerIndex + 1]) == 1) {
                    Swap(data, innerIndex, innerIndex + 1);
                }
            }
        }
    }

    public static void Insertion(Shape[] data) {
        int dataLength = data.length;

        for (int outerIndex = 1; outerIndex <= dataLength - 1; outerIndex++) {
            int currentIndex = outerIndex - 1;
            while (currentIndex >= 0 && data[currentIndex].compareTo(data[currentIndex + 1]) == 1) {
                Swap(data, currentIndex, currentIndex + 1);

                currentIndex--;
            }
        }
    }

    public static void Insertion(Shape[] data, Comparator<Shape> comparator) {
        int dataLength = data.length;

        for (int outerIndex = 1; outerIndex <= dataLength - 1; outerIndex++) {
            int currentIndex = outerIndex - 1;
            while (currentIndex >= 0 && comparator.compare(data[currentIndex], data[currentIndex + 1]) == 1) {
                Swap(data, currentIndex, currentIndex + 1);

                currentIndex--;
            }
        }
    }

    public static void Selection(Shape[] data) {
        int dataLength = data.length;

        for (int outerIndex = 0; outerIndex <= dataLength - 2; outerIndex++) {
            int minimumShapeIndex = outerIndex;

            for (int innerIndex = outerIndex + 1; innerIndex <= dataLength - 1; innerIndex++) {
                if (data[minimumShapeIndex].compareTo(data[innerIndex]) == 1) {
                    minimumShapeIndex = innerIndex;
                }
            }

            Swap(data, outerIndex, minimumShapeIndex);
        }
    }

    public static void Selection(Shape[] data, Comparator<Shape> comparator) {
        int dataLength = data.length;

        for (int outerIndex = 0; outerIndex <= dataLength - 2; outerIndex++) {
            int minimumShapeIndex = outerIndex;

            for (int innerIndex = outerIndex + 1; innerIndex <= dataLength - 1; innerIndex++) {
                if (comparator.compare(data[minimumShapeIndex], data[innerIndex]) == 1) {
                    minimumShapeIndex = innerIndex;
                }
            }

            Swap(data, outerIndex, minimumShapeIndex);
        }
    }

    public static void Merge(Shape[] data) {
        int dataLength = data.length;

        // Base case
        if (dataLength <= 1) {
            return;
        }

        // Gets middle
        int middle = dataLength / 2;

        // Creates 2 new Shape arrays to contain both left and right side from middle
        Shape[] leftShapes = new Shape[middle];
        Shape[] rightShapes = new Shape[dataLength - middle];

        int leftShapesIndex = 0, rightShapesIndex = 0;

        // Iterate from 0 up to dataLength
        // First, copy arrays from left up to middle
        // Then, copy arrays from middle up to end of array
        for (; leftShapesIndex < dataLength; leftShapesIndex++) {
            if (leftShapesIndex < middle) {
                leftShapes[leftShapesIndex] = data[leftShapesIndex];
            } else {
                rightShapes[rightShapesIndex] = data[leftShapesIndex];
                rightShapesIndex++;
            }
        }

        Merge(leftShapes);
        Merge(rightShapes);
        MergeShapes(leftShapes, rightShapes, data);
    }

    public static void Merge(Shape[] data, Comparator<Shape> comparator) {
        int dataLength = data.length;

        if (dataLength <= 1) {
            return;
        }

        int middle = dataLength / 2;

        Shape[] leftShapes = new Shape[middle];
        Shape[] rightShapes = new Shape[dataLength - middle];

        int leftShapesIndex = 0, rightShapesIndex = 0;

        for (; leftShapesIndex < dataLength; leftShapesIndex++) {
            if (leftShapesIndex < middle) {
                leftShapes[leftShapesIndex] = data[leftShapesIndex];
            } else {
                rightShapes[rightShapesIndex] = data[leftShapesIndex];
                rightShapesIndex++;
            }
        }

        Merge(leftShapes, comparator);
        Merge(rightShapes, comparator);
        MergeShapes(leftShapes, rightShapes, data, comparator);
    }

    private static void MergeShapes(Shape[] leftShapes, Shape[] rightShapes, Shape[] shapes, Comparator<Shape> comparator) {
        int leftSize = shapes.length / 2;
        int rightSize = shapes.length - leftSize;

        int i = 0, left = 0, right = 0;

        while (left < leftSize && right < rightSize) {
            if (comparator.compare(leftShapes[left], rightShapes[right]) == -1) {
                shapes[i] = leftShapes[left];
                i++;
                left++;
            } else {
                shapes[i] = rightShapes[right];
                i++;
                right++;
            }
        }

        while (left < leftSize) {
            shapes[i] = leftShapes[left];
            i++;
            left++;
        }

        while (right < rightSize) {
            shapes[i] = rightShapes[right];
            i++;
            right++;
        }
    }

    private static void MergeShapes(Shape[] leftShapes, Shape[] rightShapes, Shape[] shapes) {
        int leftSize = shapes.length / 2;
        int rightSize = shapes.length - leftSize;

        int i = 0, left = 0, right = 0;

        while (left < leftSize && right < rightSize) {
            if (leftShapes[left].compareTo(rightShapes[right]) == -1) {
                shapes[i] = leftShapes[left];
                i++;
                left++;
            } else {
                shapes[i] = rightShapes[right];
                i++;
                right++;
            }
        }

        while (left < leftSize) {
            shapes[i] = leftShapes[left];
            i++;
            left++;
        }

        while (right < rightSize) {
            shapes[i] = rightShapes[right];
            left++;
            right++;
        }
    }

    public static void Quick(Shape[] data, int start, int end) {
        if (end <= start) {
            return;
        }

        int pivot = Partition(data, start, end);
        Quick(data, start, pivot - 1);
        Quick(data, pivot + 1, end);
    }

    public static void Quick(Shape[] data, int start, int end, Comparator<Shape> comparator) {
        if (end <= start) {
            return;
        }

        int pivot = Partition(data, start, end);
        Quick(data, start, pivot - 1, comparator);
        Quick(data, pivot + 1, end, comparator);
    }

    public static int Partition(Shape[] data, int start, int end, Comparator<Shape> comparator) {
        Shape pivot = data[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (comparator.compare(data[j], pivot) == -1) {
                i++;
                Swap(data, i, j);
            }
        }

        i++;

        Swap(data, i, end);

        return i;
    }

    public static int Partition(Shape[] data, int start, int end) {
        Shape pivot = data[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (data[j].compareTo(pivot) == -1) {
                i++;
                Swap(data, i, j);
            }
        }

        i++;

        Swap(data, i, end);

        return i;
    }

    public static void Heap(Shape[] data) {
        int n = data.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify(data, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            Swap(data, 0, i);
            Heapify(data, i, 0);
        }
    }

    public static void Heap(Shape[] data, Comparator<Shape> comparator) {
        int n = data.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            Heapify(data, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            Swap(data, 0, i);
            Heapify(data, i, 0, comparator);
        }
    }

    private static void Heapify(Shape[] data, int n, int i, Comparator<Shape> comparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < n && comparator.compare(data[left], data[largest]) > 0) {
            largest = left;
        }
        
        if (right < n && comparator.compare(data[right], data[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            Swap(data, i, largest);
            Heapify(data, n, largest, comparator);
        }
    }

    private static void Heapify(Shape[] data, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && data[left].compareTo(data[largest]) > 0) {
            largest = left;
        }

        if (right < n && data[right].compareTo(data[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            Swap(data, i, largest);
            Heapify(data, n, largest);
        }
    }

    private static void Swap(Shape[] shapes, int firstIndex, int secondIndex) {
        Shape temp = shapes[firstIndex];

        shapes[firstIndex] = shapes[secondIndex];
        shapes[secondIndex] = temp;
    }
}
