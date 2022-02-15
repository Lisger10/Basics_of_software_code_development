package by.epam.lis.basic;
//Вычислить значение функции:
//   F(x) = x² - 3x + 9, если x <= 3;
//   F(x) = 1 / (x³ + 6), если x > 3.
import java.util.Scanner;

public class Main10 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double x = scan.nextDouble();
            double y;
            if (x <= 3) {
                y = Math.pow(x, 2) - 3 * x + 9;
            } else {
                y = 1 / (Math.pow(x, 3) + 6);
            }
            System.out.println(y);
        }
    }

