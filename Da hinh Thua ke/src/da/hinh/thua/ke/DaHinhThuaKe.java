/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da.hinh.thua.ke;

import java.util.Vector;

/**
 *
 * @author Minnnnn
 */
public class DaHinhThuaKe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rec1 = new Rectangle(1, 2, 3, 4, "vang");
        Rectangle rec2 = new Rectangle(6, 7, 8, 9, "den");

//        rec1.draw();
//        rec2.draw();
        Circle cir1 = new Circle(1, 1, 5, "tim");
        Circle cir2 = new Circle(2, 4, 6, "vang");
//        cir1.draw();
//        cir2.draw();

        Vector<Shape> shapeManager = new Vector<Shape>();
        shapeManager.add(rec1);
        shapeManager.add(rec2);
        shapeManager.add(cir1);
        shapeManager.add(cir2);

//        for (int i=0; i<100; i++){
//            Shape s = new Rectangle(i, i, i, i, "red");
//            shapeManager.add(s);
//        }
        for (int i = 0; i < shapeManager.size(); i++) {
            Shape shape = shapeManager.get(i);// tuong duong a[i]
            shapeManager.get(i).draw();
            if (shape instanceof Rectangle) {
                System.out.println("S Rectangle: " + shape.area());
            } else if (shape instanceof Circle) {
                System.out.println("S Circle: " + shape.area());
            }
        }
    }

}
