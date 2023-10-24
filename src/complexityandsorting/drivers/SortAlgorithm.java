package complexityandsorting.drivers;

import java.util.Arrays;
import java.util.Comparator;
import complexityandsorting.Shapes.Shape;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class SortAlgorithm {
  public static void bubbleSort(Shape[] arr) {
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; i < n - i - 1; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          Shape temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped)
        break;
    }
  }

  public static void insertionSort(Shape[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      Shape key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j].compareTo(key) > 0) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  public static void selectionSort(Shape[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j].compareTo(arr[minIndex]) < 0) {
          minIndex = j;
        }
      }
      Shape temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }

  public static void mergeSort(Shape[] arr) {
    if (arr.length > 1) {
      int mid = arr.length / 2;
      Shape[] left = Arrays.copyOfRange(arr, 0, mid);
      Shape[] right = Arrays.copyOfRange(arr, mid, arr.length);
      mergeSort(left);
      mergeSort(right);

      int i = 0, j = 0, k = 0;
      while (i < left.length && j < right.length) {
        if (left[i].compareTo(right[j]) < 0) {
          arr[k] = left[i];
          i++;
        } else {
          arr[k] = right[j];
          j++;
        }
        k++;
      }

      while (i < left.length) {
        arr[k] = left[i];
        i++;
        k++;
      }

      while (j < right.length) {
        arr[k] = right[j];
        j++;
        k++;
      }
    }
  }

  public static void quickSort(Shape[] arr, int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  private static int partition(Shape[] arr, int low, int high) {
    Shape pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (arr[j].compareTo(pivot) < 0) {
        i++;
        Shape temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    Shape temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }

  public static void measureTimeAndSort(Shape[] shapes, Comparator<Shape> comparator) {
    long startTime = System.nanoTime();
    Arrays.sort(shapes, comparator);
    long endTime = System.nanoTime();

    long executionTime = endTime - startTime;

    System.out.println("Execution time: " + executionTime + " nanoseconds");
  }
}
