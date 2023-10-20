package complexityandsorting.utilities;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class PentagonalPrism extends Prism{
    
    public PentagonalPrism(double height, double edge)
    {
        super(height, edge);
    }
    
    @Override
    protected void calculateBaseArea()
    {
        setBaseArea((5.0 * Math.pow(getEdge(), 2) * Math.tan(Math.toRadians(54))) / 4.0);
    }
    @Override
    protected void calculateVolume()
    {
        setVolume(getBaseArea() * getHeight());
    }
    
}
