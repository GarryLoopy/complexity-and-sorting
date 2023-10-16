/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers;

/**
 *
 * @author garry
 */
public class Pyramid extends Shape{
    private double edge;
    
    public double getEdge() 
    {
        return this.edge;
    }
    public void setEdge(double edge)
    {
        this.edge = edge;
    }
    
    @Override
    public double calculateBaseArea()
    {
        throw new UnsupportedOperationException();
    }
    @Override
    public double calculateVolume() 
    {
        throw new UnsupportedOperationException();
    }
}
