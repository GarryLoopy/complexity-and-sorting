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
    
    public Pyramid(double height, double edge)
    {
        super(height);
        this.edge = edge;
    }
    
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
        return Math.pow(getEdge(), 2);
    }
    @Override
    public double calculateVolume() 
    {
        return (1 / 3) * Math.pow(getEdge(), 2) * getHeight();
    }
}
