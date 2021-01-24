package Algorithmization.OneDimArraysSorts;

/* Сортировка вставками. Дана последовательность чисел a1, a2, ...an.Требуется переставить числа в порядке возрастания.
Делается это следующим образом.Пусть a1, a2,...,ai - упорядоченная последовательность,т.е a1 <=a2 <=...<=an.Берется сле
дующее число ai+1 и вставляется в последовательность так,что бы новая последовательность была тоже возрастающей.Процесс
производится до тех пор,пока все элементы от i+1 до n не будут перебраны.Примечание. Место помещения очередного элемента
в отсортированную часть производить с помощью двоичного поиска.Двоичный поиск оформить в виде отдельной функции.

 */


import java.util.Arrays;

public class OneDimArraysSorts_5 {
    public static void main(String[] args) {
        int[] arr = {23, 4, 7, 8, 14, 29, 17, 5, 36, 1};
        System.out.println("Our initial array: " + Arrays.toString(arr));
        search(arr);
        System.out.println("Our sorted array: " + Arrays.toString(arr));
    }


    static int[] search(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int x = i - 1;
            for (; x >= 0; x--) {
                if (value < array[x]) {
                    array[x + 1] = array[x];
                } else {
                    break;
                }
            }
            array[x + 1] = value;
        }
        return array;
    }
}
