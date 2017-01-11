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
public class DaHinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rec1= new Rectangle(10, 10, 5, 4);
        rec1.draw();
        Rectangle rec2= new Rectangle(9, 7, 4, 2);
        rec2.draw();
        Circle cir1 = new Circle(2, 3, (float)2.5);
        cir1.draw();
        Circle cir2 = new Circle(1, 6, (float)4.5);
        cir2.draw();
        Triangle tri1= new Triangle(1, 2, 3, 4, 5, 6);
        tri1.draw();
        Triangle tri2 = new Triangle(1, 1, 2, 2, 3, 3);
        tri2.draw();
        
                
    }
    
}
