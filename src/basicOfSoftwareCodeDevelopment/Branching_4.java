package basicOfSoftwareCodeDevelopment;

/* Даны размеры А,В прямоугольного отверстияи размеры x, y, z кирпича.
Определить,пройдет ли кирпич через отверстие.*/

import java.util.Scanner;

public class Branching_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int A = sc.nextInt();
        System.out.println("Enter B: ");
        int B = sc.nextInt();
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        System.out.println((A >= x && B >= y) ? "The brick will go through the hole"
                : "The brick won't go through the hole");

         /* Дырка в стене двухмерная, поэтому и поэтому кирпич принимаем тоже как двухмерную фигуру(прямоугольник),
        поэтому одним параметром пренебрегаем.Если стороны отверстия больше либо равны сторонам кирпича ,значит кирпич проходит */
    }
}
