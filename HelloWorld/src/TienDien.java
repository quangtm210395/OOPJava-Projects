/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minnnnn
 */
public class TienDien {
    public static void main(String[] args) {
        int soDien = 600;
        int sum = 0;
        if (soDien > 350) 
            sum = (soDien - 350)*2000 + 150*1500 + 100*300;
        else if (soDien >200)
            sum = (soDien - 200)*1500 + 100*300;
        else if (soDien >100)
            sum = (soDien - 100)*200 + 100*100;
        else sum = soDien*100;
        System.out.println("Tong tien "+ sum);
    }
}
