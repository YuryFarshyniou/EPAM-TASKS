package programming_with_classes.simplest_classes_and_objects.classes_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class CustomersList implements Comparator<Customer> {
    ArrayList<Customer> customers = new ArrayList<>();

    // Добавляем клиента.

    void addCustomers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many customers do you want to add? ");
        int number = Integer.parseInt(reader.readLine());
        if (number <= 0) return;
        for (int i = 0; i < number; i++) {
            customers.add(new Customer());
        }
    }

    // Выводим список клиентов на консоль.

    void show(ArrayList<Customer> list) {
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    // Сортируем пофамильно по алфавиту.

    void alphabeticSort(ArrayList<Customer> customers) {
        customers.sort(this);
    }

    // Переопределение метода compare интерфейса Comparator

    public int compare(Customer one, Customer two) {
        return one.getLastName().compareTo(two.getLastName());
    }

    // Выводим покупателей по интервалу карт.

    void customersIntervalCards(long minInterval, long maxInterval) {
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() > minInterval && customer.getCreditCardNumber() < maxInterval) {
                System.out.println(customer);
            }
        }
    }
}
