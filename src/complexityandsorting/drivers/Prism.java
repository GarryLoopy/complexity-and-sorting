/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers;

/**
 *
 * @author garry
 */
public abstract class Prism extends Shape{
    private double edge;
    
    public Prism(double height, double edge)
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
}
