// ======= DO NOT EDIT THIS FILE ============
import java.io.*;
class Main
{
   public static void main(String args[]) throws Exception
   {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter motor name: ");
       String name = in.readLine();
       System.out.print("Enter motor price: ");
       double price = Double.parseDouble(in.readLine());
       System.out.print("Enter motor code: ");
       String code = in.readLine();
       System.out.println("OUTPUT:");
       Motor p = new Motor(name, price);
       System.out.println(p);
       p = new VNMotor(name, price, code);
       System.out.println(p);
   }
 }
