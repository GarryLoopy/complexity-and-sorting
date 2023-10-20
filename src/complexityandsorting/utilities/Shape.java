package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public abstract class Shape implements Comparable<Shape>{
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
