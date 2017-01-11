/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd.library;

/**
 *
 * @author Minnnnn
 */
public class CD {
    private int code;
    private String title;
    private double price;
    private int quantity;

    CD() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CD(int code, String title, double price, int quantity) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void display(){
        System.out.println(code+""+'\t'+title+'\t'+price+'\t'+quantity);
    }
    
    public void input(int code, String title, double price, int quantity){
        System.out.println("Enter a new CD");
        this.code= code;
        this.price= price;
        this.quantity= quantity;
        this.title= title;
    }
}
