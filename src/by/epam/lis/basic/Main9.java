package by.epam.lis.basic;

import java.util.Scanner;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, 1 кирпича. Определить, пройдет ли кирпич через
//отверстие.
public class Main9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println("a = " + a + " " + "b = " + b);
        System.out.println("x = " + x + " " + "y = " + y + " " + "z = " + z);
        if (x <= a && y <= b) {
            System.out.println("Кирпич проходит");
        }
        else if (x<=a && z<=b){
            System.out.println("Кирпич проходит тоже");
        }
        else if (y<=a && z<=b){
            System.out.println("Кирпич все еще проходит");
        }
        else if (y<=a && x<=b){
            System.out.println("Кирпич все еще проходит");
        }
        else if (z<=a && x<=b){
            System.out.println("Кирпич все еще проходит");
        }
        else if (z<=a && y<=b){
            System.out.println("Кирпич все еще проходит");
        }
        else {
            System.out.println("Кирпич не пройдет");
        }
    }
}
