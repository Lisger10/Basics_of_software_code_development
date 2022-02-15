package by.epam.lis.basic;
//Напишите программу, где пользователь ВВОДИТ любое целое положительное ЧИСЛО. А программа суммирует
//все числа ОТ 1 ДО введенного пользователем числа.
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int sum = 0;
            for(int i = 1; i<a;i++){
                sum += i;

            }
            System.out.println(sum);
        }
    }

