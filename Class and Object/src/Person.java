/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minnnnn
 */


public class Person {
    public String name;
    public int age;
    public String gender;
    private String skinColor;
    
    public Person(){
        
    }

    public Person(String name, int age, String gender, String skinColor) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        if ((skinColor == "Trang") || (skinColor == "Vang") || (skinColor == "Den")){
            this.skinColor = skinColor;
        }
        else {
            System.out.println("Mau da khong hop le. Gan mac dinh la mau vang");
            this.skinColor = "Vang";
        }
    }
    
    public void said(){
        System.out.println("Hello!!");
    }
}
