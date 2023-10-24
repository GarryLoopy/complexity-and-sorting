package complexityandsorting.utilities;

/**
 * Represents a cylinder
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class Cylinder extends Circle{
    
    /**
     * Constructor for the cylinder
     * @param height the height of the cylinder
     * @param radius the radius of the cylinder
     */
    public Cylinder(double height, double radius)
    {
        super(height, radius);
    }
    
    /**
     * Calculates the volume for the cylinder
     */
    @Override
    protected void calculateVolume() 
    {
        setVolume(Math.PI * Math.pow(getRadius(), 2) * getHeight());
    }
    
    /**
     * ToString method for cone
     * @return the string representation of the circle 
     */
    @Override
    public String toString() {
        return "Cylinder\n"+ super.toString();
    }
}
