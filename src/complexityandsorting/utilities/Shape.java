package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public abstract class Shape implements Comparable<Shape>{
    private double height;

    private double baseArea;
    private double volume;
    
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

    public double getBaseArea()
    {
        return this.baseArea;
    }
    protected void setBaseArea(double baseArea)
    {
        this.baseArea = baseArea;
    }

    public double getVolume()
    {
        return this.volume;
    }
    protected void setVolume(double volume)
    {
        this.volume = volume;
    }
    
    protected abstract void calculateBaseArea();
    protected abstract void calculateVolume();

    @Override 
    public int compareTo(Shape otherShape) {
        if (this.height > otherShape.height)
            return 1;
        else if (this.height < otherShape.height)
            return -1;
        else 
            return 0;
    }

    @Override
    public String toString(){
        return "Height: " + getHeight();
    }
}
