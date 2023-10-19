package complexityandsorting.drivers;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class Sort {

    public static void Bubble(Object[] data) {

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

    public static void Merge(Object[] data) {

    }

    public static void Quick(Object[] data) {

    }
}
