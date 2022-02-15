package by.epam.lis.basic;

import java.util.Scanner;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.
public class Main6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        if ((a + b) >= 180) {
            System.out.println("triangle doesn't exist");
        } else if ((a + b) == 90) {
            System.out.println("rectangular triangle");
        } else {
            System.out.println("non-rectangular triangle");
        }
    }
}
