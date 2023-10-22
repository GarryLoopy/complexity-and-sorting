package complexityandsorting.drivers;

import complexityandsorting.utilities.Cone;
import complexityandsorting.utilities.Cylinder;
import complexityandsorting.utilities.OctagonalPrism;
import complexityandsorting.utilities.PentagonalPrism;
import complexityandsorting.utilities.Shape;
import complexityandsorting.utilities.SquarePrism;
import complexityandsorting.utilities.TriangularPrism;

public class ShapeHelper {

    String[] contentsSplit;

    int amountOfShapes;

    Shape[] shapes;

    public ShapeHelper(String[] contentsSplit, int amountOfShapes)
    {
        this.contentsSplit = contentsSplit;
        this.amountOfShapes = amountOfShapes;

        CreateShapes();
    }

    public Shape[] GetShapes()
    {
        return this.shapes;
    }

    public void PrintShapes()
    {
        for (Shape shape : shapes)
        {
            System.out.println(shape);
            System.out.println();
        }
    }    

    private void CreateShapes() {
        shapes = new Shape[amountOfShapes];

        int length = contentsSplit.length - 1;

        int currentIndex = 0;
        for (int index = 1; index <= length - 2; index += 3)
        {
            switch(contentsSplit[index])
            {
                case "Cylinder" -> shapes[currentIndex] = new Cylinder(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "Cone" -> shapes[currentIndex] = new Cone(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "Pyramid" -> shapes[currentIndex] = new Cone(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "OctagonalPrism" -> shapes[currentIndex] = new OctagonalPrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "PentagonalPrism" -> shapes[currentIndex] = new PentagonalPrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "SquarePrism" -> shapes[currentIndex] = new SquarePrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                case "TriangularPrism" -> shapes[currentIndex] = new TriangularPrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
            }
            currentIndex++;
        }
    }

}
