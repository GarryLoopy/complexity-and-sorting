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
    public static List<Shape> readFileShapes(String filePath) throws IOException{
                
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
    public static List<Shape> makeShapeObjects(String[] array){
        
        int size = Integer.parseInt(array[0]);
        List<Shape> shapeList = new ArrayList<>();
        
        for (int i = 1; i < array.length; i++){
            
            //circles
            if (array[i].equals("Cylinder") == true){
                shapeList.add(new Cylinder(Double.parseDouble(array[i+1]), Double.parseDouble(array[i+2])));
            }
            else if (array[i].equals("Cone") == true){
                shapeList.add(new Cone(Double.parseDouble(array[i+1]), Double.parseDouble(array[i+2])));
            }
            
            //prisims
            else if (array[i].equals("OctagonalPrism") == true){
                shapeList.add(new OctagonalPrism(Double.parseDouble(array[i+1]), Double.parseDouble(array[i+2])));
            }
            else if (array[i].equals("TriangularPrism") == true){
                shapeList.add(new TriangularPrism(Double.parseDouble(array[i+1]), Double.parseDouble(array[i+2])));
            }
            else if (array[i].equals("PentagonalPrism") == true){
                shapeList.add(new PentagonalPrism(Double.parseDouble(array[i+1]), Double.parseDouble(array[i+2])));
            }
            else if (array[i].equals("SquarePrism") == true){
                shapeList.add(new SquarePrism(Double.parseDouble(array[i+1]), Double.parseDouble(array[i+2])));
            }
            
            //pryamid
            else if (array[i].equals("Pyramid") == true){
                shapeList.add(new Pyramid(Double.parseDouble(array[i+1]), Double.parseDouble(array[i+2])));
            }
            
           
        }
        return shapeList;
        
        
        
        
    }
    
    
    
    
    
}
