package algorithmization.oneDimArraysSorts;

/* Даны дроби p1/q1 , p2/q2 ,...,pn/qn (pi, qi - натуральные числа).Составить программу,которая приводит эти
дроби к общему знаменателю и упорядочивает их в порядке возрастания. */

import java.util.Arrays;

public class OneDimArraysSorts_8 {
    public static void main(String[] args) {
        int[] numerator = {4, 2, 1, 4, 1, 17, 1};
        int[] denominator = {5, 3, 5, 7, 3, 25, 1};
        int[] digitArray = new int[denominator.length];
        int[] denominatorClone = Arrays.copyOf(denominator, denominator.length);
        findGeneralDigitsForNOK(denominator, digitArray);
        int nok = 1;
        nok = findNOK(digitArray, nok);
        toAllDenominator(denominator, nok);
        numerators(numerator, denominatorClone, nok);
        Arrays.sort(numerator);
        printIncreasingOrder(numerator, nok);
    }

    // Находим в знаменателях числа,кратные друг другу и записываем их в отдельный массив

    static int[] findGeneralDigitsForNOK(int[] denominator, int[] digitArray) {
        for (int i = 0; i < denominator.length; i++) {
            for (int j = 0; j < denominator.length; j++) {
                if (denominator[j] % denominator[i] == 0) {
                    digitArray[i] = denominator[j];
                }
            }
        }
        return digitArray;
    }

    // Находим наименьшее общее кратное(НОК) для знаменателей.

    static int findNOK(int[] digitArray, int nok) {
        for (int i = 0; i < digitArray.length; i++) {
            int count = 0;
            for (int j = 0; j < digitArray.length; j++) {
                if (digitArray[j] % digitArray[i] == 0) {
                    count++;
                }
                if (count > 1) {
                    digitArray[i] = 1;
                }
            }
            nok *= digitArray[i];
        }
        return nok;
    }

    // Приводим все знаменатели к НОК.

    static int[] toAllDenominator(int[] array, int nok) {
        for (int i = 0; i < array.length; i++) {
            array[i] = nok;
        }
        return array;
    }

    // Приводим числители в соответствие со своими знаменателями.

    static int[] numerators(int[] numerators, int[] denominatorClone, int nok) {
        for (int i = 0; i < numerators.length; i++) {
            int s = nok / denominatorClone[i];
            numerators[i] *= s;
        }
        return numerators;
    }
    // Выводим числители и знаменатели в порядке возрастания.

    static void printIncreasingOrder(int[] numerators, int nok) {
        System.out.println("Fractions in increasing order: ");
        for (int s : numerators) {
            System.out.print(s + "/" + nok + " ");
        }
    }
}
