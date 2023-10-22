package complexityandsorting.drivers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

import complexityandsorting.Shapes.Cone;
import complexityandsorting.Shapes.Cylinder;
import complexityandsorting.Shapes.Prisms;
import complexityandsorting.Shapes.Pyramid;
import complexityandsorting.Shapes.Shape;

public class MainProgram {
  public static void main(String[] args) {
    if (args.length != 6) {
      System.err.println("Usage: java -jar sort.jar -ffile_name -tv|a|h -sb|s|i|m|q|z");
      System.exit(1);
    }

    String fileName = null;
    char compareType = 0;
    char sortAlgorithm = 0;

    for (int i = 0; i < args.length; i++) {
      if (args[i].equalsIgnoreCase("-f")) {
        fileName = args[i + 1];
      } else if (args[i].equalsIgnoreCase("-t")) {
        compareType = args[i + 1].toLowerCase().charAt(0);
      } else if (args[i].equalsIgnoreCase("-s")) {
        sortAlgorithm = args[i + 1].toLowerCase().charAt(0);
      }
    }

    if (fileName == null || (compareType != 'v' && compareType != 'a' && compareType != 'h')
        || sortAlgorithm != 'b' && sortAlgorithm != 's' && sortAlgorithm != 'i' && sortAlgorithm != 'm'
            && sortAlgorithm != 'q' && sortAlgorithm != 'z') {
      System.out.println("Invalid input.");
      System.exit(1);
    }

    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      int numShapes = Integer.parseInt(br.readLine());
      Shape[] shapes = new Shape[numShapes];

      for (int i = 0; i < numShapes; i++) {
        String[] data = br.readLine().split("");
        String shapeType = data[0];
        double param1 = Double.parseDouble(data[1]);
        double param2 = Double.parseDouble(data[2]);

        if (shapeType.equalsIgnoreCase("Cone")) {
          shapes[i] = new Cone(param1, param2);
        } else if (shapeType.equalsIgnoreCase("Cylinder")) {
          shapes[i] = new Cylinder(param1, param2);
        } else if (shapeType.equalsIgnoreCase("Pyramid")) {
          shapes[i] = new Pyramid(param1, param2);
        } else if (shapeType.equalsIgnoreCase("Prisms")) {
          shapes[i] = new Prisms(param1, param2);
        } else {
          System.out.println("Invalid shape type");
          System.exit(1);
        }
      }

      Comparator<Shape> comparator = null;
      if (compareType == 'v') {
        comparator = new VolumeComparator();
      } else if (compareType == 'a') {
        comparator = new BaseAreaComparator();
      } else if (compareType == 'h') {
        comparator = Comparator.comparing(Shape::getHeight);
      }

      if (sortAlgorithm == 'b') {
        SortAlgorithm.measureTimeAndSort(shapes, comparator);
      } else if (sortAlgorithm == 'i') {
        SortAlgorithm.measureTimeAndSort(shapes, comparator);
      } else if (sortAlgorithm == 's') {
        SortAlgorithm.measureTimeAndSort(shapes, comparator);
      } else if (sortAlgorithm == 'm') {
        SortAlgorithm.measureTimeAndSort(shapes, comparator);
      } else if (sortAlgorithm == 'q') {
        SortAlgorithm.measureTimeAndSort(shapes, comparator);
      } else if (sortAlgorithm == 'z') {
        SortAlgorithm.measureTimeAndSort(shapes, comparator);
      }

      System.out.println("Shapes:");
      for (Shape shape : shapes) {
        System.out.println(
            "Base Area: " + shape.getBaseArea() + ", Volume: " + shape.getVolume() + ", Height: " + shape.getHeight());
      }
      System.out.println("First Shape: " + shapes[0].toString());
      System.out.println("Last Shape: " + shapes[shapes.length - 1].toString());

      for (int i = 1000; i < shapes.length; i += 1000) {
        System.out.println("Shape " + i + ": " + shapes[i].toString());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}