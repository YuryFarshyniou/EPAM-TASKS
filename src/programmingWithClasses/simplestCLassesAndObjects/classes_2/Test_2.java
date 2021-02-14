package programmingWithClasses.simplestCLassesAndObjects.classes_2;

/* Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор,инициализирующий члены класса по умолчанию.Добавьте set- и get- методы
для полей экземпляра класса. */

public class Test_2 {
    private int firstVariable;
    private int secondVariable;

    Test_2(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public int getFirstVariable() {
        return firstVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }
}
