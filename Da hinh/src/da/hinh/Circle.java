/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.hinh;

/**
 *
 * @author Minnnnn
 */
public class Circle {
    private int x;
    private int y;
    private float radius;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public void draw(){
        System.out.println("Day la hinh tron tai " +this.x +" "+ this.y);
    }
    
    public float area(){
        return( (float)(this.radius * this.radius *3.14));
    }
}
