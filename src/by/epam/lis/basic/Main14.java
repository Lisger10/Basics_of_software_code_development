package by.epam.lis.basic;
//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Main14 {
    public static void main(String[] args) {

        double multy =1;
        for(double i = 1; i<201;i++){
            multy *= Math.pow(i,2);
        }
        System.out.println(multy);
    }
}
