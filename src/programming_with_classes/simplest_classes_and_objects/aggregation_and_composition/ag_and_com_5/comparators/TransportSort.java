package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.comparators;

import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.by.yurachel.ag_and_com_5.entity.Voucher;

import java.util.Comparator;

public class TransportSort implements Comparator<Voucher> {

    public int compare(Voucher one, Voucher two) {
        return one.getTransport().compareTo(two.getTransport());
    }
}
