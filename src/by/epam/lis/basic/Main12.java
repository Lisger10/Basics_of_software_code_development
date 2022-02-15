package by.epam.lis.basic;
//Вычислить значения функции на отрезке [а,b] c шагом h:
//   y = x, x > 2
//   y = -x, x <= 2
public class Main12 {
    public static void main(String[] args) {
        double a = 1;
        double b = 4;
        double h = 0.2;
        double y;
        for(double x =a;x<=b;x+=h){
            if(x>2){
                y=x;
            }
            else {
                y=-x;
            }
            System.out.println(y);

        }
    }
}
