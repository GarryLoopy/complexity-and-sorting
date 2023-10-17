/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers;

/**
 *
 * @author garry
 */
public class Cylinder extends Circle{
    
    public Cylinder(double height, double radius)
    {
        super(height, radius);
    }
    
    @Override
    public double calculateVolume() 
    {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }
}
