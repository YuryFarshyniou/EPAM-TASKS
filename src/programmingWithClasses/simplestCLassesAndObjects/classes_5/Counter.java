package programmingWithClasses.simplestCLassesAndObjects.classes_5;

/* Опишите класс, реализующий десятичный счетчик,который может увеличивать
или уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите
инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
получить его текущее состояние. Написать код, демонстрирующий все возможности
класса. */

public class Counter {


    private int minRange;
    private int maxRange;
    private int count;

    public int getMinRange() {
        return minRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // Конструктор для значений по умолчанию.

    Counter() {
        this.minRange = 0;
        this.maxRange = 10;
        this.count = 0;
    }
    // Конструктор для произвольных значений.

    Counter(int minRange, int maxRange, int count) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.count = count;
        if (minRange > maxRange) {
            int temp = this.maxRange;
            this.maxRange = this.minRange;
            this.minRange = temp;
        }
        if (this.count < this.minRange)
            this.count = this.minRange;
        if (this.count > this.maxRange)
            this.count = this.maxRange;

    }

    // Изменение состояния.

    void increasing() {
        count++;
        if (getCount() > getMaxRange()) count = getMinRange();

    }

    void decreasing() {
        count--;
        if (getCount() < getMinRange()) count = getMaxRange();
    }

    //Текущее состояние счетчика.

    int  showCounter() {
        return getCount();
    }

}
