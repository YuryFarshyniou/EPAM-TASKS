package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_2.by.yurachel.ag_and_com_2.entity;

public class Wheel {
    private int amountOfWheels;
    private boolean whole;

    public Wheel(int amountOfWheels, boolean isWhole) {
        this.amountOfWheels = amountOfWheels;
        this.whole = isWhole;

        // Если колеса не впорядке,проводим замену.

        if (!isWhole) {
            System.out.println("Changing wheels.");
            this.whole = true;
        }
    }

    public void setAmountOfWheels(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }

    // Целые колеса или нет.

    public boolean getWhole() {
        return whole;
    }

    public void setWhole(boolean whole) {
        this.whole = whole;
    }

    //Возвращаем количество колес.

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    @Override
    public String toString() {
        return " Wheels. " + "amountOfWheels: " + amountOfWheels + ", whole: " + whole;
    }
}
