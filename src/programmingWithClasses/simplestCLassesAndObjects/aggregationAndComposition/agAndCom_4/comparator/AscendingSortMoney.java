package programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_4.comparator;

import programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_4.BankAccount;

import java.util.Comparator;

public class AscendingSortMoney implements Comparator<BankAccount> {
    public int compare(BankAccount one, BankAccount two) {
        return one.getAmountOfMoney() - two.getAmountOfMoney();
    }


}
