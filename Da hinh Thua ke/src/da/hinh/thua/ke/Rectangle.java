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
public class Rectangle extends Shape{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public Rectangle(int x, int y, String color){
        super(x,y,color);
    }

    public Rectangle(int width, int height, int x, int y, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    
    
    @Override
    public void draw() {
//        super.draw();
        System.out.println("Tao la hinh chu nhat tai "+ getX() +" "+ getY()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float area() {
//        return super.area(); //To change body of generated methods, choose Tools | Templates.
        return(this.height*this.width);
    }
    
    
    
}
