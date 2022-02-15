package by.epam.lis.basic;
// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы
//   и самого числа.
//   m и n вводятся с клавиатуры.
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        for(int i=m;i<n;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    System.out.println(j);
                }
            }
        }
    }
}
