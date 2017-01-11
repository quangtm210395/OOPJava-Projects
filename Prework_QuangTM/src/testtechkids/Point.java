/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtechkids;

/**
 *
 * @author Tran Minh Quang
 */
public class Point {
    private int x;
    private int y;
    private boolean ngang;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, boolean ngang) {
        this.x = x;
        this.y = y;
        this.ngang = ngang;
    }

    public boolean isNgang() {
        return ngang;
    }

    public void setNgang(boolean ngang) {
        this.ngang = ngang;
    }
    
    public void deny() {
        this.x = -1;
        this.y = -1;
    }
    
    public boolean isDenied(){
        return this.x == -1 && this.y == -1;
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
    
    public boolean equals(Point point) {
        return (this.x == point.x && this.y == point.y);
    }
    
    public Point left() {
        return new Point(this.x - 1, this.y);
    }
    
    public Point right() {
        return new Point(this.x + 1, this.y);
    }
    
    public Point top() {
        return new Point(this.x, this.y - 1);
    }
    
    public Point bottom() {
        return new Point(this.x, this.y + 1);
    }
    
}
