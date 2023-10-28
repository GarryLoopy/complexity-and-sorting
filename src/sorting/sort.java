/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

import comparator.baseAreaComparator;
import comparator.heightComparator;
import comparator.volumeComparator;
import complexityandsorting.drivers.Shape;
import java.util.Comparator;
import static swap.swap.swap;

/**
 *
 * @author osman
 */
public class sort {

    //bubble sort
    public static void bubbleSortH(Shape[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) == 1) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSortBA(Shape[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (new baseAreaComparator().compare(array[j], array[j + 1]) == 1) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void bubbleSortV(Shape[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (new volumeComparator().compare(array[j], array[j + 1]) == -1) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    //merge sort
    public static void mergeSortH(Shape[] array) {
        int arrayLength = array.length;

        if (arrayLength < 2) {
            return;
        }
        int midIndex = arrayLength / 2;
        Shape[] leftHalf = new Shape[midIndex];
        Shape[] rightHalf = new Shape[arrayLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < arrayLength; i++) {
            rightHalf[i - midIndex] = array[i];
        }

        mergeSortH(leftHalf);
        mergeSortH(rightHalf);
        mergeH(array, leftHalf, rightHalf);
    }

    private static void mergeH(Shape[] array, Shape[] leftHalf, Shape[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].compareTo(rightHalf[j]) == -1) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;

        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            k++;
            j++;

        }
    }

    public static void mergeSortBA(Shape[] array) {
        int arrayLength = array.length;

        if (arrayLength < 2) {
            return;
        }
        int midIndex = arrayLength / 2;
        Shape[] leftHalf = new Shape[midIndex];
        Shape[] rightHalf = new Shape[arrayLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < arrayLength; i++) {
            rightHalf[i - midIndex] = array[i];
        }

        mergeSortBA(leftHalf);
        mergeSortBA(rightHalf);
        mergeBA(array, leftHalf, rightHalf);
    }

    private static void mergeBA(Shape[] array, Shape[] leftHalf, Shape[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (new baseAreaComparator().compare(leftHalf[i], rightHalf[j]) == -1) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;

        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            k++;
            j++;

        }
    }

    public static void mergeSortV(Shape[] array) {
        int arrayLength = array.length;

        if (arrayLength < 2) {
            return;
        }
        int midIndex = arrayLength / 2;
        Shape[] leftHalf = new Shape[midIndex];
        Shape[] rightHalf = new Shape[arrayLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < arrayLength; i++) {
            rightHalf[i - midIndex] = array[i];
        }

        mergeSortV(leftHalf);
        mergeSortV(rightHalf);
        mergeV(array, leftHalf, rightHalf);
    }

    private static void mergeV(Shape[] array, Shape[] leftHalf, Shape[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (new volumeComparator().compare(leftHalf[i], rightHalf[j]) == -1) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;

        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            k++;
            j++;

        }
    }

    //insersion sort
    public static void insersionSortH(Shape[] array) {
        for (int i = 1; i < array.length; i++) {
            Shape currentShape = array[i];

            int j = i - 1;
            while (j >= 0 && array[j].compareTo(currentShape) == 1) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentShape;

        }

    }

    public static void insersionSortBA(Shape[] array) {
        for (int i = 1; i < array.length; i++) {
            Shape currentShape = array[i];

            int j = i - 1;
            while (j >= 0 && new baseAreaComparator().compare(array[j], currentShape) == 1) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentShape;

        }

    }

    public static void insersionSortV(Shape[] array) {
        for (int i = 1; i < array.length; i++) {
            Shape currentShape = array[i];

            int j = i - 1;
            while (j >= 0 && new volumeComparator().compare(array[j], currentShape) == 1) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentShape;

        }

    }

    //selection sort
    public static void selectionSortH(Shape[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }

    public static void selectionSortBA(Shape[] array) {

        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (new baseAreaComparator().compare(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }

    }

    public static void selectionSortV(Shape[] array) {

        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (new volumeComparator().compare(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }

    }

    //quickSort
    //height
    public static void quickSortH(Shape[] arr) {
        sortH(arr, 0, arr.length - 1);
    }

    public static void sortH(Shape[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionH(arr, low, high);
            sortH(arr, low, pi - 1);
            sortH(arr, pi + 1, high);
        }
    }

    public static int partitionH(Shape[] arr, int low, int high) {
        Shape pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    //BA
    public static void quickSortBA(Shape[] arr) {
        sortBA(arr, 0, arr.length - 1);
    }

    public static void sortBA(Shape[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionBA(arr, low, high);
            sortBA(arr, low, pi - 1);
            sortBA(arr, pi + 1, high);
        }
    }

    public static int partitionBA(Shape[] arr, int low, int high) {
        Shape pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (new baseAreaComparator().compare(arr[j], pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    //volume
    public static void quickSortV(Shape[] arr) {
        sortV(arr, 0, arr.length - 1);
    }

    public static void sortV(Shape[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionV(arr, low, high);
            sortV(arr, low, pi - 1);
            sortV(arr, pi + 1, high);
        }
    }

    public static int partitionV(Shape[] arr, int low, int high) {
        Shape pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (new volumeComparator().compare(arr[j], pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    //heap height
    //heap volume
    public static void heapSortH(Shape[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyH(arr, n, i);
        }

        // One by one extract an element from the heap
        for (int i = n - 1; i > 0; i--) {
            Shape temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifyH(arr, i, 0);
        }
    }

    public static void heapifyH(Shape[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }

        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            Shape temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapifyH(arr, n, largest);
        }
    }

    //BA
    public static void heapSortBA(Shape[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyBA(array, n, i, new baseAreaComparator());
        }
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapifyBA(array, i, 0, new baseAreaComparator());
        }
    }

    public static void heapifyBA(Shape[] array, int n, int i, Comparator<Shape> baseAreaComparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && baseAreaComparator.compare(array[left], array[largest]) > 0) {
            largest = left;
        }
        if (right < n && baseAreaComparator.compare(array[right], array[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest); 
            heapifyBA(array, n, largest, baseAreaComparator);
        }
    }

    //volume
    public static void heapSortV(Shape[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyV(array, n, i, new volumeComparator());
        }
        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            heapifyV(array, i, 0, new volumeComparator());
        }
    }

    public static void heapifyV(Shape[] array, int n, int i, Comparator<Shape> volumeComparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && volumeComparator.compare(array[left], array[largest]) > 0) {
            largest = left;
        }
        if (right < n && volumeComparator.compare(array[right], array[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest); 
            heapifyV(array, n, largest, volumeComparator);
        }
    }
    ///////////////////
    //ba
    //////////////////
    

}
