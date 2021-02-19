package programming_with_classes.simplest_classes_and_objects.classes_1;

/* Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран
и методы изменения этих переменных. Добавьте метод, которых находит сумму
значений этих переменных,и метод, который находит наибольшее значение
 из этих двух переменных. */

public class Test_1 {
    static int firstVariable = 23;
    static int secondVariable = 45;

    static void output() {
        System.out.println("Our variables: " + firstVariable + " and " + secondVariable);
    }

    static void changeVariables() {
        firstVariable = (int) (Math.random() * 20);
        secondVariable = (int) (Math.random() * 30);
        System.out.println("Our  changed variables: " + firstVariable + " and " + secondVariable);
    }

    static int sumVariables() {

        return firstVariable + secondVariable;
    }

    static int maxVariable() {

        return (firstVariable > secondVariable) ? firstVariable : secondVariable;
    }

    public static void main(String[] args) {
        output();
        changeVariables();
        output();
        System.out.println("The sum is: " + sumVariables());
        System.out.println("The largest number is: " + maxVariable());

    }
}
