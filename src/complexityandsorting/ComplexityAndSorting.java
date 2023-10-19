package complexityandsorting;

import complexityandsorting.utilities.Cone;
import complexityandsorting.drivers.Sort;

import complexityandsorting.drivers.ShapeVolumeCompare;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class ComplexityAndSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program runs successfully");
        
        Cone[] cones = generateRandomCones(5);
        
        Sort.Bubble(cones);
//        Sort.Bubble(cones, new ShapeVolumeCompare());
        
        PrintCones(cones);
        
    }
    
    public static void PrintCones(Cone[] shapes)
    {
        for (Cone shape : shapes)
        {
            System.out.println("Height: " + shape.getHeight());
            System.out.println("Radius: " + shape.getRadius());
            System.out.println("Volume: " + shape.calculateVolume());
            System.out.println();
        }
        
        
    }
    
    
    public static Cone[] generateRandomCones(int amount)
    {
        Cone[] cones = new Cone[amount];
        for (int i = 0; i < amount; i++)
        {
            cones[i] = new Cone(
                    Math.random() * 100, 
                    Math.random() * 100
            );
        }
        
        return cones;
    }
    
}
