/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZacksStuff;

import complexityandsorting.drivers.Cone;
import complexityandsorting.drivers.Cylinder;
import complexityandsorting.drivers.OctagonalPrism;
import complexityandsorting.drivers.PentagonalPrism;
import complexityandsorting.drivers.Pyramid;
import complexityandsorting.drivers.Shape;
import complexityandsorting.drivers.SquarePrism;
import complexityandsorting.drivers.TriangularPrism;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author osman
 */
public abstract class fileReading {
    
    
    public static String convertToFileFormat(String unconvertedFile){
        
        String convertedFile = unconvertedFile.replace("/", "//").replace("-f", "");
        return convertedFile;
        
    }
    public static Shape[] readFileShapes(String filePath) throws IOException{
                
        filePath = convertToFileFormat(filePath);
        String size = "";
        String parts[] = null;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            //everyhing to one var
            String line = br.readLine();
            //get rid of spaces
            parts = line.split(" ");
            //get size of array
            size = parts[0];
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fileReading.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return makeShapeObjects(parts);
        
        
    }
    public static Shape[] makeShapeObjects(String[] array) {
        int size = Integer.parseInt(array[0]);

        // Array of shape objects
        Shape[] shapeArray = new Shape[size];

        // Index counter
        int index = 0;

        for (int i = 1; i < array.length; i = i+3) {
            if (index < size) {
                // Upper limit size on index var

                // Circles
                if (array[i].equals("Cylinder")) {
                    shapeArray[index] = new Cylinder(Double.parseDouble(array[i + 1]), Double.parseDouble(array[i + 2]));
                } else if (array[i].equals("Cone")) {
                    shapeArray[index] = new Cone(Double.parseDouble(array[i + 1]), Double.parseDouble(array[i + 2]));
                } // Prisms
                else if (array[i].equals("OctagonalPrism")) {
                    shapeArray[index] = new OctagonalPrism(Double.parseDouble(array[i + 1]), Double.parseDouble(array[i + 2]));
                } 
                else if (array[i].equals("TriangularPrism")) {
                    shapeArray[index] = new TriangularPrism(Double.parseDouble(array[i + 1]), Double.parseDouble(array[i + 2]));
                } 
                else if (array[i].equals("PentagonalPrism")) {
                    shapeArray[index] = new PentagonalPrism(Double.parseDouble(array[i + 1]), Double.parseDouble(array[i + 2]));
                } 
                else if (array[i].equals("SquarePrism")) {
                    shapeArray[index] = new SquarePrism(Double.parseDouble(array[i + 1]), Double.parseDouble(array[i + 2]));
                } // Pyramid
                else if (array[i].equals("Pyramid")) {
                    shapeArray[index] = new Pyramid(Double.parseDouble(array[i + 1]), Double.parseDouble(array[i + 2]));
                }
                index++;
            } else {
                // Reset index when it reaches the size limit
                index = 0;
            }
        }
        return shapeArray;
    }

    
    
    
    
    
}
