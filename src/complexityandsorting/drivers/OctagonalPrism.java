/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers;

/**
 *
 * @author garry
 */
public class OctagonalPrism extends Prism{
    
    public OctagonalPrism(double height, double edge)
    {
        super(height, edge);
    }
    
    @Override
    public double calculateBaseArea()
    {
        return 2.0 * (1 + Math.sqrt(2)) * Math.pow(getEdge(), 2);
    }
    @Override
    public double calculateVolume()
    {
        return calculateBaseArea() * getHeight() / 4.0;
    }

    @Override
    public String getShapeName() {
        return "Octagonal Prisim";
    }
}
