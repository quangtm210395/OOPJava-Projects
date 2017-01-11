/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.hinh.thua.ke;

/**
 *
 * @author Minnnnn
 */
public class Circle extends Shape{
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(float radius, int x, int y, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Day la hinh tron tai "+ getX()+ " "+ getY());
//        super.draw(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float area() {
        return(this.radius*this.radius*(float)3.14);
//        return super.area(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
