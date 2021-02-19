package programming_with_classes.simplest_classes_and_objects.classes_5.main;

import programming_with_classes.simplest_classes_and_objects.classes_5.entity.Counter;

public class CounterRunner {
    public static void main(String[] args) {
        System.out.println("If our counter initialized by default. ");
        Counter defaultCounter = new Counter();
        System.out.println("Initial counter: " + defaultCounter.showCounter());
        for (int i = 0; i < 6; i++) {
            defaultCounter.increasing();
        }
        System.out.println("Counter after increasing: " + defaultCounter.showCounter());
        defaultCounter.decreasing();
        System.out.println("Counter after decreasing: " + defaultCounter.showCounter());

        System.out.println("\n******************************\n");

        System.out.println("Arbitrary counter. ");
        Counter arbitraryCounter = new Counter(6,20,9);
        System.out.println("Initial counter: " + arbitraryCounter.showCounter());
        for (int i = 0; i < 12; i++) {
            arbitraryCounter.increasing();
        }
        System.out.println("Counter after increasing: " + arbitraryCounter.showCounter());
        arbitraryCounter.decreasing();
        System.out.println("Counter after decreasing: " + arbitraryCounter.showCounter());

    }
}
