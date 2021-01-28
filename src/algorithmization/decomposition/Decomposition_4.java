package algorithmization.decomposition;

/* На плоскости заданы своими координатами n точек.Написать метод(методы),
определяющие,между какими из пар точек самое большое расстояние.Указание.
Координаты точек занести в массив. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Decomposition_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the amount of points: ");
        int n = Integer.parseInt(reader.readLine());
        int[][] dots = new int[n][2];
        for (int i = 0; i < dots.length; i++) {
            System.out.println("Enter the value of " + (i + 1) + " pair of points: ");
            for (int j = 0; j < dots[i].length; j++) {
                dots[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        System.out.println("Our points: " + Arrays.deepToString(dots));
        maxDistance(dots);
    }


    static void maxDistance(int[][] array) {
        double maxDistance = 0;
        int pointOne = 0;
        int pointTwo = 0;
        int count = 0;
        while (count < array.length - 1) {
            for (int i = count + 1; i < array.length; i++) {
                double firstOperation = Math.pow(array[i][0] - array[count][0], 2);
                double secondOperation = Math.pow(array[i][1] - array[count][1], 2);
                double distance = Math.sqrt(firstOperation + secondOperation);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    pointOne = count;
                    pointTwo = i;
                }
            }
            count++;
        }
        System.out.print("The max distance is: ");
        System.out.printf("%.2f", maxDistance);
        System.out.print(" between " + (pointOne + 1) + " point " + " and " + (pointTwo + 1) + " point");
    }
}
