package basic_of_oop.basic_of_oop_2.by.yurachel.basic_of_oop_2.main;

import basic_of_oop.basic_of_oop_2.by.yurachel.basic_of_oop_2.entity.Payment;

public class Main {
    public static void main(String[] args) throws Exception {

        Payment p = new Payment();
        p.setCustomer("Yura", "BelGazPromBank", true, 5000);
        p.isSupportingBank();   // Поддерживает ли оплата этого банка.
        p.addPurchase("PS5", 700);  // Добавляем покупки.
        p.addPurchase("Sofa", 300);
        p.showPurchases(); // Выводим список покупок.
        p.payment(); // Оплачиваем.

        System.out.println(p.getCustomer());
    }
}
