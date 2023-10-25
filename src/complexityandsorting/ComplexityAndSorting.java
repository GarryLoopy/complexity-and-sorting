package complexityandsorting;

import static ZacksStuff.arrayManiplulation.fistTwo;
import ZacksStuff.fileReading;
import static ZacksStuff.fileReading.convertToFileFormat;
import static ZacksStuff.fileReading.readFileShapes;
import complexityandsorting.drivers.Circle;
import complexityandsorting.drivers.Cylinder;
import complexityandsorting.drivers.Prism;
import complexityandsorting.drivers.Pyramid;
import complexityandsorting.drivers.Shape;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author garry
 */
public class ComplexityAndSorting {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        for (String pram : args){
            
            //file reading
            if (pram.contains("-f")){
                //read file + make objects + add to list
                
                Shape[] mshapeList = readFileShapes(pram);
                
                //just seeing the list
                System.out.println("-------------");
                System.out.println(mshapeList[2].compareTo(mshapeList[4])); 
                //System.out.println(mshapeList[4]);
//                for (Shape shape : mshapeList) {
//                    if (shape instanceof Circle circle){
//                        System.out.println("This is a " + shape.getShapeName());
//                        System.out.println("Height: " + shape.getHeight());
//                        System.out.println("Radius: " + circle.getRadius());
//                        System.out.println("Base area: " + circle.calculateBaseArea());
//                        System.out.println("-------------");
//                    }
//                    else if (shape instanceof Prism prism) {
//                        System.out.println("This is a " + shape.getShapeName());
//                        System.out.println("Height: " + shape.getHeight());
//                        System.out.println("Edge: " + prism.getEdge());
//                        System.out.println("-------------");
//                    }
//                    else if (shape instanceof Pyramid pyramid) {
//                        System.out.println("This is a " + shape.getShapeName());
//                        System.out.println("Height: " + shape.getHeight());
//                        System.out.println("Edge: " + pyramid.getEdge());
//                        System.out.println("-------------");
//                    }  
//                }
            }
            
            //t
                //height
            else if (pram.contains("-th")){
                System.out.println("hi im paul");
            }
                //volume
            else if (pram.contains("-tv")){
                System.out.println("hi im steeeeeeeven");
            }
                //base area
            else if (pram.contains("-ta")){
                System.out.println("a");
                
            }
            
            
            //sorting
                //bubble sort
            else if (pram.contains("-sb")){
                
            }
                //insersion sort
            else if (pram.contains("-si")){
                
            }
                //selection sort
            else if (pram.contains("-ss")){
                
            }
                //mege sort
            else if (pram.contains("-sm")){
                
            }
                //quick sort
            else if (pram.contains("-sq")){
                
            }
                //my sort method
            else if (pram.contains("-s6")){
                
            }
            else{
                System.out.println("Invalid input!");
            }
        }
    }
}
