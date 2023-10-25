/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexityandsorting.drivers;

/**
 *
 * @author garry
 */
public abstract class Shape implements Comparable<Shape>{
    private double height;
    
    /**
     *
     * @param height
     */
    public Shape(double height)
    {
        this.height = height;
    }
    
    public double getHeight()
    {
        return this.height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public abstract double calculateBaseArea();
    public abstract double calculateVolume();

    public abstract String getShapeName();
    //compare two shapes by height using comparable
    @Override
    public int compareTo(Shape o){
        return Double.compare(o.height, this.height);
    }
    
    
}
