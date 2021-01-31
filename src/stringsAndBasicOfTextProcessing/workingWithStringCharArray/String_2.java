package stringsAndBasicOfTextProcessing.workingWithStringCharArray;

// Замените в строке все вхождения 'word' на 'letter'.

public class String_2 {
    public static void main(String[] args) {
        String s = "I have one word and this word greatest than any other word.";

//        String regex = "word";
//        String st = s.replaceAll(regex, "letter");
//        System.out.println(st);

        System.out.println("Our initial string: " + s);
        char[] arr = s.toCharArray();
        String initialString = "word";
        String finalString = "letter";
        int differenceLength = finalString.length() - initialString.length();

        // Определяем колличество вхождений 'word'.


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'w' && arr[i + 3] == 'd') count++;
        }
        char[] letter = finalString.toCharArray();

        // Заполняем дополнительный массив.

        char[] arr2 = new char[arr.length + count * differenceLength];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        char[] arr3 = new char[arr.length + count * differenceLength];
        for (int i = 0; i < arr.length; i++) {

            // Заменяем строки.

            if (arr2[i] == 'w' && arr2[i + 3] == 'd') {
                int k = i;
                while (k < arr2.length) {
                    arr3[k] = arr2[k];
                    k++;
                }
                k = i;
                int c = 0;
                while (k <= k + 6 && c < letter.length) {
                    arr2[k] = letter[c];
                    c++;
                    k++;
                }
                while (k < arr2.length) {
                    arr2[k] = arr3[k - 2];
                    k++;
                }
            }
        }
        s = String.valueOf(arr2);
        System.out.println("Our string with replacements: " + s);
    }
}
