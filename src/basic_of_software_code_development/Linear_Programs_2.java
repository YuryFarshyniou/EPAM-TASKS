package basic_of_software_code_development;

/* Вычислить значение выражения по формуле(все переменные принимают действительные значения):
(( b + sqrt(b^2 + 4ac))/2a) - a^3 *c + b^-2;*/

import java.util.Scanner;

public class Linear_Programs_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number : ");
        double a = sc.nextDouble();
        System.out.println("Enter  b number : ");
        double b = sc.nextDouble();
        System.out.println("Enter  c number : ");
        double c = sc.nextDouble();
        double actionOne = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a);
        double answer = actionOne - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.print("Your answer is: ");
        System.out.printf("%.2f",answer);
        sc.close();
    }
}