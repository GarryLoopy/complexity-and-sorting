/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers;

/**
 *
 * @author garry
 */
public class SquarePrism extends Prism{
    
    public SquarePrism(double height, double radius)
    {
        super(height, radius);
    }
    
    @Override
    public double calculateBaseArea()
    {
        return Math.pow(getEdge(), 2);
    }
    @Override
    public double calculateVolume()
    {
        return Math.pow(getEdge(), 2) * getHeight();
    }
}
