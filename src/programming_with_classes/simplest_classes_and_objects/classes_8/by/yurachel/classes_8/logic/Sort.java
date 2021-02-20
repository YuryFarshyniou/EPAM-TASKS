package programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.logic;

import programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.entity.Customer;

import java.util.List;

public class Sort {


    // Сортируем пофамильно по алфавиту.

    public void alphabeticSort(List<Customer> customers, String order) {
        if (order.equalsIgnoreCase("Ascending")) {
            customers.sort((customer1, customer2) -> customer1.getLastName().compareTo(customer2.getLastName()));
        } else if (order.equalsIgnoreCase("Descending")) {
            customers.sort((customer1, customer2) -> customer2.getLastName().compareTo(customer1.getLastName()));

        }
    }


}
