package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_4.comparator;

import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_4.BankAccount;

import java.util.Comparator;

public class BooleanSort implements Comparator<BankAccount> {
    public int compare(BankAccount one, BankAccount two) {

        return Boolean.toString(one.isAvailable()).compareTo(Boolean.toString(two.isAvailable()));
    }
}
