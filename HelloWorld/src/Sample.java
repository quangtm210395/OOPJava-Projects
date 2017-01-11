/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minnnnn
 */
public class Sample {

    public static void main(String[] args) {
        System.out.println("Hello Wolrd");
        System.out.println("Java OOP");
        System.out.println(" ");
        int s = 0;
        double a = 2.1;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        while (true) {
            break;
        }

        String str = "Hello java";
        String str2;
        str2 = "Tran Minh Quang";
        System.out.println(str);
        System.out.println(str2);
        String str3 = "a";
        System.out.println(str3);
        int a$ = 0;
        System.out.println(a);
        int i = 5;
        i = i++ + ++i;//12
        System.out.println(i);
        int x = 6;
        int b = 7;
        int c = 8;
        int z = 0;
        z = (a == x) ? b : c;//tam phan
        System.out.println(z);
        double ax = z;//implicit
        z = (int) 3.4; //explicit
        int[] aa = new int[]{1, 2, 3, 4, 5};
        //String [] aa = new String[]{"bac","hoc"};
        for (int xx : aa) {
            System.out.println(xx);
        }
        //voi switch case thi bien khong duoc la float double
        int studentCode = 1;
    }
}
