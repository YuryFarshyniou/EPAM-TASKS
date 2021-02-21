package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_2.by.yurachel.ag_and_com_2.entity;


public class Car {
    private final String brand;
    private final String mark;
    private Wheel wheels;
    private Engine engine;
    private final int maxAmountOfGasoline = 100;
    private int amountOfGasoline;
    private int amountOfCash;

    public Car(String brand, String mark, int amountOfGasoline, int amountOfCash, Wheel wheels, Engine engine) {
        this.brand = brand;
        this.mark = mark;
        this.amountOfGasoline = amountOfGasoline;
        if (amountOfGasoline > maxAmountOfGasoline) {
            this.amountOfGasoline = 0;
            System.out.println("Your current amount of gasoline is impossible.");
        }
        this.amountOfCash = amountOfCash;
        this.wheels = wheels;
        this.engine = engine;
    }

    public int getAmountOfCash() {
        return amountOfCash;
    }

    public void setAmountOfCash(int amountOfCash) {
        this.amountOfCash = amountOfCash;
    }

    public int getAmountOfGasoline() {
        return amountOfGasoline;
    }

    public void setAmountOfGasoline(int amountOfGasoline) {
        this.amountOfGasoline = amountOfGasoline;
    }

    public String getMark() {
        return mark;
    }


    public String getBrand() {
        return brand;
    }


    public Wheel getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Машина начинает движение.

    public void move() {
        if (engine.isStaring()) {
            System.out.println("The care is starting moving.");
        } else {
            engine.startEngine();
            System.out.println("The car is starting moving.");
        }
    }

    // Целые ли колеса.

    public void isNeedWheelRepair() {
        if (!wheels.getWhole()) {
            engine.stopEngine();
            System.out.println("Wheels are changing.");
            wheels.setWhole(true);
        } else {
            System.out.println("The wheels are whole. ");
        }
    }

    // Заправляемся.

    public void refuel() {
        if (this.amountOfGasoline < maxAmountOfGasoline) {
            System.out.println("Find a gas station.");
            System.out.println("Well,we found a gas station.");
            this.engine.stopEngine();
            System.out.println("Refuel.");
            this.amountOfCash -= 100;
            this.amountOfGasoline = maxAmountOfGasoline;
            move();
        } else {
            System.out.println("You already have a full tank.");
        }
    }

    @Override
    public String toString() {
        return "Car's information. " + "brand: " + brand + ", mark: " + mark +
                wheels + engine + ", maxAmountOfGasoline: " + maxAmountOfGasoline +
                ", amountOfGasoline: " + amountOfGasoline + ", amountOfCash: " + amountOfCash;
    }
}
