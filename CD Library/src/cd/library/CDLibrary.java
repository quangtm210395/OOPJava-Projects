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
public class CDLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    CDLib myLib = new CDLib();
    SongCD s1=new SongCD(1, "Ha noi 1",10.5, 30,"Nguyen A", "POP");
    SongCD s2=new SongCD(2, "TPHCM 222",15.2, 50, "Tran B\t","BLUE");
    CD s3 = new CD(3, "Que toi 3", 5.0, 20);
    myLib.add(s1);
    myLib.add(s2);
    myLib.add(s3);
    myLib.input();
    myLib.display();
    }
    
}
