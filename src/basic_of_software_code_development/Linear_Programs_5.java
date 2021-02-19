package basic_of_software_code_development;

/*  Дано натуральное число Т, которое представляет длитльность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSс. */

import java.util.Scanner;

public class Linear_Programs_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of seconds: ");
        int amountOfSec = sc.nextInt();
        int sec = amountOfSec % 60;
        int min = (amountOfSec - sec) / 60;
        int m = min % 60;
        int hour = (min - m) / 60;
        System.out.println(hour + " h " + m + " min " + sec + " c ");
    }
}
