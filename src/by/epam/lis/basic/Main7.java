package by.epam.lis.basic;
//Найти max{min(a,b), min(c,d)}
import java.util.Scanner;

public class Main7 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite a, b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Vvedite c, d: ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int k = minValue(a,b);
        int z = minValue(c,d);
        int m = maxValue(k,z);
        System.out.println(m);

    }
    public static int minValue(int x, int y) {
        if (x >= y) {
            return y;
        } else {
            return x;
        }
    }

    public static int maxValue(int x, int y){
        if (x <= y) {
            return y;
        } else {
            return x;
        }

    }

}
