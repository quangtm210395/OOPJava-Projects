// ======= DO NOT EDIT MAIN FUNCTION ============

import java.io.*;

class Main {

    /**
     * Count the number of words in s that contain at least a vowel letter
     *
     * @param s - an input string
     * @return - number of words in an input string that contain at least a
     * vowel letter
     */
    public static int f1(String s) {
        String s1 = s.trim();
        String[] result = s1.split("[ ]");
        int count = 0;
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]);
//        }
//        System.out.println("");
        for (String result1 : result) {
            for (int i = 0; i < result1.length(); i++) {
                if (result1.charAt(i) == 'a' || result1.charAt(i) == 'A' 
                        || result1.charAt(i) == 'e' || result1.charAt(i) == 'E' 
                        || result1.charAt(i) == 'i' || result1.charAt(i) == 'I' 
                        || result1.charAt(i) == 'u' || result1.charAt(i) == 'U' 
                        || result1.charAt(i) == 'o' || result1.charAt(i) == 'O') {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s ;
        System.out.print("Enter a string s: ");
        s = in.readLine();
        System.out.println("OUTPUT:");
        System.out.println(f1(s));
    }

}
