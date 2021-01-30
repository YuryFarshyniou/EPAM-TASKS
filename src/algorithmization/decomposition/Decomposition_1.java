package algorithmization.decomposition;

/* Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего
кратного двух натуральных чисел.  NOK(a,b)=(a*b)/NOD(a,b);
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Enter the second number: ");
        int secondNumber = Integer.parseInt(reader.readLine());
        System.out.println("The nod is: " + nod(firstNumber, secondNumber));
        System.out.println("The nok is: " + nok(firstNumber, secondNumber));
    }

    // Находим нок

    static int nod(int firstNumber, int secondNumber) {
        int nod = 0;
        int count = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        while (count > 0) {
            if (firstNumber % count == 0 && secondNumber % count == 0) {
                nod = count;
                break;
            } else {
                count--;
            }
        }
        return nod;
    }

    // Находим нод.

    static int nok(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber) / nod(firstNumber, secondNumber);
    }
}
