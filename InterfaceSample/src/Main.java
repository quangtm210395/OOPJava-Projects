/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minnn
 */

interface ccc{
    
}

interface cccc{
    
}


interface Calculation{
    int giaithua(int n);
    int mu(int n, int m);
    final double pi = 3.14;
}

abstract class CalculationClass implements ccc,cccc{
    abstract int giaithua(int n);
    abstract int mu(int n, int m);
    double sqrt(double n){
        return Math.sqrt(n);
    }
}

class calculateClass extends CalculationClass{

    @Override
    int giaithua(int n) {
        int gt= 1;
        for (int i = 1; i < n; i++) {
            gt *= i;
        }
        return gt; 
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int mu(int n, int m) {
        int M = 1;
        for (int i = 1; i <= m; i++) {
            M *= n;
        }
        return M;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class calculate implements Calculation{

    @Override
    public int giaithua(int n) {
        int gt= 1;
        for (int i = 1; i < n; i++) {
            gt *= i;
        }
        return gt;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int mu(int n, int m) {
        int M = 1;
        for (int i = 1; i <= m; i++) {
            M *= n;
        }
        return M;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class Main {
    static{
        System.out.println("aaaa");
    }

    public static void main(String[] args) {
//        calculate c = new calculate();
//        System.out.println("GT " + c.giaithua(10));
//        System.out.println("Mu " + c.mu(2,5));
//        
//        calculateClass d = new calculateClass();
//        System.out.println("Sqrt: " + d.sqrt(81));
        
        Student s1 = new Student();
        Student s2 = new Student();
        s1.input();
        s2.input();
        
        Student.hocphi = 2400;
        Student.inHocPhi();
        
        if (s1.compareTo(s2) > 0)
            System.out.println("s1 > s2");
        else if (s1.compareTo(s2) < 0)
            System.out.println("s1 < s2");
        else 
            System.out.println("====");
    }
}
