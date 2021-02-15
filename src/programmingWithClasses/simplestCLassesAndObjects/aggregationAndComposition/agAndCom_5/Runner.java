package programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5;

public class Runner {
    public static void main(String[] args) {
        VoucherList list = new VoucherList();
        list.addVouchers();
        for (Voucher voucher : list.voucherList) {
            System.out.println(voucher);
        }
    }
}
