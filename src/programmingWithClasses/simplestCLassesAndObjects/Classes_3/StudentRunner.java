package programmingWithClasses.simplestCLassesAndObjects.Classes_3;

/* Создайте класс с именем Student, содержащий поля:
фамилия и инициалы,номер группы,успеваемость(массив
из пяти элементов).Создайте массив из десяти элементов
такого типа.Добавьте возможность вывода фамилий и номеров
групп студентов,имеющих оценки, равные только 9 или 10. */

import java.io.IOException;

public class StudentRunner {
    public static void main(String[] args) throws IOException {
        Student st = new Student();
        System.out.println("Please, enter information about children: ");
        Student[]students = st.studentsList();

        System.out.println("Do you want to know our smartest students?");
        st.studentAppraisal(students);

    }
}
