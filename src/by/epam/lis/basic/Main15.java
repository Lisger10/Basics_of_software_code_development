package by.epam.lis.basic;
// Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
//   модуль которых больше или равен заданное e. Общий член ряда имеет вид:
//   a n (n подстрочная) = 1 /2ⁿ + 1/3ⁿ
import java.util.Scanner;

public class Main15 {
    public static void main( String []args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите N:");
            double n = scan.nextDouble();
            System.out.println("Введите i:");
            double i = scan.nextDouble();
            double a = 1 / (Math.pow(2, i) )+ 1 / (Math.pow(3, i));
            if (Math.abs(a) >= n) {
                System.out.println(Math.abs(a)+ ">=" + n);
            } else {
                System.out.println(Math.abs(a)+ "<=" + n);
            }
        }
    }

