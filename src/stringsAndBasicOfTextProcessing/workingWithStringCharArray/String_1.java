package stringsAndBasicOfTextProcessing.workingWithStringCharArray;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.


import java.util.Arrays;

public class String_1 {
    public static void main(String[] args) {
        String[] variablesArray = {"camelCase", "freshApple", "coldBeer", "somethingInterestingForMe", "pineappleJuice", "poTatoSoup with bubbLeS"};
        System.out.println("Our initial array: " + Arrays.toString(variablesArray));

        // Определяем количество заглавных символов.

        for (int i = 0; i < variablesArray.length; i++) {
            char[] arr = variablesArray[i].toCharArray();
            int count = countOfUpperCase(arr);

            // Создаем новые массивы для преобразования в snake_case.

            char[] arr2 = new char[variablesArray[i].length() + count];
            char[] arr3 = new char[variablesArray[i].length() + count];
            for (int j = 0; j < arr2.length; j++) {
                if (j >= arr.length) break;
                arr2[j] = arr[j];
            }
            snakeCase(arr2, arr3);

            // Передаем новую строку в первоначальный массив.

            variablesArray[i] = String.valueOf(arr2);
        }
        System.out.println("Our array in camel_case: " + Arrays.toString(variablesArray));
    }


    // Находим количество заглавных символов.

    static int countOfUpperCase(char[] array) {
        int count = 0;
        for (char c : array) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }


    // Преобразуем в snake_case.

    static char[] snakeCase(char[] arr2, char[] arr3) {
        for (int j = 0; j < arr2.length; j++) {
            if (Character.isUpperCase(arr2[j])) {
                int k = j;
                while (k < arr2.length - 1) {
                    arr3[k + 1] = arr2[k];
                    k++;
                }

                // Вставляем в осободившееся место _ .

                while (k >= j) {
                    if (k == j) {
                        arr2[k] = '_';
                    } else {
                        arr2[k] = arr3[k];
                    }
                    k--;
                }
                arr2[j + 1] = Character.toLowerCase(arr2[j + 1]);
            }
        }
        return arr2;
    }
}


