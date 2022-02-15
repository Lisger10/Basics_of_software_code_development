package by.epam.lis.basic;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин 55с
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд: ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;

        numberOfHours = num/ 3600;

        numberOfMinutes = (num % 3600) / 60;
        System.out.println(numberOfMinutes);

        numberOfSeconds = ((num % 3600) % 60) ;
        System.out.println(" Hour " + numberOfHours + " Minute " + numberOfMinutes + " Seconds " + numberOfSeconds);

    }
}

