package complexityandsorting.drivers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import complexityandsorting.utilities.Cone;
import complexityandsorting.utilities.Cylinder;
import complexityandsorting.utilities.OctagonalPrism;
import complexityandsorting.utilities.PentagonalPrism;
import complexityandsorting.utilities.Shape;
import complexityandsorting.utilities.SquarePrism;
import complexityandsorting.utilities.TriangularPrism;


public class FileHelper {
    Path filePath;

    String content;
    String[] contentsSplit;

    Shape[] shapes;

    public FileHelper(String filePath) throws IOException
    {
        this.filePath = Path.of(filePath);
        content = Files.readString(this.filePath);

        SplitContents();

        CreateShapes();
    }

    public int GetAmount()
    {
        return Integer.parseInt(contentsSplit[0]);
    }

    public Shape[] GetShapes()
    {
        return this.shapes;
    }

    private void SplitContents()
    {
        contentsSplit = content.split(" ");

    }

    private void CreateShapes() {
        shapes = new Shape[GetAmount()];

        int length = contentsSplit.length - 1;

        int currentIndex = 0;
        for (int index = 1; index <= length - 2; index += 3)
        {
            switch(contentsSplit[index])
            {
                case "Cylinder":
                    shapes[currentIndex] = new Cylinder(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                    break;
                case "Cone":
                    shapes[currentIndex] = new Cone(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                    break;
                case "Pyramid":
                    shapes[currentIndex] = new Cone(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                    break;
                case "OctagonalPrism":
                    shapes[currentIndex] = new OctagonalPrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                    break;
                case "PentagonalPrism":
                    shapes[currentIndex] = new PentagonalPrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                    break;
                case "SquarePrism":
                    shapes[currentIndex] = new SquarePrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                    break;
                case "TriangularPrism":
                    shapes[currentIndex] = new TriangularPrism(Double.parseDouble(contentsSplit[index + 1]), Double.parseDouble(contentsSplit[index + 2]));
                    break;
            }
            currentIndex++;
        }
    }


}
