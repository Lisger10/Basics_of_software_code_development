package by.epam.lis.basic;

import java.util.Scanner;
//Даны три точки A(x1,y1), B(x2,y2), C(x3,y3).
//   Определить, будут ли они расположены на одной прямой.
public class Main8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        System.out.println("Координаты точек- A: " +x1 +";" +y1+ " " + "B: " +x2 +";" +y2+  " " + "C: " +x3 +";" +y3);
        if  ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Точки лежат на одной прямой");
        }
        else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }
}
