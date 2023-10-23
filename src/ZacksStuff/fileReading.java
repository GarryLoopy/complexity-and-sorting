/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZacksStuff;

import complexityandsorting.drivers.Cone;
import complexityandsorting.drivers.Cylinder;
import complexityandsorting.drivers.Shape;
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
            
            if (array[i].equals("Cylinder") == true){
                shapeList.add(new Cylinder(Double.parseDouble(array[i+1]), Double.parseDouble(array[i+2])));
            }
            else if (array[i].equals("Cone") == true){
                shapeList.add(new Cone(Double.parseDouble(array[i+1]), Double.parseDouble(array[i+2])));
                
            }
           
        }
        return shapeList;
        
        
        
        
    }
    
    
    
    
    
}
