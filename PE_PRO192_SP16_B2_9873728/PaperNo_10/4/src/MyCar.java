

import java.util.*;
//Your job is to complete this class 

public class MyCar implements ICar
{    
    //write the definition of method f1 here 
    @Override
    public String f1(ArrayList<Car> a) {
        Map<String, Integer> map = new TreeMap();
        int max = 0;
        String color = null;
        for (int i = 0; i < a.size(); i++) {
            map.put(a.get(i).color, 0);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            for (int i = 0; i < a.size(); i++) {
                if (entry.getKey().equals(a.get(i).color)) {
                    map.put(entry.getKey(), entry.getValue() + 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max == entry.getValue()) {
                color = entry.getKey();
            }
        }
        return color;
    }  
    
    //write the definition of method f2 here 
    @Override
    public int f2(ArrayList<Car> a) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).price >= 50000) {
                count++;
            }
        }
        return count;
    }    
    //add and complete you other methods (if needed) here   
     
}
