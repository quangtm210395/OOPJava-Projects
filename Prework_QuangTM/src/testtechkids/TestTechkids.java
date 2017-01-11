/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtechkids;

/**
 *
 * @author Tran Minh Quang
 */
public class TestTechkids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Controller controller = new Controller();
        boolean isContinue = true;
        int bullets = 2;
        boolean chan = true;

        char[][] map = new char[7][7];
        Point P = new Point(3, 3, true);
        Point S = new Point(2, 2);
        Point E1 = new Point(5, 2);
        Point E2 = new Point(5, 4);
        Point I = controller.randomPoint(P, S, E1, E2);
        controller.setMap(map, P, S, E1, E2, I, chan, true);

        System.out.println("WELCOME TO THE SEVEN SEEA GAME!");

        System.out.println("");
        System.out.println("W: move up.");
        System.out.println("A: move left.");
        System.out.println("S: move down.");
        System.out.println("D: move right.");
        System.out.println("Q: quit.");
        System.out.println("");

        String choice = "";
        while (isContinue) {

            System.out.println("YOU HAVE " + bullets + (bullets > 0 ? " BULLETS" : " BULLET"));
            controller.drawMap(map);
            choice = controller.acceptChoice();
            switch (choice.charAt(0)) {
                case 'W':
                    if (P.getY() == 0) {
                        System.out.println("CANNOT MOVE UP!!!");
                        break;
                    }
                    chan = !chan;
                    controller.moveUp(map, P, S, E1, E2, I, chan);
                    if (controller.isWin(S, I, E1, E2, chan)) {
                        System.out.println("YOU WON!");
                        return;
                    }
                    if (controller.isLost(P, S, I, E1, E2, chan)) {
                        System.out.println("YOU LOST!");
                        return;
                    }
                    break;

                case 'S':
                    if (P.getY() == 6) {
                        System.out.println("CANNOT MOVE DOWN!!!");
                        break;
                    }
                    chan = !chan;
                    controller.moveDown(map, P, S, E1, E2, I, chan);
                    if (controller.isWin(S, I, E1, E2, chan)) {
                        System.out.println("YOU WON!");
                        return;
                    }
                    if (controller.isLost(P, S, I, E1, E2, chan)) {
                        System.out.println("YOU LOST!");
                        return;
                    }
                    break;

                case 'A':
                    if (P.getX() == 0) {
                        System.out.println("CANNOT MOVE LEFT!!!");
                        break;
                    }
                    chan = !chan;
                    controller.moveLeft(map, P, S, E1, E2, I, chan);
                    if (controller.isWin(S, I, E1, E2, chan)) {
                        System.out.println("YOU WON!");
                        return;
                    }
                    if (controller.isLost(P, S, I, E1, E2, chan)) {
                        System.out.println("YOU LOST!");
                        return;
                    }
                    break;

                case 'D':
                    if (P.getX() == 6) {
                        System.out.println("CANNOT MOVE RIGHT!!!");
                        break;
                    }
                    chan = !chan;
                    controller.moveRight(map, P, S, E1, E2, I, chan);
                    if (controller.isWin(S, I, E1, E2, chan)) {
                        System.out.println("YOU WON!");
                        return;
                    }
                    if (controller.isLost(P, S, I, E1, E2, chan)) {
                        System.out.println("YOU LOST!");
                        return;
                    }
                    break;

                case 'F':
                    if (bullets > 0) {
//                        chan = !chan;
                        String side = controller.acceptSide();
                        switch (side.charAt(0)) {
                            case 'H':
                                controller.fire(map, P, S, E1, E2, I, true, chan);
                                bullets--;
                                break;
                            case 'V':
                                controller.fire(map, P, S, E1, E2, I, false, chan);
                                bullets--;
                                break;
                        }
                    } else {
                        System.out.println("CANNOT FIRE! YOU JUST HAVE 0 BULLET!");
                    }

                    if (controller.isWin(S, I, E1, E2, chan)) {
                        System.out.println("YOU WON!");
                        return;
                    }
                    if (controller.isLost(P, S, I, E1, E2, chan)) {
                        System.out.println("YOU LOST!");
                        return;
                    }
                    break;
                case 'Q':
                    System.out.println("THANKS FOR PLAYING!");
                    isContinue = false;
                    break;
            }

        }
    }

}
