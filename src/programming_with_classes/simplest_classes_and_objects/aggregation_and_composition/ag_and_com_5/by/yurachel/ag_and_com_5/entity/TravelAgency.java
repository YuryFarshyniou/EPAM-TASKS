package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_5.by.yurachel.ag_and_com_5.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private List<Voucher> voucherList;
    private List<Voucher> voucherRecommendationList;

    {
        voucherList = new ArrayList<>();
        voucherRecommendationList = new ArrayList<>();
    }

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

    public void sort() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Our agency can offer you next types of services: Rest, Excursion, Treatment, Cruise, Shopping.");
        System.out.println("What do you want to choose?");
        String answer = reader.readLine();
        boolean isExist = false;

        // Первоначальная сортировка.

        for (Voucher voucher : this.voucherList) {
            if (answer.equalsIgnoreCase(voucher.getVoucherType())) {
                voucherRecommendationList.add(voucher);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("You chose wrong answer.Try again.");
            return;
        }
        showRecommendationVouchers();

        // Более детальная сортировка.

        while (true) {
            System.out.println("Do you want to sort your vouchers again?(yes//no)");
            String answers = reader.readLine();

            // Нужна ли дополнительная сортировка?

            if (answers.equalsIgnoreCase("yes")) {
                System.out.println("Do you want to sort by transport,food,days or price?");
                String answer2 = reader.readLine();
                if (answer2.equalsIgnoreCase("transport")) {
                    this.voucherRecommendationList.sort((voucher1, voucher2) -> voucher1.getTransport().compareTo(voucher2.getTransport()));
                } else if (answer2.equalsIgnoreCase("food")) {
                    this.voucherRecommendationList.sort((voucher1, voucher2) -> voucher1.getFood().compareTo(voucher2.getFood()));
                } else if (answer2.equalsIgnoreCase("days")) {
                    this.voucherRecommendationList.sort((voucher1, voucher2) -> voucher1.getAmountOfDay() - (voucher2.getAmountOfDay()));
                } else if (answer2.equalsIgnoreCase("price")) {
                    this.voucherRecommendationList.sort((voucher1, voucher2) -> voucher1.getPrice() - voucher2.getPrice());
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
            showRecommendationVouchers();
        }
    }

    // Выводим список путевок по интересам.

    public void showRecommendationVouchers() {
        for (int i = 0; i < voucherRecommendationList.size(); i++) {
            System.out.println((i + 1) + "  " + voucherRecommendationList.get(i));
        }
    }
}
