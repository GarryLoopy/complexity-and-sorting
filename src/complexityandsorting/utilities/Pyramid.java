package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class Pyramid extends Shape{
    private double edge;
    
    public Pyramid(double height, double edge)
    {
        super(height);
        this.edge = edge;
    }
    
    public double getEdge() 
    {
        return this.edge;
    }
    public void setEdge(double edge)
    {
        this.edge = edge;
    }
    
    @Override
    public double calculateBaseArea()
    {
        return Math.pow(getEdge(), 2);
    }
    @Override
    public double calculateVolume() 
    {
        return (1 / 3) * Math.pow(getEdge(), 2) * getHeight();
    }

    @Override
    public String toString() {
        return super.toString() + "\nEdge: " + getEdge() + "\nVolume: " + calculateVolume() + "\nArea: " + calculateBaseArea() + "\n";
    }
}
