package complexityandsorting;

import static ZacksStuff.arrayManiplulation.fistTwo;
import static ZacksStuff.displayer.displayShapes;
import ZacksStuff.fileReading;
import static ZacksStuff.fileReading.convertToFileFormat;
import static ZacksStuff.fileReading.readFileShapes;
import comparator.baseAreaComparator;
import comparator.heightComparator;
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
import static sorting.sort.bubbleSortBA;
import static sorting.sort.bubbleSortH;
import static sorting.sort.bubbleSortV;
import static sorting.sort.heapSortBA;
import static sorting.sort.heapSortH;
import static sorting.sort.heapSortV;
import static sorting.sort.insersionSortBA;
import static sorting.sort.insersionSortH;
import static sorting.sort.insersionSortV;
import static sorting.sort.mergeSortBA;
import static sorting.sort.mergeSortH;
import static sorting.sort.mergeSortV;
import static sorting.sort.quickSortBA;
import static sorting.sort.quickSortH;
import static sorting.sort.quickSortV;
import static sorting.sort.selectionSortBA;
import static sorting.sort.selectionSortH;
import static sorting.sort.selectionSortV;

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

        System.out.println("-------------");
        Shape[] mshapeList = null;
        String state = "";
        for (String pram : args) {            
            
            if (pram.contains("-f")) {
                mshapeList = readFileShapes(pram);
            }
            else if (pram.contains("-th")) {
                state = "h";
            }
            else if (pram.contains("-ta")) {
                state = "ba";
            }
            else if (pram.contains("-tv")) {
                state = "v";
            }
            
            if (state.equals("h")){
                if (pram.contains("-sb")) {
                    bubbleSortH(mshapeList);
                    ////////////////////////////////////////////////////////////////////////////currently trying to acess this from any orrder
                    System.out.println("this is -th and -sb");
                } 
                else if (pram.contains("-si")) {
                    insersionSortH(mshapeList);
                } 
                else if (pram.contains("-ss")) {
                    selectionSortH(mshapeList);
                }
                else if (pram.contains("-sm")) {
                    mergeSortH(mshapeList);
                } 
                else if (pram.contains("-sq")) {
                    quickSortH(mshapeList);
                } 
                else if (pram.contains("-sh")) {
                    heapSortH(mshapeList);
                }
            } 
              
            if (state.equals("v")){
                if (pram.contains("-sb")) {
                    bubbleSortV(mshapeList);
                } 
                else if (pram.contains("-si")) {
                    insersionSortV(mshapeList);
                } 
                else if (pram.contains("-ss")) {
                    selectionSortV(mshapeList);
                } //mege sort
                else if (pram.contains("-sm")) {
                    mergeSortV(mshapeList);
                } 
                else if (pram.contains("-sq")) {
                    quickSortV(mshapeList);
                } 
                else if (pram.contains("-sh")) {
                    heapSortV(mshapeList);
                }
            } 
                    
            if (state.equals("ba")) {
                if (pram.contains("-sb")) {
                    bubbleSortBA(mshapeList);
                } 
                else if (pram.contains("-si")) {
                    insersionSortBA(mshapeList);
                } 
                else if (pram.contains("-ss")) {
                    selectionSortBA(mshapeList);
                } //mege sort
                else if (pram.contains("-sm")) {
                    mergeSortBA(mshapeList);
                } 
                else if (pram.contains("-sq")) {
                    quickSortBA(mshapeList);
                } 
                else if (pram.contains("-sh")) {
                    heapSortBA(mshapeList);
                }
            }
            
            
        }
        displayShapes(mshapeList);
    }
}
