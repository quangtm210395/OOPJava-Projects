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
public class SonyWalkman implements IPlayer{

    @Override
    public void play(String songName) {
        System.out.println("Sony is playing: " +songName);
    }
    
}
