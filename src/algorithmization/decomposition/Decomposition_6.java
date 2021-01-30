package algorithmization.decomposition;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Decomposition_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the " + (i + 1) + " number:");
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Our numbers: " + Arrays.toString(numbers));
        coPrimeNumbers(numbers);
    }

    // Являются ли наши числа взаимно простыми.

    static void coPrimeNumbers(int[] array) {
        boolean isSimple = true;
        for (int i : array) {
            int count = 0;
            for (int k : array) {
                if (i % k == 0) count++;
            }
            if (count >= 2) {
                isSimple = false;
                break;
            }
        }
        System.out.println(isSimple ? "The numbers are co prime." : "The numbers are not co prime.");
    }
}
