/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Minnn
 */
public class PlayerDemo {
    public static void main(String[] args) {
        IPlayer mp3 = new IPlayer(){
            @Override
            public void play(String songName) {
                System.out.println("Player is playing: " + songName);
            }
        };
        mp3.play("Christmas Song - Back Number.");
        
        IPod ipod = new IPod();
        ipod.play("Sakura.");
        ipod.changeSpeed(ISpeed.DOUBLE_SPEED);
        SonyWalkman Sony = new SonyWalkman();
        Sony.play("What do you mean.");
        
    }
}
