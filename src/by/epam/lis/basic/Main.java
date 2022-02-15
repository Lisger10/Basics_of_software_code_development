package by.epam.lis.basic;
//Найдите значение функции z
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            double z;
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите a,b,c: ");
             double a = scan.nextDouble();
             double b = scan.nextDouble();
             double c = scan.nextDouble();
            z = ((a-3)*b/2) + c;
            System.out.println(z);
        }
    }