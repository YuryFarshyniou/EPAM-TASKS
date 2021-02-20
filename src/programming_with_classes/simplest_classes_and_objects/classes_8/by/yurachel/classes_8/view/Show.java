package programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.view;

import programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.entity.Customer;

import java.math.BigInteger;
import java.util.List;

public class Show {
    // Выводим список клиентов на консоль.

    public void showCustomers(List<Customer> list) {
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    // Выводим покупателей по интервалу карт.

    public void customersIntervalCards(List<Customer> customers, long minInterval, long maxInterval) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber().compareTo(BigInteger.valueOf(minInterval)) > 0 &&
                    customer.getCreditCardNumber().compareTo(BigInteger.valueOf(maxInterval)) < 0) {
                System.out.println(customer);
            }
        }
    }
}
