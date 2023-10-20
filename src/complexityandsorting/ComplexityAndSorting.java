package complexityandsorting;

import java.io.IOException;

import complexityandsorting.drivers.FileHelper;
import complexityandsorting.drivers.ShapeVolumeCompare;
import complexityandsorting.drivers.Sort;
import complexityandsorting.utilities.Shape;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class ComplexityAndSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileHelper fileHelper;

        try {
            fileHelper = new FileHelper("src\\data\\polyfor1.txt");
        } catch (IOException e) {
            return;
        }

        System.out.println("Sorted by height");
        Sort.Bubble(fileHelper.GetShapes());
        PrintShapes(fileHelper.GetShapes());
    }
    
    public static void PrintShapes(Shape[] shapes)
    {
        for (Shape shape : shapes)
        {
            System.out.println(shape);
            System.out.println();
        }
    }    
}
