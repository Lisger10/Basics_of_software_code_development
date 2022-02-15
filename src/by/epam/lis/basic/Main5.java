package by.epam.lis.basic;
//Для данной области составить линейную программу, которая печатает True, если точка с координатами (х, у)
//принадлежит закрашенной области, и False — в противном случае:
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("Введите x и y точки:");
        Scanner sc = new Scanner(System.in);
       double x = sc.nextDouble();
        System.out.println("x = " +x);
        double y  = sc.nextDouble();
        System.out.println("x = " +y);

        if((x>=-2 && y >=0 && y <= 4)||(x>=-4 && x<=4 && y>= -3 && y<0))
        {
            System.out.println("True");
       }
        else
        {
            System.out.println("Вышли за пределы");
        }
    }
}

