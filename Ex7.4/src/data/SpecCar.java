/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author tran Hoang Phuc
 */
public class SpecCar extends Car {

    private int type;

    public SpecCar(int type) {
        this.type = type;
    }

    public SpecCar(int type, String maker, int price) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }

    public void setData() {
        maker = "XZ" + maker;
        price += 20;
    }
    
    public int getValue() {
        if (type < 7) {
            return price + 10;
        } else{
            return price + 15;
        }
    }
}
