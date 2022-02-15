package by.epam.lis.basic;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();
        int[] arr = new int[10];
        while(a != 0){
            arr[a % 10]++;
            a /=10;
            System.out.println(a);
        }
        while(b != 0){
            if(arr[b % 10] != 0)
                System.out.print(b % 10 + " ");
            b /=10;
        }
    }
}
