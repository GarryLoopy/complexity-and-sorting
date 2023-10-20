package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class SquarePrism extends Prism{
    
    public SquarePrism(double height, double edge)
    {
        super(height, edge);
    }
    
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea(Math.pow(getEdge(), 2));
    }
    @Override
    protected void calculateVolume()
    {
        setVolume(Math.pow(getEdge(), 2) * getHeight());
    }
}
