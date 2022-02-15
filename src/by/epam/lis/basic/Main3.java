package by.epam.lis.basic;
//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//   Поменять местами дробную и целую части числа и вывести полученное значение числа.
import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
    }

