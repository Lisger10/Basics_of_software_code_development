package by.epam.lis.basic;
//Вычислить значение выражения по формуле
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        double z;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a,b,c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double k = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        if (k >= 0){
            z = (b + k)/2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println(z);
        }
        else {
            System.out.println("Неверный D!");
        }
    }
}
