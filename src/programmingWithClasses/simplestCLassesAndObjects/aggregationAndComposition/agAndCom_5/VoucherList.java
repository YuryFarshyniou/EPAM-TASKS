package programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5;

import programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5.comparators.AmountOfDaySort;
import programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5.comparators.FoodSort;
import programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5.comparators.PriceSort;
import programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5.comparators.TransportSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VoucherList {
    ArrayList<Voucher> voucherList = new ArrayList<>();
    ArrayList<Voucher> newVoucherList = new ArrayList<>();
    TransportSort ts = new TransportSort();
    FoodSort fs = new FoodSort();
    AmountOfDaySort as = new AmountOfDaySort();
    PriceSort ps = new PriceSort();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Добавляем предложения .

    public void addVouchers() {
        voucherList.add(new Voucher("Rest", "Airplane", "Yes", 15, 1200));
        voucherList.add(new Voucher("Excursion", "Bus", "Yes", 5, 240));
        voucherList.add(new Voucher("Rest", "Airplane", "Yes", 10, 800));
        voucherList.add(new Voucher("Excursion", "Train", "No", 7, 320));
        voucherList.add(new Voucher("Treatment", "Bus", "Yes", 14, 900));
        voucherList.add(new Voucher("Rest", "Bus", "Yes", 7, 520));
        voucherList.add(new Voucher("Excursion", "Bus", "No", 5, 200));
        voucherList.add(new Voucher("Rest", "Airplane", "Yes", 10, 900));
        voucherList.add(new Voucher("Treatment", "Airplane", "Yes", 7, 550));
        voucherList.add(new Voucher("Rest", "Train", "Yes", 10, 640));
        voucherList.add(new Voucher("Excursion", "Airplane", "Yes", 10, 510));
        voucherList.add(new Voucher("Rest", "Train", "Yes", 9, 560));
        voucherList.add(new Voucher("Shopping", "Airplane", "All inclusive", 10, 600));
        voucherList.add(new Voucher("Treatment", "Bus", "No", 2, 100));
        voucherList.add(new Voucher("Excursion", "Train", "Yes", 12, 640));
        voucherList.add(new Voucher("Shopping", "Bus", "No", 2, 120));
        voucherList.add(new Voucher("Shopping", "Train", "No", 3, 200));
        voucherList.add(new Voucher("Shopping", "Bus", "No", 3, 180));
        voucherList.add(new Voucher("Rest", "Bus", "Yes", 13, 870));
        voucherList.add(new Voucher("Rest", "Bus", "Yes", 7, 420));
        voucherList.add(new Voucher("Cruise", "Ship", "Yes", 9, 1560));
        voucherList.add(new Voucher("Cruise", "Ship", "Yes", 5, 1199));
    }

    // Ищем путевку мечты.

    public void sort() throws IOException {
        System.out.println("Our agency can offer you next types of services: Rest, Excursion, Treatment, Cruise, Shopping.");
        System.out.println("What do you want to choose?");
        String answer = reader.readLine();
        boolean isExist = false;

        // Первоначальная сортировка.

        for (Voucher voucher : this.voucherList) {
            if (answer.equalsIgnoreCase(voucher.getVoucherType())) {
                newVoucherList.add(voucher);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("You chose wrong answer.Try again.");
            return;
        }
        showVouchers();

        // Более детальная сортировка.

        while (true) {
            System.out.println("Do you want to sort your vouchers again?(yes//no)");
            String answers = reader.readLine();

            // Нужна ли дополнительная сортировка?

            if (answers.equalsIgnoreCase("yes")) {
                System.out.println("Do you want to sort by transport,food,days or price?");
                String answer2 = reader.readLine();
                if (answer2.equalsIgnoreCase("transport")) {
                    this.newVoucherList.sort(ts);
                } else if (answer2.equalsIgnoreCase("food")) {
                    this.newVoucherList.sort(fs);
                } else if (answer2.equalsIgnoreCase("days")) {
                    this.newVoucherList.sort(as);
                } else if (answer2.equalsIgnoreCase("price")) {
                    this.newVoucherList.sort(ps);
                } else {
                    System.out.println("Wrong option.Try again.");
                }

                // Если не нужна дополнительная сортировка.

            } else if (answers.equalsIgnoreCase("no")) {
                System.out.println("Please, choose the number of voucher.");
                int voucherNumber = Integer.parseInt(reader.readLine());
                System.out.println("Your voucher is " + newVoucherList.get(voucherNumber - 1));
                System.out.println("Our congratulations! Good choice! Come again!");
                return;
            }
            showVouchers();
        }
    }

    // Выводим список путевок по интересам.

    public void showVouchers() {
        for (int i = 0; i < newVoucherList.size(); i++) {
            System.out.println((i + 1) + "  " + newVoucherList.get(i));
        }
    }
}
