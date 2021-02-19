package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_4.comparator;

import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_4.BankAccount;

import java.util.Comparator;

public class DescendingAccountSort implements Comparator<BankAccount> {

    public int compare(BankAccount one, BankAccount two) {
        return (int) (two.getBankAccountName() - one.getBankAccountName());
    }
}
