/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author tran Hoang Phuc
 */
public class Box extends Rectangle implements PropertyOfShapes{
    private int height;

    public Box() {
    }

    public Box(int height) {
        this.height = height;
    }

    public Box(int height, int length, int width) {
        super(length, width);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" + super.toString() + "height=" + height +"}";
    }

    @Override
    public double getPerimeter() {
        return 4 * (length + width + height);
    }

    @Override
    public double getArea() {
        return 2 * (length + width) + 2 * (length + height) + 2 * (width + height);
    }
    
    
}
