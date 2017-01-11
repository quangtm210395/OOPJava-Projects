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
public class SongCD extends CD{
    private String artist;
    private String type;

    SongCD() {
        // 3throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SongCD(int code, String title, double price, int quantity, String artist, String type) {
        super(code, title, price, quantity);
        this.artist = artist;
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println(getCode()+""+'\t'+getTitle()+'\t'+getPrice()+'\t'+getQuantity()+"\t\t"+this.artist+"\t"+this.type);
//super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void input(int code, String title, double price, int quantity) {
        super.input(code, title, price, quantity); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
