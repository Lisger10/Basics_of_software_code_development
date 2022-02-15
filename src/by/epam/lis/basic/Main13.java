package by.epam.lis.basic;
//Найти сумму квадратов первых ста чисел
public class Main13 {
    public static void main(String[] args) {

        double sum=0;
        for(double i = 1; i<101;i++){
            sum += Math.pow(i,2);

        }
        System.out.println(sum);
    }
}
