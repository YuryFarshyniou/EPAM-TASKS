package programmingWithClasses.simplestCLassesAndObjects.Classes_3;

/* Создайте класс с именем Student, содержащий поля:
фамилия и инициалы,номер группы,успеваемость(массив
из пяти элементов).Создайте массив из десяти элементов
такого типа.Добавьте возможность вывода фамилий и номеров
групп студентов,имеющих оценки, равные только 9 или 10. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        Student[] arr = new Student[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            System.out.println("Enter the student's last name: ");
            arr[i].lastName = reader.readLine();
            System.out.println("Enter the " + arr[i].lastName + " initial: ");
            arr[i].initials = reader.readLine();
            System.out.println("Enter the " + arr[i].lastName + " group: ");
            arr[i].groupNumber = Integer.parseInt(reader.readLine());
            System.out.println("Enter the " + arr[i].lastName + " appraisals: ");
            arr[i].academicPerformance = new int[2];
            for (int j = 0; j < arr[i].academicPerformance.length; j++) {
                arr[i].academicPerformance[j] = Integer.parseInt(reader.readLine());
            }
        }

        for (Student student : arr) {
            boolean appraisal = true;
            for (int j = 0; j < student.academicPerformance.length; j++) {
                if (student.academicPerformance[j] < 9) {
                    appraisal = false;
                    break;
                }
            }
            if (appraisal) {
                System.out.println("Last name of our smart man is: " + student.lastName +
                        " and his group is " + student.groupNumber);
            }
        }
    }
}
