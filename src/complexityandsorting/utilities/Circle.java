/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.utilities;

/**
 *
 * @author garry
 */
public abstract class Circle  extends Shape{
    private double radius;

    public Circle(double height, double radius) {
        super(height);
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }
    
    @Override
    public double calculateBaseArea()
    {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
