package programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5.comparators;

import programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5.Voucher;

import java.util.Comparator;

public class AmountOfDaySort implements Comparator<Voucher> {

    public int compare(Voucher one, Voucher two) {
        return one.getAmountOfDay() - two.getAmountOfDay();
    }
}
