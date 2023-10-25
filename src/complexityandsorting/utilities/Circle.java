package complexityandsorting.utilities;

/**
 * Represents a circle
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public abstract class Circle  extends Shape{
    private double radius;

    /**
     * Constructor for Circle
     * @param height height of the circle
     * @param radius radius of the circle
     */
    public Circle(double height, double radius) {
        super(height);
        this.radius = radius;

        calculateBaseArea();
        calculateVolume();
    }
    
    /**
     * Getter for radius
     * @return the radius of the circle
     */
    public double getRadius()
    {
        return this.radius;
    }

    /**
     * Setter for the radius
     * @param radius the new radius of the circle
     */
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    /**
     * Calculates the base area for the circle
     */
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea(Math.PI * Math.pow(getRadius(), 2));
    }

    /**
     * ToString method for circle
     * @return the string representation of the circle 
     */
    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + getRadius() + "\nVolume: " + getVolume() + "\nArea: " + getBaseArea() + "\n";
    }
}
