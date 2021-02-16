package programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_4.comparator;

import programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_4.BankAccount;

import java.util.Comparator;

public class BooleanSortUnblocked implements Comparator<BankAccount> {
    public int compare(BankAccount one, BankAccount two) {

        return Boolean.toString(two.isAvailable()).compareTo(Boolean.toString(one.isAvailable()));
    }
}