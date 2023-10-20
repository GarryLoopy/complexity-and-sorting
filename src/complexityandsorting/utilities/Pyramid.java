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

        calculateBaseArea();
        calculateVolume();
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
    protected void calculateBaseArea()
    {
        setBaseArea(Math.pow(getEdge(), 2));
    }
    @Override
    protected void calculateVolume() 
    {
        setVolume((1 / 3) * Math.pow(getEdge(), 2) * getHeight());
    }

    @Override
    public String toString() {
        return super.toString() + "\nEdge: " + getEdge() + "\nVolume: " + getVolume() + "\nArea: " + getBaseArea() + "\n";
    }
}
