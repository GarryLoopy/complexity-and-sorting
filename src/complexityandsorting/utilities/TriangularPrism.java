package complexityandsorting.utilities;

/**
 * Represents a triangular prism
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class TriangularPrism extends Prism{
    
    /**
     * Constructor for the prism
     * @param height the height of the prism
     * @param edge the edge of the prism
     */
    public TriangularPrism(double height, double edge)
    {
        super(height, edge);
    }
    
    /**
     * Calculates base area
     */
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea((Math.sqrt(3) / 4) * Math.pow(getEdge(), 2));
    }

    /**
     * Calculates volume
     */
    @Override
    protected void calculateVolume()
    {
        setVolume(getBaseArea() * getHeight());
    }
    
    /**
     * The ToString method for the prism
     * @return a string representation of the prism
     */
    @Override
    public String toString() {
        return "Triangular Prism\n" + super.toString();
    }
}
