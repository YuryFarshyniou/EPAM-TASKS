package basicOfSoftwareCodeDevelopment;

//Найдите значение функции : z = (( a - 3) * b / 2) + c;

import java.util.Scanner;

public class Linear_Programs_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = x.nextInt();
        System.out.println("Enter b number: ");
        int b = x.nextInt();
        System.out.println("Enter c number: ");
        int c = x.nextInt();
        int z = ((a - 3) * b / 2) + c;

        System.out.println("Your answer is : " + z);
        x.close();
    }
}
