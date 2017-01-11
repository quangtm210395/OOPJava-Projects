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
public class IPod implements IPlayer, ISpeed{
    private String songName;
    @Override
    public void play(String songName) {
        System.out.println("IPod is playing " + songName);
        this.songName = songName;
    }

    @Override
    public void changeSpeed(int speed) {
        System.out.println("Play song's name: " + this.songName + " with speed: " + speed);
    }
    
    
}
