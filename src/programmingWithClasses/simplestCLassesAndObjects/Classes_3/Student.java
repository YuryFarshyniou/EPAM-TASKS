package programmingWithClasses.simplestCLassesAndObjects.Classes_3;

/* Создайте класс с именем Student, содержащий поля:
фамилия и инициалы,номер группы,успеваемость(массив
из пяти элементов).Создайте массив из десяти элементов
такого типа.Добавьте возможность вывода фамилий и номеров
групп студентов,имеющих оценки, равные только 9 или 10. */

public class Student {

    public String lastName;
    public String initials;
    public int groupNumber;
    public int[] academicPerformance;


//    Student(String lastName, String initials, int groupNumber, int[] academicPerformance) {
//    this.lastName = lastName;
//    this.initials = initials;
//    this.groupNumber = groupNumber;
//    this.academicPerformance = academicPerformance;
//    }


//    Student[] students() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Student[] students = new Student[1];
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("Enter the student's last name: ");
//            students[i].lastName = reader.readLine();
//            System.out.println("Enter the " + students[i].lastName + " initial: ");
//            students[i].initials = reader.readLine();
//            System.out.println("Enter the " + students[i].lastName + " group: ");
//            students[i].groupNumber = Integer.parseInt(reader.readLine());
//            System.out.println("Enter the " + students[i].lastName + " appraisals: ");
//            students[i].academicPerformance = new int[5];
//            for (int j = 0; j < students[i].academicPerformance.length; j++) {
//                students[i].academicPerformance[j] = Integer.parseInt(reader.readLine());
//            }
//        }
//        return students;
//    }
}
