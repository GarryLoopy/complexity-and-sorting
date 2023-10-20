package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class OctagonalPrism extends Prism{
    
    public OctagonalPrism(double height, double edge)
    {
        super(height, edge);
    }
    
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea(2.0 * (1 + Math.sqrt(2)) * Math.pow(getEdge(), 2));
    }
    @Override
    protected void calculateVolume()
    {
        setVolume(getBaseArea() * getHeight() / 4.0);
    }
}
