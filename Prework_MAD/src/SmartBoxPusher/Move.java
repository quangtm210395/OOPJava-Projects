/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartBoxPusher;

/**
 *
 * @author WindzLord
 */
public class Move {

    private Methods myMethod;

    public Move() {
        myMethod = new Methods();
    }

    public void moveUp(char map[][], Point P, Point B) {
        P.setY(P.getY() - 1);
        if (P.equals(B)) {
            B.setY(B.getY() - 1);
        }
        if (B.getY() == 0) {
            P.setY(2);
            B.setY(1);
            System.out.println("You can not move up!\n".toUpperCase());
        } else if (P.getY() == 0) {
            P.setY(1);
            System.out.println("you can not move up!\n".toUpperCase());
        } else {
            myMethod.setMap(map, P, B);
        }
    }

    public void moveDown(char map[][], Point P, Point B) {
        P.setY(P.getY() + 1);
        if (P.equals(B)) {
            B.setY(B.getY() + 1);
        }
        if (B.getY() == 5) {
            P.setY(3);
            B.setY(4);
            System.out.println("You can not move down!\n".toUpperCase());
        } else if (P.getY() == 5) {
            P.setY(4);
            System.out.println("you can not move down!\n".toUpperCase());
        } else {
            myMethod.setMap(map, P, B);
        }
    }

    public void moveLeft(char map[][], Point P, Point B) {
        P.setX(P.getX() - 1);
        if (P.equals(B)) {
            B.setX(B.getX() - 1);
        }
        if (B.getX() == 0) {
            P.setX(2);
            B.setX(1);
            System.out.println("You can not move left!\n".toUpperCase());
        } else if (P.getX() == 0) {
            P.setX(1);
            System.out.println("you can not move left!\n".toUpperCase());
        } else {
            myMethod.setMap(map, P, B);
        }
    }

    public void moveRight(char map[][], Point P, Point B) {
        P.setX(P.getX() + 1);
        if (P.equals(B)) {
            B.setX(B.getX() + 1);
        }
        if (B.getX() == 5) {
            P.setX(3);
            B.setX(4);
            System.out.println("You can not move right!\n".toUpperCase());
        } else if (P.getX() == 5) {
            P.setX(4);
            System.out.println("you can not move right!\n".toUpperCase());
        } else {
            myMethod.setMap(map, P, B);
        }
    }

}
