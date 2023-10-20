package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public abstract class Prism extends Shape{
    private double edge;
    
    public Prism(double height, double edge)
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
    public String toString() {
        return super.toString() + "\nEdge: " + getEdge() + "\nVolume: " + calculateVolume() + "\nArea: " + calculateBaseArea() + "\n";
    }
}
