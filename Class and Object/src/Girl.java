/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Minnnnn
 */
public class Girl {
    private int v1,v2,v3;
    private String name;

    public Girl(int v1, int v2, int v3, String name) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.name = name;
    }

    public Girl() {
    }


    public void accept(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter Vong 1: ");
        v1 = sc.nextInt();
        System.out.println("Enter Vong 2: ");
        v2 = sc.nextInt();
        System.out.println("Enter Vong 3: ");
        v3 = sc.nextInt();
        
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void display(){
        System.out.println("Thong tin cua gai: ");
        System.out.println(name + " " + v1 + " " + v2 + " " + v3);
    }
    
    public void set(String name,int v1, int v2, int v3){
        this.name = name;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
}

    