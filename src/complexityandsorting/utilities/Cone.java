package complexityandsorting.utilities;

/**
 * Represents a cone
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class Cone extends Circle{

    /**
     * Represents a cone 
     * @param height the height of the cone
     * @param radius the radius of the cone
     */
    public Cone(double height, double radius) {
        super(height, radius);
    }

    /**
     * Calculates volume of the cone
     */
    @Override
    protected void calculateVolume()
    {
        setVolume((1 / 3.0) * Math.PI * Math.pow(getRadius(), 2) * getHeight());
    }
    
    /**
     * ToString method for cone
     * @return the string representation of the circle 
     */
    @Override
    public String toString() {
        return "Cone\n"+ super.toString();
    }

}
