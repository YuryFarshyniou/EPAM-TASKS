package algorithmization.decomposition;

/* Из заданного числа вычли сумму его цифр.Из результата вновь вычти
сумму его цифр и т.д. Сколько таких действий надо произвести ,чтобы
получился нуль? Для решения задачи использовать декомпозицию. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("The amount of actions: " + sum(number));
    }

    static int sum(int n) {
        int count = 0;
        while (n != 0) {
            int sum = 0;
            char[] arr = String.valueOf(n).toCharArray();
            for (char i : arr) {
                if (i == '-') continue;
                sum += Integer.parseInt(String.valueOf(i));
            }
            if (n < 0) {
                n += sum;
            } else {
                n -= sum;
            }
            count++;
            System.out.println("Now the number is: " + n);
        }
        return count;
    }
}
