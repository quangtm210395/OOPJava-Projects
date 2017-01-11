
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minnn
 */
public class Student implements Comparable{
    static int hocphi;
    int age;
    double mark;
    {
        System.out.println("cccc");
    }
    static public void inHocPhi(){
        System.out.println(hocphi);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
            System.out.println("Nhap age: ");
            age = sc.nextInt();
            if (age <= 0)
                throw new Exception();
            System.out.println("Nhap mark: ");
            mark = sc.nextDouble();
            break;
        }catch(Exception e){
            sc.nextLine();
            System.out.println("Error! Re-input Please!");
        }
        }
        
    }

    public Student() {
    }

    
    public Student(int age, double mark) {
        this.age = age;
        this.mark = mark;
    }
    
    
    @Override
    public int compareTo(Object o) {
        Student min = (Student) o;
        if (this.age > min.age && this.mark > min.mark )
            return 1;
        if (this.age < min.age && this.mark < min.mark)
            return -1;
        return 0;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
