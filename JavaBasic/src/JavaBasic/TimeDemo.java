/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Minnn
 */
public class TimeDemo {

    public static void main(String[] args) {
        //Get time by millis
        long start = System.currentTimeMillis();
        try {
            for (int i = 0; i < 1000; i++) {
                Thread.sleep(2);
            }
        } catch (Exception e) {

        }
        long end = System.currentTimeMillis();
        System.out.println("Millis: " + (end - start));
        
        //Get time by nano
        start = System.nanoTime();
        end = System.nanoTime();
        System.out.println("Nanos: "+ (end - start));
        
        //Display the system time
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String day = dateFormat.format(date);
        System.out.println(day);
        
        
    }
}
