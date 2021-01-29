package algorithmization.decomposition;

/* Найти все натуральные n-значные числа,цифры в которых образуют
строго возрастающую последовательность(например, 1234,5789). Для
решения задачи использовать декомпозицию.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n digit number: ");
        int n = Integer.parseInt(reader.readLine());
        sequence(n);
    }

    static void sequence(int n) {
        int lowestNumber = (int) Math.pow(10, n - 1);
        int highestNumber = (int) Math.pow(10, n) - 1;
        while (lowestNumber <= highestNumber) {
            char[] arr = Integer.toString(lowestNumber).toCharArray();
            int nextDigit = 0;
            for (int i = 0; i < arr.length; i++) {

                if (arr[0] == (arr[i] - i)) {
                    nextDigit++;
                }
            }
            if (nextDigit == n) System.out.println(lowestNumber + " is an increasing digit number");
            lowestNumber++;
        }
    }
}
