package basicOfSoftwareCodeDevelopment;
// Вычислить значение выражения по формуле(все переменные принимают действительные значения) : ( (sin x + cos y) /(cos x - sin y)) * tg xy;

import java.util.*;

public class Linear_Programs_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X number :  ");
        double x = sc.nextDouble();
        System.out.println("Enter Y number : ");
        double y = sc.nextDouble();
        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y))) * Math.tan(x * y);
        System.out.println("Your answer is : " + z);

    }

}
