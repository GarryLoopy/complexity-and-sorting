package complexityandsorting;

import static ZacksStuff.arrayManiplulation.fistTwo;
import ZacksStuff.fileReading;
import static ZacksStuff.fileReading.convertToFileFormat;
import static ZacksStuff.fileReading.readFileShapes;
import complexityandsorting.drivers.Circle;
import complexityandsorting.drivers.Cylinder;
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
            
            if (pram.contains("-f")){
                //read file + make objects + add to list

                List<Shape> mshapeList = readFileShapes(pram);
                
                //just seeing the list
                System.out.println("-------------");
                for (Shape shape : mshapeList) {
                    System.out.println("This is a " + shape.getShapeName());
                    System.out.println("Height: " + shape.getHeight());
                    System.out.println("Radius: " + ((Circle) shape).getRadius());
                    System.out.println("-------------");
                }
            }
            else if (pram.contains("-th")){
                System.out.println("hi im paul");
                
            }
            else if (pram.contains("-tv")){
                System.out.println("hi im steeeeeeeven");
                
            }
            else if (pram.contains("-s1")){
                
            }
            else if (pram.contains("-s2")){
                
            }
            else if (pram.contains("-s3")){
                
            }
            else if (pram.contains("-s4")){
                
            }
            else if (pram.contains("-s5")){
                
            }
            else{
                System.out.println("Invalid input!");
            }
        }
    }
}
