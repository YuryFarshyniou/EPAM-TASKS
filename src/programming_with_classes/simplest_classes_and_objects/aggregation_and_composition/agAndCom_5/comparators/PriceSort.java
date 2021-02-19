package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_5.comparators;

import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_5.Voucher;

import java.util.Comparator;

public class PriceSort implements Comparator<Voucher> {

    public int compare(Voucher one, Voucher two) {
        return one.getPrice() - two.getPrice();
    }
}
