// ======= DO NOT EDIT MAIN FUNCTION ============

import java.util.*;
import java.io.*;

class Main {

    /**
     * Increment the last prime number in a by 1
     *
     * @param a - a list of whole numbers
     */
    public static Boolean checkPrime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
    
    public static void f1(ArrayList<Integer> a) {
        int temp = 0;
        int index = 0;
        for (int i = a.size()-1; i >=0 ; i--) {
            if (checkPrime(a.get(i))) {
                temp = a.get(i);
                index = i;
                break;
            }
        }
        a.remove(index);
        a.add(index, (temp + 1));
    }

    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a = new ArrayList<>();
        System.out.print("Enter number of item: ");
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + i + " (th): ");
            a.add(Integer.parseInt(in.readLine()));
        }
        f1(a);
        System.out.println("OUTPUT:");
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}
