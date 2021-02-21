package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.by.yurachel.ag_and_com_5.entity;

import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.comparators.AmountOfDaySort;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.comparators.FoodSort;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.comparators.PriceSort;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.comparators.TransportSort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private List<Voucher> voucherList;
    private List<Voucher> voucherRecommendationList;

    {
        voucherList = new ArrayList<>();
        voucherRecommendationList = new ArrayList<>();
    }

    TransportSort ts = new TransportSort();
    FoodSort fs = new FoodSort();
    AmountOfDaySort as = new AmountOfDaySort();
    PriceSort ps = new PriceSort();

    public List<Voucher> getVoucherList() {
        return voucherList;
    }

    public void setVoucherList(List<Voucher> voucherList) {
        this.voucherList = voucherList;
    }

    public List<Voucher> getNewVoucherList() {
        return voucherRecommendationList;
    }

    public void setNewVoucherList(List<Voucher> newVoucherList) {
        this.voucherRecommendationList = newVoucherList;
    }

    // Добавляем предложения .

    public void addVoucher(String voucherType, String transport, String food, int amountOfDay, int price) {
        voucherList.add(new Voucher(voucherType, transport, food, amountOfDay, price));
    }

    // Выводим список предложений.

    public void showVouchers() {
        for (Voucher voucher : voucherList) {
            System.out.println(voucher);
        }
    }

    // Ищем путевку мечты.

    public void sort(String typeOfService) throws IOException {
        System.out.println("Our agency can offer you next types of services: Rest, Excursion, Treatment, Cruise, Shopping.");

        boolean isExist = false;

        // Первоначальная сортировка.

        for (Voucher voucher : this.voucherList) {
            if (typeOfService.equalsIgnoreCase(voucher.getVoucherType())) {
                voucherRecommendationList.add(voucher);
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
                    this.voucherRecommendationList.sort(ts);
                } else if (answer2.equalsIgnoreCase("food")) {
                    this.voucherRecommendationList.sort(fs);
                } else if (answer2.equalsIgnoreCase("days")) {
                    this.voucherRecommendationList.sort(as);
                } else if (answer2.equalsIgnoreCase("price")) {
                    this.voucherRecommendationList.sort(ps);
                } else {
                    System.out.println("Wrong option.Try again.");
                }

                // Если не нужна дополнительная сортировка.

            } else if (answers.equalsIgnoreCase("no")) {
                System.out.println("Please, choose the number of voucher.");
                int voucherNumber = Integer.parseInt(reader.readLine());
                System.out.println("Your voucher is " + voucherRecommendationList.get(voucherNumber - 1));
                System.out.println("Our congratulations! Good choice! Come again!");
                return;
            }
            showVouchers();
        }
    }

    // Выводим список путевок по интересам.

//    public void showVouchers() {
//        for (int i = 0; i < newVoucherList.size(); i++) {
//            System.out.println((i + 1) + "  " + newVoucherList.get(i));
//        }
//    }
}
