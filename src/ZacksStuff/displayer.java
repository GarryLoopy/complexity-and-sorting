/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZacksStuff;

import complexityandsorting.drivers.Circle;
import complexityandsorting.drivers.Prism;
import complexityandsorting.drivers.Pyramid;
import complexityandsorting.drivers.Shape;

/**
 *
 * @author osman
 */
public class displayer {

    public static void displayShapes(Shape[] array) {
        int counter = 0;

        for (Shape shape : array) {
            if (shape instanceof Circle circle) {
                System.out.println("This is a " + shape.getShapeName());
                System.out.println("Height: " + shape.getHeight());
                System.out.println("Radius: " + circle.getRadius());
                System.out.println("Base area: " + circle.calculateBaseArea());
                System.out.println("Volume: " + circle.calculateVolume());
                System.out.println("-------------");
            } else if (shape instanceof Prism prism) {
                System.out.println("This is a " + shape.getShapeName());
                System.out.println("Height: " + shape.getHeight());
                System.out.println("Edge: " + prism.getEdge());
                System.out.println("Base area: " + prism.calculateBaseArea());
                System.out.println("Volume: " + prism.calculateVolume());
                System.out.println("-------------");
            } else if (shape instanceof Pyramid pyramid) {
                System.out.println("This is a " + shape.getShapeName());
                System.out.println("Height: " + shape.getHeight());
                System.out.println("Edge: " + pyramid.getEdge());
                System.out.println("Base area: " + pyramid.calculateBaseArea());
                System.out.println("Volume: " + pyramid.calculateVolume());
                System.out.println("-------------");
            }
            counter++;
        }
        System.out.println(counter);
    }

}
