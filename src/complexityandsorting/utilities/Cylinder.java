package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class Cylinder extends Circle{
    
    public Cylinder(double height, double radius)
    {
        super(height, radius);
    }
    
    @Override
    protected void calculateVolume() 
    {
        setVolume(Math.PI * Math.pow(getRadius(), 2) * getHeight());
    }
}
