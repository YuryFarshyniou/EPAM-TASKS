package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_5;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        VoucherList list = new VoucherList();
        list.addVouchers();
        list.sort();
    }
}
