/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Minnn
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public class P {

        private int a;
        private int b;

        public void seta(int a) {
            this.a = a;
        }

        public int geta() {
            return this.a;
        }

        public void setb(int b) {
            this.b = b;
        }

        public int getb() {
            return this.b;
        }
    }

    void test() {
        int i;
        int j;
        i = 1;
        j = 2;
        P p1;
        p1 = new P();
        P p2 = new P();
//        p2 = p1;
        p1.a = i;
        p1.b = j;
        
        p2.a = i++;
        p2.b = ++i;
        p1.a = i++;
        p1.b = ++i;
        System.out.println(p1.a+"\t"+p1.b+'\t'+p2.a+'\t'+p2.b);
    }

    public static void main(String[] args) {
        JavaApplication3 j = new JavaApplication3(); j.test();
    }

}
