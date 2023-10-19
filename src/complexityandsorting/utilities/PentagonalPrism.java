/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.utilities;

/**
 *
 * @author garry
 */
public class PentagonalPrism extends Prism{
    
    public PentagonalPrism(double height, double edge)
    {
        super(height, edge);
    }
    
    @Override
    public double calculateBaseArea()
    {
        return (5.0 * Math.pow(getEdge(), 2) * Math.tan(Math.toRadians(54))) / 4.0;
    }
    @Override
    public double calculateVolume()
    {
        return calculateBaseArea() * getHeight();
    }
    
}
