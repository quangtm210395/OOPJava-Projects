/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd.library;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Minnnnn
 */
public class CDLib {
    private int count;
    
    public Vector<CD> myLib;
            
    public int getCount() {
        return count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    public CDLib(){
        myLib = new Vector<CD>();
    }
    
    public void input(){
        SongCD newCD = new SongCD();
        Scanner sc = new Scanner(System.in);
        System.out.print("Code: ");
        newCD.setCode(sc.nextInt());
        System.out.println("Title: ");
        sc.nextLine();
        newCD.setTitle(sc.nextLine());
        System.out.println("Price: ");
        newCD.setPrice(sc.nextDouble());
        System.out.println("Quantity: ");
        newCD.setQuantity(sc.nextInt());
        System.out.println("Artist: ");
        sc.nextLine();
        newCD.setArtist(sc.nextLine());
        System.out.println("Type: ");
        newCD.setType(sc.nextLine());
        
        myLib.add(newCD);
    }
    
    public void add(CD newCD){
        myLib.add(newCD);
    }
    
    public void display(){
        System.out.println("My Library");
        System.out.println("Code\tTitle\t\tPrice\tQuantity\tArtist\t\tType");
        for (int i=0; i<myLib.size(); i++){
            myLib.get(i).display();
        }
    }
    
    //public void input()
    
}
