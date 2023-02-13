/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author tran Hoang Phuc
 */
public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setValue(int length) {
        this.length = length;
    }
    
    public void setValue(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "length=" + length + ", width=" + width;
    }
    
}
