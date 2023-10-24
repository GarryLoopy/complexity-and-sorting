package complexityandsorting.utilities;

/**
 * Represents overall abstract shape, all types of shape inherits from this class
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */

public abstract class Shape implements Comparable<Shape>{
    private double height;

    private double baseArea;
    private double volume;
    
    /**
     * Constructor
     * @param height the height of the shape
     */
    public Shape(double height)
    {
        this.height = height;
    }
    
    /**
     * Getter for height
     * @return the height of the shape
     */
    public double getHeight()
    {
        return this.height;
    }

    /**
     * Setter for height
     * @param height the new height of the shape
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /** 
     * Getter for height
     * @return the base area of the shape
     */
    public double getBaseArea()
    {
        return this.baseArea;
    }

    /**
     * Setter for height
     * @param baseArea the new base area of the shape
     */
    protected void setBaseArea(double baseArea)
    {
        this.baseArea = baseArea;
    }

    /**
     * Getter for volume
     * @return
     */
    public double getVolume()
    {
        return this.volume;
    }

    /**
     * Setter for volume
     * @param volume
     */
    protected void setVolume(double volume)
    {
        this.volume = volume;
    }
    
    /**
     * Calculates base area
     */
    protected abstract void calculateBaseArea();

    /**
     * Caculates volume
     */
    protected abstract void calculateVolume();

    /**
     * Compares this shape to the other shape by height
     * @param otherShape
     * @return 1 is this shape is greater than the other shape, -1 is lesser, and 0 if equal
     */
    @Override 
    public int compareTo(Shape otherShape) {
        if (this.height > otherShape.height)
            return 1;
        else if (this.height < otherShape.height)
            return -1;
        else 
            return 0;
    }

    /**
     * ToString method for the shape
     * @return the string representation of the shape
     */
    @Override
    public String toString(){
        return "Height: " + getHeight();
    }
}
