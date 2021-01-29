package algorithmization.decomposition;

/* Два простых числа называются "близнецами",если они отличаются друг от друга
на 2(например, 41 и 43).Найти и напечатать все пары "близнецов" из отрезка [2,2n],
где n - заданное натуральное число больше 2.Для решения задачи использовать
декомпозицию. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n more than 2: ");
        int n = Integer.parseInt(reader.readLine());
        if (n < 2) {
            System.out.println("Try again. ");
        } else {
            twins(n);
        }
    }

    static void twins(int n) {
        int countN = n;
        int twinsAmount = 0;
        while (countN <= 2 * n) {

            // Является ли число простым

            int isSimpleNumber = 0;
            int isSimpleNumber2 = 0;
            for (int i = 2; i <= countN; i++) {
                if (countN % i == 0) isSimpleNumber++;
            }

            // Если число является простым,явлется ли число n+2 тоже простым.

            if (isSimpleNumber == 1 && countN + 2 < n * 2) {
                countN += 2;
                for (int i = 2; i <= countN; i++) {
                    if ((countN) % i == 0) {
                        isSimpleNumber2++;
                    }
                }
                countN -= 2;
            }

            // Проверяем,близнецы ли они.

            if (isSimpleNumber == isSimpleNumber2) {
                System.out.println(countN + " and " + (countN + 2) + " are twins");
                twinsAmount++;
            }
            countN++;
        }
        if (twinsAmount == 0) System.out.println("There are no twins in this range");
    }
}
