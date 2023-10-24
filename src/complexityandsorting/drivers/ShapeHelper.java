package complexityandsorting.drivers;

import complexityandsorting.utilities.Cone;
import complexityandsorting.utilities.Cylinder;
import complexityandsorting.utilities.OctagonalPrism;
import complexityandsorting.utilities.PentagonalPrism;
import complexityandsorting.utilities.Shape;
import complexityandsorting.utilities.SquarePrism;
import complexityandsorting.utilities.TriangularPrism;

/**
 * Represents a class helper for shapes
 *
 * @author Garry Jr
 */
public class ShapeHelper {
    
    // String[] for the constents that are split
    String[] contentsSplit;
    
    // Amount of shapes
    int amountOfShapes;

    // Main shapes array for the current shape helper class
    Shape[] shapes;
    
    // Represents a variable to print shapes for every increment
    static int incrementPerPrint = 1000;

    /**
     * Constructor for the Shape Helper
     *
     * @param fileHelper the file helper
     */
    public ShapeHelper(FileHelper fileHelper) {
        this.contentsSplit = fileHelper.GetContentsSplit();
        this.amountOfShapes = fileHelper.GetAmountOfShapes();

        CreateShapes();
    }

    /**
     * Gets the shapes in the shape helper
     *
     * @return
     */
    public Shape[] GetShapes() {
        return this.shapes;
    }

    /**
     * Prints the shapes
     */
    public void PrintShapes() {
        
        // Prints first shape
        System.out.println(shapes[0]);
        System.out.println();
        
        // Prints every incremental shape
        for (int index = 0; index < amountOfShapes; index += incrementPerPrint) {

            System.out.println(shapes[index]);
            System.out.println();
        }
        
        //Prints last shape
        System.out.println(shapes[amountOfShapes - 1]);
        System.out.println();
    }
    
    /**
     * Creates the shapes via given file helper class
     */
    private void CreateShapes() {
        // Create new Shape array by the amount of shapes
        shapes = new Shape[amountOfShapes];
        
        int length = contentsSplit.length - 1;
        
        // Index for the shape array
        int currentIndex = 0;
        
        // A for loop with that increments with 3, which represents an allocation of a shape from the file
        for (int index = 1; index <= length - 2; index += 3) {
            
            // Creates a shape based on the read text
            switch (contentsSplit[index]) {
                case "Cylinder" ->
                    shapes[currentIndex] = new Cylinder(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "Cone" ->
                    shapes[currentIndex] = new Cone(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "Pyramid" ->
                    shapes[currentIndex] = new Cone(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "OctagonalPrism" ->
                    shapes[currentIndex] = new OctagonalPrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "PentagonalPrism" ->
                    shapes[currentIndex] = new PentagonalPrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "SquarePrism" ->
                    shapes[currentIndex] = new SquarePrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "TriangularPrism" ->
                    shapes[currentIndex] = new TriangularPrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
            }
            currentIndex++;
        }
    }

}
