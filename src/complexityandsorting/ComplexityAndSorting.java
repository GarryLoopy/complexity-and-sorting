package complexityandsorting;

import java.io.IOException;

import complexityandsorting.drivers.FileHelper;
import complexityandsorting.drivers.ShapeHelper;
import complexityandsorting.drivers.ShapeVolumeCompare;
import complexityandsorting.drivers.ShapeBaseAreaCompare;
import complexityandsorting.drivers.Sort;

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
        ShapeHelper shapeHelper;

        try {
            fileHelper = new FileHelper("src\\data\\testData.txt");
        } catch (IOException e) {
            System.out.println("File not found");
            return;
        }

        shapeHelper = new ShapeHelper(fileHelper.GetContentsSplit(), fileHelper.GetAmountOfShapes());
        Sort.Heap(shapeHelper.GetShapes(), new ShapeBaseAreaCompare());
        shapeHelper.PrintShapes();
    }
}
