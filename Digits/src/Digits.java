/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minnnnn
 */
import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        int soNguyen ;
        int count = 0;
        int i;
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Please enter an interger: ");
        soNguyen = scanIn.nextInt();
        int n = Math.abs(soNguyen);
        //System.out.println(soNguyen);
        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {

                n = n / 10;
                count++;
            }
        }
        //System.out.println(count);
        soNguyen = Math.abs(soNguyen);
        int[] arr = new int[count];
        for (i = 0; i < count; i++) {
            arr[i] = soNguyen % 10;
            soNguyen = soNguyen / 10;
        }
        for (i = count - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
