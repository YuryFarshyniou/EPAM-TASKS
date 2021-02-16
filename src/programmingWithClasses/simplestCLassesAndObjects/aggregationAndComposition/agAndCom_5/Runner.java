package programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        VoucherList list = new VoucherList();
        list.addVouchers();
        list.sort();
    }
}
