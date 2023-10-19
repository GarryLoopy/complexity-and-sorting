package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public abstract class Shape {
    private double height;
    
    public Shape(double height)
    {
        this.height = height;
    }
    
    public double getHeight()
    {
        return this.height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public abstract double calculateBaseArea();
    public abstract double calculateVolume();
}
