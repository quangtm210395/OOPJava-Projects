// ======= DO NOT EDIT MAIN FUNCTION ============

import java.io.*;

class Main {

    public static String f1(String s) {
        String[] result = s.split(" ");
        String output = "";
        for (String str : result) {
            int checkDigit = 0;
            int checkUpper = 0;
            int checkLetter = 0;
            for (int i = 0; i < str.length(); i++) {

                if (Character.isDigit(str.charAt(i))) {
                    checkDigit++;
                }
                if (Character.isLetter(str.charAt(i))) {
                    checkLetter++;
                }
                if (Character.isUpperCase(str.charAt(i))) {
                    checkUpper++;
                }
            }
            if (checkDigit >= 1 && checkLetter >= 3 && checkUpper >= 1) {
                output += str;
            }
        }
        if (output.length() >= 4) {
            return output;
        }
        return s;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        System.out.print("Enter a string s: ");
        s = in.readLine();
        System.out.println("OUTPUT:");
        System.out.println(f1(s));
    }
}
