package by.epam.lis.basic;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x,y: ");
        double x = scan.nextDouble();
        double radians1 = Math.toRadians(x);
        double y = scan.nextDouble();
        double radians2 = Math.toRadians(y);
        double k = x*y;
        double radians3 = Math.toRadians(k);
        double z ;

        z = (Math.sin( radians1) + Math.cos(radians2))/(Math.cos( radians1)- Math.sin(radians2))* Math.tan(radians3);
        System.out.println(z);
    }
}
