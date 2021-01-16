package BasicOfSoftwareCodeDevelopment;
/*  Дано натуральное число Т, которое представляет длитльность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSс. */

import java.util.*;

public class Linear_Programs_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter equil of seconds");
        int y = sc.nextInt();

        int z = y / 3600;

        int x = (y - (z * 3600)) / 60;

        int a = y - (z * 3600 + x * 60);
        System.out.println(z + " h " + x + " min " + a + " c ");

    }

}
