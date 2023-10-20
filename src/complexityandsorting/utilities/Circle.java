package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public abstract class Circle  extends Shape{
    private double radius;

    public Circle(double height, double radius) {
        super(height);
        this.radius = radius;

        calculateBaseArea();
        calculateVolume();
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea(Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + getRadius() + "\nVolume: " + getVolume() + "\nArea: " + getBaseArea() + "\n";
    }
}
