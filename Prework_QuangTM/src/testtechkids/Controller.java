/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtechkids;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Tran Minh Quang
 */
public class Controller {

    private Scanner scan;

    public Controller() {
        scan = new Scanner(System.in);
    }

    public void enemiesMove(Point P, Point I, Point E1, Point E2) {
        int x1 = P.getX() - E1.getX();
        int x2 = P.getX() - E2.getX();
        int y1 = P.getY() - E1.getY();
        int y2 = P.getY() - E2.getY();
//        System.out.println("x1: " + x1);
//        System.out.println("x2: " + x2);
//        System.out.println("y1: " + y1);
//        System.out.println("y2: " + y2);
        if (!E1.isDenied()) {
            if (Math.abs(x1) > Math.abs(y1)) {
                // E1 move
                if (x1 < 0) {
                    E1.setX(E1.getX() - 1);
                } else {
                    E1.setX(E1.getX() + 1);
                }
            } else if (y1 < 0) {
                E1.setY(E1.getY() - 1);
            } else {
                E1.setY(E1.getY() + 1);
            }
            if (E1.equals(I)) {
                E1.deny();
            }
        }
        if (!E2.isDenied()) {
            if (Math.abs(x2) > Math.abs(y2)) {
                //E2 move
                if (x2 < 0) {
                    E2.setX(E2.getX() - 1);
                } else {
                    E2.setX(E2.getX() + 1);
                }
            } else if (y2 < 0) {
                E2.setY(E2.getY() - 1);
            } else {
                E2.setY(E2.getY() + 1);
            }
            if (E2.equals(I)) {
                E2.deny();
            }
            if (E2.equals(E1)) {
                E2.deny();
            }
        }

    }

    public void moveLeft(char[][] map, Point P, Point S, Point E1, Point E2, Point I, boolean chan) {
        P.setX(P.getX() - 1);
        if (P.equals(E1) || P.equals(E2)) P.deny();
        P.setNgang(true);
        enemiesMove(P, I, E1, E2);
        setMap(map, P, S, E1, E2, I, true, chan);
    }

    public void moveRight(char[][] map, Point P, Point S, Point E1, Point E2, Point I, boolean chan) {
        P.setX(P.getX() + 1);
        if (P.equals(E1) || P.equals(E2)) P.deny();
        P.setNgang(true);
        enemiesMove(P, I, E1, E2);
        setMap(map, P, S, E1, E2, I, true, chan);
    }

    public void moveUp(char[][] map, Point P, Point S, Point E1, Point E2, Point I, boolean chan) {
        P.setY(P.getY() - 1);
        if (P.equals(E1) || P.equals(E2)) P.deny();
        P.setNgang(false);
        enemiesMove(P, I, E1, E2);
        setMap(map, P, S, E1, E2, I, false, chan);
    }

    public void moveDown(char[][] map, Point P, Point S, Point E1, Point E2, Point I, boolean chan) {
        P.setY(P.getY() + 1);
        if (P.equals(E1) || P.equals(E2)) P.deny();
        P.setNgang(false);
        enemiesMove(P, I, E1, E2);
        setMap(map, P, S, E1, E2, I, false, chan);
    }

    public void fire(char[][] map, Point P, Point S, Point E1, Point E2, Point I, boolean isHorizontal, boolean chan) {
        if (isHorizontal) {
            if (E1.getY() == P.getY() && Math.abs(P.getX() - E1.getX()) <= 3) {
                E1.deny();
            }
            if (E2.getY() == P.getY() && Math.abs(P.getX() - E2.getX()) <= 3) {
                E2.deny();
            }
        } else {
            if (E1.getX() == P.getX() && Math.abs(P.getY() - E1.getY()) <= 3) {
                E1.deny();
            }
            if (E2.getX() == P.getX() && Math.abs(P.getY() - E1.getY()) <= 3) {
                E2.deny();
            }
        }
//        enemiesMove(P, I, E1, E2);
        setMap(map, P, S, E1, E2, I, P.isNgang(), chan);
    }

