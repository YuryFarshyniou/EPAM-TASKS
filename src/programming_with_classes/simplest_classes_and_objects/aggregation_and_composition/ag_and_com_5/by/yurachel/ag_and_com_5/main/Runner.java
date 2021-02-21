package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.by.yurachel.ag_and_com_5.main;

import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.by.yurachel.ag_and_com_5.entity.TravelAgency;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.by.yurachel.ag_and_com_5.entity.Voucher;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        TravelAgency list = new TravelAgency();

        list.addVoucher("Rest", "Airplane", "Yes", 15, 1200);
        list.addVoucher("Excursion", "Bus", "Yes", 5, 240);
        list.addVoucher("Rest", "Airplane", "Yes", 10, 800);
        list.addVoucher("Excursion", "Train", "No", 7, 320);
        list.addVoucher("Treatment", "Bus", "Yes", 14, 900);
        list.addVoucher("Rest", "Bus", "Yes", 7, 520);
        list.addVoucher("Excursion", "Bus", "No", 5, 200);
        list.addVoucher("Rest", "Airplane", "Yes", 10, 900);
        list.addVoucher("Treatment", "Airplane", "Yes", 7, 550);
        list.addVoucher("Rest", "Train", "Yes", 10, 640);
        list.addVoucher("Excursion", "Airplane", "Yes", 10, 510);
        list.addVoucher("Rest", "Train", "Yes", 9, 560);
        list.addVoucher("Shopping", "Airplane", "All inclusive", 10, 600);
        list.addVoucher("Treatment", "Bus", "No", 2, 100);
        list.addVoucher("Excursion", "Train", "Yes", 12, 640);
        list.addVoucher("Shopping", "Bus", "No", 2, 120);
        list.addVoucher("Shopping", "Train", "No", 3, 200);
        list.addVoucher("Shopping", "Bus", "No", 3, 180);
        list.addVoucher("Rest", "Bus", "Yes", 13, 870);
        list.addVoucher("Rest", "Bus", "Yes", 7, 420);
        list.addVoucher("Cruise", "Ship", "Yes", 9, 1560);
        list.addVoucher("Cruise", "Ship", "Yes", 5, 1199);


        list.showVouchers();
//        list.sort();
    }
}
