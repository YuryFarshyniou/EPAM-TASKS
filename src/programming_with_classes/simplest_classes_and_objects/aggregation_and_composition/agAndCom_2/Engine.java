package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_2;

public class Engine {
    private final double capacity;
    private boolean isStaring;

    public Engine(double capacity, boolean isStaring) {
        this.capacity = capacity;
        this.isStaring = isStaring;
    }

    public double getCapacity() {
        return capacity;
    }

    // Заведен двигатель или нет.

    public boolean getIsStaring() {
        return isStaring;
    }

    public void setIsStaring(boolean staring) {
        isStaring = staring;
    }

    // Заводим двигатель.

    public void startEngine() {
        if (!this.isStaring) {
            System.out.println("The engine is starting.");
            this.isStaring = true;
        } else {
            System.out.println("The engine has already start");
        }
    }

    // Останавливаем двигатель.

    public void stopEngine() {
        if (this.isStaring) {
            System.out.println("The engine is stopping.");
            this.isStaring = false;
        } else {
            System.out.println("The engine has already stop.");
        }
    }
}
