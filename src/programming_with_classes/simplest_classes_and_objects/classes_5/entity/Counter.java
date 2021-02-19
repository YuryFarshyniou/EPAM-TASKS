package programming_with_classes.simplest_classes_and_objects.classes_5.entity;



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

    public Counter() {
        this.minRange = 0;
        this.maxRange = 10;
        this.count = 0;
    }
    // Конструктор для произвольных значений.

    public Counter(int minRange, int maxRange, int count) {
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

    public void increasing() {
        count++;
        if (getCount() > getMaxRange()) count = getMinRange();

    }

    public void decreasing() {
        count--;
        if (getCount() < getMinRange()) count = getMaxRange();
    }

    //Текущее состояние счетчика.

   public  int showCounter() {
        return getCount();
    }

}
