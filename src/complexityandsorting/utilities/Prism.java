package complexityandsorting.utilities;

/**
 * Represents a prism where all types of prism inherit from
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public abstract class Prism extends Shape{
    private double edge;
    
    /**
     * Constructor for prism
     * @param height
     * @param edge
     */
    public Prism(double height, double edge)
    {
        super(height);
        this.edge = edge;

        calculateBaseArea();
        calculateVolume();
    }
    
    /**
     * Getter for edge
     * @return the edge of the prism
     */
    public double getEdge() 
    {
        return this.edge;
    }

    /**
     * Setter for the edge
     * @param edge the new edge for the prism
     */
    public void setEdge(double edge)
    {
        this.edge = edge;
    }

    /**
     * The ToString method for the prism
     * @return a string representation of the prism
     */
    @Override
    public String toString() {
        return super.toString() + "\nEdge: " + getEdge() + "\nVolume: " + getVolume() + "\nArea: " + getBaseArea() + "\n";
    }
}