    public void setMap(char[][] map, Point P, Point S, Point E1, Point E2, Point I, boolean ngang, boolean chan) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = 'x';
            }
        }
        if (!P.isDenied()) {
            if (ngang) {
                map[P.getY()][P.getX()] = '-';
            } else {
                map[P.getY()][P.getX()] = '|';
            }
        }
        if (!E1.isDenied()) {
            map[E1.getY()][E1.getX()] = 'E';
        }
        if (!E2.isDenied()) {
            map[E2.getY()][E2.getX()] = 'E';
        }
        if (chan) {
            nextI(P, S, I, E1, E2);
            map[I.getY()][I.getX()] = 'I';
        }

        map[S.getY()][S.getX()] = 'S';
    }

    public void drawMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print("  " + map[i][j]);
            }
            System.out.println("");
        }
    }

    public String acceptChoice() {
        String[] acceptable = {"W", "A", "S", "D", "Q", "F"};
        String result = "";
        boolean again = true;
        while (again) {
            System.out.print("YOUR NEXT MOVE: ");
            result = scan.nextLine().trim().toUpperCase();
            System.out.println("");
            for (String string : acceptable) {
                if (result.equals(string)) {
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
                System.out.println("F: fire.");
                System.out.println("QUIT: give up.");
                System.out.println("");
            }
        }
        return result;
    }

    public String acceptSide() {
        String[] sides = {"H", "V"};
        String result = "";
        boolean again = true;
        while (again) {
            System.out.println("H: Horizontal");
            System.out.println("V: Vertical");
            System.out.print("ENTER SIDE TO FIRE: ");
            System.out.println("");
            result = scan.nextLine().trim().toUpperCase();
            System.out.println("");
            for (String string : sides) {
                if (result.equals(string)) {
                    again = false;
                    break;
                }
            }
            if (again) {
                System.out.print("ENTER SIDE TO FIRE: ");
                System.out.println("H: Horizontal");
                System.out.println("V: Vertical");
                System.out.println("");
            }
        }
        return result;
    }

    public boolean isLost(Point P, Point S, Point I, Point E1, Point E2, boolean chan) {

        if (E1.equals(P) || E2.equals(P) || P.equals(S) || (chan && P.equals(I)) || P.isDenied()) {
            return true;
        }
        return false;
    }

    public boolean isWin(Point S, Point I, Point E1, Point E2, boolean chan) {
        if (E1.equals(S)) {
            E1.deny();
        }
        if (E2.equals(S)) {
            E2.deny();
        }
        if (chan) {
            if (E1.equals(I)) {
                E1.deny();
            }
            if (E2.equals(I)) {
                E2.deny();
            }
        }
        if (E1.isDenied() && E2.isDenied()) {
            return true;
        }
        return false;
    }

    public Point randomPoint(Point P, Point S, Point E1, Point E2) {
        int x;
        int y;
        Random r = new Random();
        x = r.nextInt(7);
        y = r.nextInt(7);
        Set<Integer> setX = new HashSet<>();
        Set<Integer> setY = new HashSet<>();
        setX.add(P.getX());
        setX.add(S.getX());
        setX.add(E1.getX());
        setX.add(E2.getX());
        setY.add(P.getY());
        setY.add(S.getX());
        setY.add(E1.getX());
        setY.add(E2.getX());
        while (setX.contains(x) || setY.contains(y)) {
            x = r.nextInt(7);
            y = r.nextInt(7);
        }

        return new Point(x, y);
    }

    public void nextI(Point P, Point S, Point I, Point E1, Point E2) {
        Point temp = new Point(I.getX(), I.getY());
        Random r = new Random();
        List<Point> list = new ArrayList<>();
        list.add(P);
        list.add(S);
        list.add(E1);
        list.add(E2);
        if (isRounded(list, I)) {
            return;
        }
        int ok = 0;
        while (ok == 0) {
            int key = r.nextInt(4);
            switch (key) {
                case 0:
                    if (I.getY() > 0) {
                        I.setY(I.getY() - 1);
                        ok = 1;
                    }
                    break;
                case 1:
                    if (I.getX() < 6) {
                        I.setX(I.getX() + 1);
                        ok = 1;
                    }
                    break;
                case 2:
                    if (I.getY() < 6) {
                        I.setY(I.getY() + 1);
                        ok = 1;
                    }
                    break;
                case 3:
                    if (I.getX() > 0) {
                        I.setX(I.getX() - 1);
                        ok = 1;
                    }
                    break;
            }
            if (ok == 1) {
                for (Point point : list) {
                    if (point.equals(I)) {
                        ok = 0;
                    }
                }
                if (ok == 0) {
                    I.setX(temp.getX());
                    I.setY(temp.getY());
                }
            }
        }
    }

    private boolean isRounded(List<Point> list, Point I) {
        int count = 0;
        if (I.getX() == 0) {
            count++;
        }
        if (I.getX() == 6) {
            count++;
        }
        if (I.getY() == 0) {
            count++;
        }
        if (I.getY() == 6) {
            count++;
        }
        for (Point point : list) {
            if (point.equals(I.left()) || point.equals(I.right())
                    || point.equals(I.top()) || point.equals(I.bottom())) {
                count++;
            }
        }
        return count == 4;
    }

}
