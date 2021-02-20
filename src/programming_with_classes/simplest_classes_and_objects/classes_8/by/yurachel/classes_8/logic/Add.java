package programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.logic;

import programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.entity.Customer;

import java.math.BigInteger;
import java.util.List;

public class Add {

    // Добавляем клиента.

    public void addCustomers(List<Customer> customerList, int id, String lastName, String name,
                             String patronymic, String address, BigInteger creditCardNumber, BigInteger bankAccountNumber) {
        customerList.add(new Customer(id, lastName, name, patronymic, address, creditCardNumber, bankAccountNumber));
    }
}
