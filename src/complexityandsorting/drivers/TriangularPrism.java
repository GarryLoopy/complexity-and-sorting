/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers;

/**
 *
 * @author garry
 */
public class TriangularPrism extends Prism{
    
    public TriangularPrism(double height, double radius)
    {
        super(height, radius);
    }
    
    @Override
    public double calculateBaseArea()
    {
        return (Math.sqrt(3) / 4) * Math.pow(getEdge(), 2);
    }
    @Override
    public double calculateVolume()
    {
        return calculateBaseArea() * getHeight();
    }

    @Override
    public String getShapeName() {
        return "Triangular Prisim";
    }
}
