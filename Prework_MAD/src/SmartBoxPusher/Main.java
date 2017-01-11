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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Methods myMethod = new Methods();
        Move myMove = new Move();

        char[][] map = new char[6][6];
        Point P = new Point(2, 2);
        Point B = new Point(3, 3);
        Point S = new Point(3, 4);
        myMethod.setMap(map, P, B);

        System.out.println("WELCOME TO THE SMART-BOX-PUSHER GAME!");
        
        System.out.println("");
        System.out.println("W: move up.");
        System.out.println("A: move left.");
        System.out.println("S: move down.");
        System.out.println("D: move right.");
        System.out.println("RESET: reset game.");
        System.out.println("QUIT: give up.");

        String choice = new String();
        
        int life = 3;
        int move = 10;
        
        System.out.println("\nYOU HAVE 3 TIMES TO RESET GAME BEFORE YOU CAN WIN.\n");
        
        while (life >= 0) {
            
            myMethod.showMap(map);
            
            if (move > 1) {
                System.out.println("\nYOU HAVE " + move + " MOVES LEFT.\n");
            } else if (move > 0) {
                System.out.println("\nYOU HAVE 1 MOVE LEFT.\n");
            } else {
                System.out.println("\nYOU DO NOT HAVE ANY MOVES LEFT!");
                life--;
                if (life < 0) {
                    System.out.println("AND YOU DO NOT HAVE ANY TIMES LEFT TO RESET GAME.");
                    System.out.println("YOU LOSE.");
                    return;
                }
                System.out.println("\nYOUR GAME IS RESET.");
                if (life > 1) {
                    System.out.println("\nYOU HAVE " + life + " TIMES TO RESET GAME BEFORE YOU CAN WIN.\n");
                } else {
                    System.out.println("\nYOU HAVE " + life + " TIME LEFT TO RESET GAME BEFORE YOU CAN WIN.\n");
                }
                myMethod.resetMap(map, P, B);
                myMethod.showMap(map);
                System.out.println("\nYOU HAVE 10 MOVES LEFT.\n");
                move = 11;
            }
            move--;
            choice = myMethod.acceptChoice();
            
            switch (choice.charAt(0)) {
                case 'W':
                    myMove.moveUp(map, P, B);
                    if (B.equals(S)) {
                        System.out.println("YOU WON!");
                        return;
                    }
                    break;
                    
                case 'S':
                    myMove.moveDown(map, P, B);
                    if (B.equals(S)) {
                        System.out.println("YOU WON!");
                        return;
                    }
                    break;
                    
                case 'A':
                    myMove.moveLeft(map, P, B);
                    if (B.equals(S)) {
                        System.out.println("YOU WON!");
                        return;
                    }
                    break;
                    
                case 'D':
                    myMove.moveRight(map, P, B);
                    if (B.equals(S)) {
                        System.out.println("YOU WON!");
                        return;
                    }
                    break;
                    
                case 'R':
                    if (myMethod.makeSure()) {
                        if (life > 0) {
                            life--;
                            move = 10;
                            System.out.println("YOUR GAME IS RESET SUCCESSFULLY.");
                            if (life > 1) {
                                System.out.println("\nYOU HAVE " + life + " TIMES TO RESET GAME BEFORE YOU CAN WIN.\n");
                            } else {
                                System.out.println("\nYOU HAVE " + life + " TIME LEFT TO RESET GAME BEFORE YOU CAN WIN.\n");
                            }
                            myMethod.resetMap(map, P, B);
                        } else {
                            System.out.println("YOU CAN NOT RESET GAME ANYMORE.\n");
                            move++;
                        }
                    } else {
                        move++;
                    }
                    break;
                    
                case 'Q':
                    if (myMethod.makeSure()) {
                        System.out.println("YOU JUST GAVE UP. IT MEANS YOU LOSE!");
                        return;
                    } else {
                        move++;
                    }
            }
        }
        System.out.println("YOU LOSE.");
    }

}
