package Algorithmization.OneDimensionalArrays;
/* Даны действительные числа a1, a2, ..., an.Найти:
max( a1 + a2n, a2 + a2n-1,...,an + an+1.
 */
import java.util.Arrays;

public class One_Dimensional_Arrays_7 {
    public static void main(String[] args) {
        float [] arr = {19.0f,11.0f,5.67f,16.2f,78.9f,13.2f,64.78f,15.654f};
        float[] arr2 = new float [4];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]= arr[i] + (arr[arr.length-i-1]);
            if(i==3){
                break;
            }
        }
        Arrays.sort(arr2);
        System.out.println(arr2[3]);
    }
}
