
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Minnnnn
 */
public class Ebill {

    private int number;
    private String userType;
    public double amount;
    private String tmp;

    public Ebill() {

    }

    public Ebill(String userType, int number) {
        this.number = number;
        this.userType = userType;

    }

    public void accept() {
        // khi chay accept thi userType da duoc gan.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userType <doanhnghiep/hogiadinh> :  ");
        userType = sc.nextLine();
        System.out.println("Enter number: ");
        number = sc.nextInt();

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUserType() {
        return userType;
    }

    public double getAmount(String userType, int number) {
        double amount = 0;
        if (number > 200) {
            amount = (number - 200) * 2000 + 100 * 1700 + 100 * (1500 + 1400);
        } else if (number > 100) {
            amount = (number - 100) * 1700 + 100 * (1500 + 1400);
        } else if (number > 50) {
            amount = (number - 50) * 1500 + 50 * 1400;
        } else {
            amount = number * 1400;
        }
        if (userType.equals("doanhnghiep")) { // cách so sánh 2 String
            return (amount * 1.05);
        } else {
            return amount;
        }

    }
}
