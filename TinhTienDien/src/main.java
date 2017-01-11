/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minnnnn
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ebill customer = new Ebill();
        customer.accept();
        System.out.println("Tong tien dien phai tra la: "+ customer.getAmount(customer.getUserType(), customer.getNumber()));
    }
    
}
