/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartBoxPusher;

import java.util.Scanner;

/**
 *
 * @author WindzLord
 */
public class Methods {

    private Scanner scan;

    public Methods() {
        scan = new Scanner(System.in);
    }

    public void setMap(char map[][], Point P, Point B) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                map[i][j] = '-';
            }
        }
        map[4][3] = 'S';
        map[P.getY()][P.getX()] = 'P';
        map[B.getY()][B.getX()] = 'B';
    }

    public void resetMap(char map[][], Point P, Point B) {
        P.setX(2);
        P.setY(2);
        B.setX(3);
        B.setY(3);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                map[i][j] = '-';
            }
        }
        map[4][3] = 'S';
        map[P.getY()][P.getX()] = 'P';
        map[B.getY()][B.getX()] = 'B';
    }

    public void showMap(char map[][]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("  " + map[i][j]);
            }
            System.out.println("");
        }
    }

    public String acceptChoice() {
        String[] acceptable = {"W", "A", "S", "D", "RESET", "QUIT"};
        String ret = new String();
        boolean again = true;
        while (again) {
            System.out.print("YOUR CHOICE: ");
            ret = scan.nextLine().trim().toUpperCase();
            System.out.println("");
            for (String string : acceptable) {
                if (ret.equals(string)) {
                    again = false;
                    break;
                }
            }
            if (again) {
                System.out.println("PLEASE ENTER ONE OF THE FOLLOWING CHOICES.");
                System.out.println("W: move up.");
                System.out.println("A: move left.");
                System.out.println("S: move down.");
                System.out.println("D: move right.");
                System.out.println("RESET: reset game.");
                System.out.println("QUIT: give up.");
                System.out.println("");
            }
        }
        return ret;
    }
    
    public boolean makeSure() {
        // Dài quá bỏ qua
        // Đại ý là hỏi có chắc chắn muốn reset/quit game không :))
        
        return true;
    }

}
