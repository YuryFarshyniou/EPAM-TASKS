package algorithmization.oneDimensionalArrays;

// Задана последовательность N вещественных чисел.Вычислить сумму чисел,порядковые номера которых являются простыми числами.

public class One_Dimensional_Arrays_6 {
    public static void main(String[] args) {
        double sum = 0;
        double[] arr = {2.0, 10.0, 3.45, 6.78, 5.0, 9.64, 17.0, 100.0, 100.0023};
		for (double v : arr) {
			if (v % 1 == 0) {
				System.out.println(v);
				sum += v;
			}
		}
        System.out.println("Sum is: " + sum);

    }

}
