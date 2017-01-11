/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import static java.lang.Thread.sleep;
import java.util.*;

/**
 *
 * @author Minnn
 */
class main {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println(al);
        int k = 3;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == k) {
                al.remove(i);
//                i--;
            }
        }
        System.out.println(al);
    }
}
