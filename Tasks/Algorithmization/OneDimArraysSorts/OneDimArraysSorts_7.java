package Algorithmization.OneDimArraysSorts;

/* Пусть даны две неубывающие последовательности чисел a1 <=a2 <=...<=an and b1 <= b2 <=...<=bm
Требуется указать те места,на которые нужно вставлять элементы последовательности b1<= b2<=...<=bm
в первую последовательность так,что бы новая последовательность оставалась возрастающей. */


import java.util.Arrays;

public class OneDimArraysSorts_7 {
    public static void main(String[] args) {
        int [] arr1 = {1,3,5,7,9,11,13};
        int [] arr2 = {2,4,6,8,10,12,14,16};
        int [] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i]<arr2[i]){

            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
