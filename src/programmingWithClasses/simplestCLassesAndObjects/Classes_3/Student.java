package programmingWithClasses.simplestCLassesAndObjects.Classes_3;

/* Создайте класс с именем Student, содержащий поля:
фамилия и инициалы,номер группы,успеваемость(массив
из пяти элементов).Создайте массив из десяти элементов
такого типа.Добавьте возможность вывода фамилий и номеров
групп студентов,имеющих оценки, равные только 9 или 10. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {

    // Обьявляем поля класса

    private String lastName;
    private String initials;
    private int groupNumber;
    private int[] academicPerformance;

    // Геттеры и сеттеры для полей.

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }


    // Инициализируем массив.

     Student[] studentsList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Student[] arr = new Student[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            System.out.println("Enter the student's last name: ");
            arr[i].setLastName(reader.readLine());
            System.out.println("Enter the " + arr[i].lastName + " initial: ");
            arr[i].setInitials(reader.readLine());
            System.out.println("Enter the " + arr[i].lastName + " group: ");
            arr[i].setGroupNumber(Integer.parseInt(reader.readLine()));
            System.out.println("Enter the " + arr[i].lastName + " appraisals: ");
            arr[i].setAcademicPerformance(new int[5]);
            for (int j = 0; j < arr[i].academicPerformance.length; j++) {
                arr[i].academicPerformance[j] = Integer.parseInt(reader.readLine());
            }
        }
        return arr;
    }

    // Смотрим оценки студентов.

     void studentAppraisal(Student[] arr) {

        for (Student student : arr) {
            boolean appraisal = true;
            for (int j = 0; j < student.academicPerformance.length; j++) {
                if (student.academicPerformance[j] < 9) {
                    appraisal = false;
                    break;
                }
            }
            if (appraisal) {
                System.out.println("Last name of our smart man is: " + student.getLastName() +
                        " and he is in the " + student.getGroupNumber() + " group.");
            }
        }
    }
}
