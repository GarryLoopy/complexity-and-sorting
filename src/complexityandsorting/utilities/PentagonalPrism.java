package complexityandsorting.utilities;

/**
 * Represents a pentagonal prism
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class PentagonalPrism extends Prism{
    
    /**
     * Constructor for the prism
     * @param height the height of the pentagonal prism
     * @param edge the edge of the pentagonal prism
     */
    public PentagonalPrism(double height, double edge)
    {
        super(height, edge);
    }
    
    /**
     * Calculates the base area of the pentagonal prism
     */
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea((5.0 * Math.pow(getEdge(), 2) * Math.tan(Math.toRadians(54))) / 4.0);
    }

    /**
     * Calculates the volume of the pentagonal prism
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
        return "Pentagonal Prism\n" + super.toString();
    }
    
}
