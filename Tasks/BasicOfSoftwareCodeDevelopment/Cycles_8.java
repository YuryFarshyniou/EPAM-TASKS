package BasicOfSoftwareCodeDevelopment;
// Даны два числа.Определить цифры,входящие в запись как первого так и второго числа.


import java.util.*;

public class Cycles_8 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the  first number ");

        int a = sc.nextInt();
        while (a != 0) {
            arr[a % 10]++;

            a /= 10;
        }

        System.out.println("Enter the  second number: ");
        int b = sc.nextInt();
        while (b != 0) {
            if (arr[b % 10] != 0) {
                System.out.println(b % 10);
            }
            b /= 10;
        }
    }
}
