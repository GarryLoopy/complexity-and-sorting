package complexityandsorting;

import static ZacksStuff.arrayManiplulation.arrayCopy;
import complexityandsorting.drivers.Pyramid;
import complexityandsorting.drivers.Shape;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
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
        
        int x = args.length;
        String pram1 = args[0];
        String pram2 = args[1];
        String pram3 = args[2];
        
        String a[] = null;
        String b[] = null;
        a[0] = "H";
        a[1] = "e";
        a[2] = "l";
        a[3] = "l";
        a[4] = "o";
        
        arrayCopy(a,b);
        
        
        
        
        
        
//        try {
//            String one = args[0];
//            String two = args[1];
//            String three = args[2];
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException caught");
//            
//        }
//        finally{
//            
//        }
        
       
        
        
//        for (int i = 0; i > args.length; i++){
//            String firstP;
//            String secondP;
//            String thirdP;
//            
//            if(args.length == 0 ){
//                System.out.println("No parameters were set.");
//            }
//            if (args.length == 1 ){
//                secondP = args[0];
//            }
//            if (args.length == 2 ){
//                secondP = args[1];
//            }
//            if (args.length == 3 ){
//                secondP = args[2];
//            }
//            else{
//                System.out.println("Parameter Overload.");
//            }
//        }
        
//        switch(x){
//            case 0:
//                System.out.println("There is 0 parameter");
//                break;
//            case 1:
//                System.out.println("There is 1 parameter");
//                break;
//            case 2:
//                System.out.println("There is 2 parameter");
//                break;
//            case 3:
//                System.out.println("There is 3 parameter");
//                break;
//        }
        
        // TODO code application logic here
        
        
        System.out.println("Program run successfully");
        System.out.print("\n");
        System.out.println("Program run successfully");
        
        //reading the first line //make its it's own class later
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\SEMFALLSEP2023-DEC2024\\OBJECTORIENTEDPROGRAMMING-3\\ASSIGNNMENTS\\complexity-and-sorting\\src\\data\\test.txt"));
           String line = reader.readLine();
            System.out.println(line);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ComplexityAndSorting.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //making 20 instances of a class
//        Shape[] instances = new Shape[20];
//        double height = 22.2;
//        double edge = 33.3;
//        for(int i = 0; i < 20; i++){
//            instances[i] = new Pyramid(height-1, edge-1);
//        }
//        
//        for (Shape instance : instances){
//            System.out.println(instance.getEdge());
//            }
        
        

    }

    
    
    
}
